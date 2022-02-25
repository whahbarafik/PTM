package com.example.ptm.Services;

import com.example.ptm.Models.Hospitalisation;
import com.example.ptm.Repository.HospitalisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalisationService {
    @Autowired
    private HospitalisationRepository hospitalisationRepository;
    public List<Hospitalisation> findAll(){return hospitalisationRepository.findAll();}
    public Optional<Hospitalisation> findById (Long id){return hospitalisationRepository.findById(id);}
    public Hospitalisation save(Hospitalisation h){return hospitalisationRepository.save(h);}
    public void deleteById(Long id){hospitalisationRepository.deleteById(id);}
}
