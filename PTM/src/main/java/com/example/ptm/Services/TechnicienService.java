package com.example.ptm.Services;

import com.example.ptm.Models.Patient;
import com.example.ptm.Models.Technicien;
import com.example.ptm.Repository.PatientRepository;
import com.example.ptm.Repository.TechnicienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TechnicienService {
    @Autowired
    private TechnicienRepository technicienRepository;
    public List<Technicien> findAll(){return technicienRepository.findAll();}
    public Optional<Technicien> findById(Long id){return technicienRepository.findById(id);}
    public Technicien save(Technicien t){return technicienRepository.save(t);}
    public void deleteById(Long id){technicienRepository.deleteById(id);}

}
