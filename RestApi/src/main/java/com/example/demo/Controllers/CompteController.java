package com.example.demo.Controllers;

import com.example.demo.Models.Compte;
import com.example.demo.Services.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CompteController {
    @Autowired
    private CompteService compteService;
    /*get all*/
    @GetMapping(value = "/Compte")
    public List<Compte> listAComptes() {
        return compteService.findAll();
    }

    /*get by id*/
    @GetMapping(value = "/Compte/{id}")
    public Optional<Compte> AfficherCompte(@PathVariable("id") Long id) {
        return compteService.findById(id);

    }
    @PostMapping(value = "/Compte")
    public void add(@RequestBody Compte c) {
        compteService.save(c);
    }


    @PutMapping(value = "/Compte/update/{id}")
    public void updateCompte(@RequestBody Compte c, @PathVariable("id") Long id) {

        c.setId(id);
        compteService.save(c);

    }
    @DeleteMapping(value="/Compte/delete/{id}")
    public boolean delete (@PathVariable("id") Long id){
        compteService.deleteById(id);
        return true;
    }
}