package com.example.ptm.Controllers;

import com.example.ptm.Models.Pansement;
import com.example.ptm.Repository.PansementRepository;
import com.example.ptm.Services.PansementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PansementController {
    @Autowired
    private PansementService pansementService;
    /*get all */
    @GetMapping(value = "/Pansement")
    public List<Pansement> listPansement(){
        return pansementService.findAll();
    }
    /*find by id*/
    @GetMapping(value="/Pansement/{id}")
    public Optional<Pansement> AfficherPansement(@PathVariable("id") Long id){
        return pansementService.findById(id);
    }
    /*post */
    @PostMapping(value = "/Pansement")
    public void addPansement(@RequestBody Pansement pn){
        pansementService.save(pn);
    }
    /*put */
    @PutMapping(value = "/Pansement/Update/{id}")
    public void updatePansement(@RequestBody Pansement pn,@PathVariable("id") Long id){
        pn.setId(id);
        pansementService.save(pn);
    }
    /* delete */
    @DeleteMapping(value = "/Pansement/Delete/{id}")
    public boolean deletePansement(@PathVariable("id") Long id){
        pansementService.deleteById(id);
        return true;
    }
}
