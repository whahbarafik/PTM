package com.example.ptm.Services;

import com.example.ptm.Models.Injection;
import com.example.ptm.Repository.InjectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InjectionService {
    @Autowired
    private InjectionRepository injectionRepository;
    public List<Injection> findAll(){return injectionRepository.findAll();}
    public Optional<Injection> findById (Long id){return injectionRepository.findById(id);}
    public Injection save(Injection i){return injectionRepository.save(i);}
    public void deleteById(Long id){injectionRepository.deleteById(id);}
}
