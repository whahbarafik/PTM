package com.example.demo.Services;

import com.example.demo.Models.Eleve;
import com.example.demo.Repository.EleveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EleveService {
    @Autowired
    private  EleveRepository eleveRepository;

    public List<Eleve> findAll() {
        return eleveRepository.findAll();
    }

    public Eleve save(Eleve eleve){
        return eleveRepository.save(eleve);
    }

    public Optional<Eleve> findById(Long id) {
        return eleveRepository.findById(id);
    }

    public void deleteById(Long id) {
        eleveRepository.deleteById(id);
    }
}
