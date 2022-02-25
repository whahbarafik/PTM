package com.example.ptm.Services;

import com.example.ptm.Models.Hospitalisation;
import com.example.ptm.Models.Vaccination;
import com.example.ptm.Repository.HospitalisationRepository;
import com.example.ptm.Repository.VaccinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VaccinationService {
    @Autowired
    private VaccinationRepository vaccinationRepository;
    public List<Vaccination> findAll(){return vaccinationRepository.findAll();}
    public Optional<Vaccination> findById (Long id){return vaccinationRepository.findById(id);}
    public Vaccination save(Vaccination v){return vaccinationRepository.save(v);}
    public void deleteById(Long id){vaccinationRepository.deleteById(id);}
}
