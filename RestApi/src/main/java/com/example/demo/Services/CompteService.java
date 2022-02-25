package com.example.demo.Services;

import com.example.demo.Models.Compte;
import com.example.demo.Repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompteService {
    @Autowired
    private CompteRepository compteRepository;
    public List<Compte> findAll() {
        return compteRepository.findAll();
    }

    public Optional<Compte> findById(Long id) {
        return compteRepository.findById(id);
    }

    public Compte save(Compte c) {
        return compteRepository.save(c);
    }

    public void deleteById(Long id) {
        compteRepository.deleteById(id);
    }
}

