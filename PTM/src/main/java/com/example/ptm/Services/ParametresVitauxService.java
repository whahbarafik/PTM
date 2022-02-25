package com.example.ptm.Services;

import com.example.ptm.Models.Hospitalisation;
import com.example.ptm.Models.ParametresVitaux;
import com.example.ptm.Repository.HospitalisationRepository;
import com.example.ptm.Repository.ParametresVitauxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParametresVitauxService {
    @Autowired
    private ParametresVitauxRepository parametresVitauxRepository;
    public List<ParametresVitaux> findAll(){return parametresVitauxRepository.findAll();}
    public Optional<ParametresVitaux> findById (Long id){return parametresVitauxRepository.findById(id);}
    public ParametresVitaux save(ParametresVitaux pv){return parametresVitauxRepository.save(pv);}
    public void deleteById(Long id){parametresVitauxRepository.deleteById(id);}
}
