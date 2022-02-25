package com.example.ptm.Controllers;

import com.example.ptm.Models.Patient;
import com.example.ptm.Models.Technicien;
import com.example.ptm.Repository.PatientRepository;
import com.example.ptm.Repository.TechnicienRepository;
import com.example.ptm.Services.TechnicienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TechnicienController {
    @Autowired
    private TechnicienRepository technicienRepository;
    /*get all */
    @GetMapping(value = "/Technicien")
    public List<Technicien> listTechnicien(){
        return technicienRepository.findAll();
    }
    /*find by id*/
    @GetMapping(value="/Technicien/{id}")
    public Optional<Technicien> AfficherTechnicien(@PathVariable("id") Long id){
        return technicienRepository.findById(id);
    }
    /*post */
    @PostMapping(value = "/Technicien")
    public void addPatient(@RequestBody Technicien t){
        technicienRepository.save(t);
    }
    /*put */
    @PutMapping(value = "/Technicien/Update/{id}")
    public void updateTechnicien(@RequestBody Technicien t,@PathVariable("id") Long id){
        t.setId(id);
        technicienRepository.save(t);
    }
    /* delete */
    @DeleteMapping(value = "/Technicien/Delete/{id}")
    public boolean deleteTechnicien(@PathVariable("id") Long id){
        technicienRepository.deleteById(id);
        return true;
    }
}

