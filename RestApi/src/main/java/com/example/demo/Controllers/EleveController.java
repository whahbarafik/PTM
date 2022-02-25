package com.example.demo.Controllers;
import com.example.demo.Models.Eleve;
import com.example.demo.Services.EleveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EleveController {
    @Autowired
    private EleveService service;
/*get all*/
    @GetMapping(value = "/Eleve")
    public List<Eleve> listEleve() {
        return service.findAll();
    }


    @GetMapping(value = "/Eleve/{id}")
    public Optional<Eleve> AfficherEleve(@PathVariable("id") Long id) {
        return service.findById(id);

    }

    @PostMapping(value = "/Eleve")
    public void add(@RequestBody Eleve eleve) {
        service.save(eleve);
    }


    @PutMapping(value = "/Eleve/update/{id}")
    public void updateEleve(@RequestBody Eleve e, @PathVariable("id") Long id) {
        e.setId(id);
        service.save(e);
    }
    @DeleteMapping(value="/Eleve/delete/{id}")
    public boolean delete (@PathVariable("id") Long id){
        service.deleteById(id);
        return true;
    }
}
