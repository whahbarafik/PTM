package com.example.ptm.Services;

import com.example.ptm.Models.Hospitalisation;
import com.example.ptm.Models.Traitement;
import com.example.ptm.Repository.HospitalisationRepository;
import com.example.ptm.Repository.TraitementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TraitementService {
    @Autowired
    private TraitementRepository traitementRepository;
    public List<Traitement> findAll(){return traitementRepository.findAll();}
    public Optional<Traitement> findById (Long id){return traitementRepository.findById(id);}
    public Traitement save(Traitement tr){return traitementRepository.save(tr);}
    public void deleteById(Long id){traitementRepository.deleteById(id);}
}
