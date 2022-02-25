package com.example.ptm.Services;

import com.example.ptm.Models.Consultation;
import com.example.ptm.Repository.ConsultationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultationService {
    @Autowired
    private ConsultationRepository consultationRepository;
    public List<Consultation> findAll(){return consultationRepository.findAll();}
    public Optional<Consultation> findById (Long id){return consultationRepository.findById(id);}
    public Consultation save(Consultation c){return consultationRepository.save(c);}
    public void deleteById(Long id){consultationRepository.deleteById(id);}
}
