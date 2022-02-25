package com.example.ptm.Services;

import com.example.ptm.Models.Hospitalisation;
import com.example.ptm.Models.Pansement;
import com.example.ptm.Repository.HospitalisationRepository;
import com.example.ptm.Repository.PansementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PansementService {
    @Autowired
    private PansementRepository pansementRepository;
    public List<Pansement> findAll(){return pansementRepository.findAll();}
    public Optional<Pansement> findById (Long id){return pansementRepository.findById(id);}
    public Pansement save(Pansement pn){return pansementRepository.save(pn);}
    public void deleteById(Long id){pansementRepository.deleteById(id);}
}
