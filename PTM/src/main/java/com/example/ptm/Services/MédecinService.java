package com.example.ptm.Services;

import com.example.ptm.Models.Médecin;
import com.example.ptm.Repository.M_decinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MédecinService {
    @Autowired
    private M_decinRepository médecinRepository;
    public List<Médecin> findAll(){return médecinRepository.findAll();}
    public Optional<Médecin> findById(Long id){return médecinRepository.findById(id);}
    public Médecin save(Médecin m){return médecinRepository.save(m);}
    public void deleteById(Long id){médecinRepository.deleteById(id);}
}
