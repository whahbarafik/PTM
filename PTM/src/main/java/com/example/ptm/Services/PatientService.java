package com.example.ptm.Services;

import com.example.ptm.Models.Patient;
import com.example.ptm.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;
    public List<Patient> findAll(){return patientRepository.findAll();}
    public Optional<Patient> findById(Long id){return patientRepository.findById(id);}
    public Patient save(Patient p){return patientRepository.save(p);}
    public void deleteById(Long id){patientRepository.deleteById(id);}

}
