package com.example.ptm.Services;

import com.example.ptm.Models.Hospitalisation;
import com.example.ptm.Models.Prelevement;
import com.example.ptm.Repository.HospitalisationRepository;
import com.example.ptm.Repository.PrelevementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrelevementService {
    @Autowired
    private PrelevementRepository prelevementRepository;
    public List<Prelevement> findAll(){return prelevementRepository.findAll();}
    public Optional<Prelevement> findById (Long id){return prelevementRepository.findById(id);}
    public Prelevement save(Prelevement pr){return prelevementRepository.save(pr);}
    public void deleteById(Long id){prelevementRepository.deleteById(id);}
}
