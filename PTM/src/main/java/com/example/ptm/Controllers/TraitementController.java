package com.example.ptm.Controllers;

import com.example.ptm.Models.Pansement;
import com.example.ptm.Models.Traitement;
import com.example.ptm.Repository.TraitementRepository;
import com.example.ptm.Services.PansementService;
import com.example.ptm.Services.TraitementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TraitementController {
    @Autowired
    private TraitementService traitementService;
    /*get all */
    @GetMapping(value = "/Traitement")
    public List<Traitement> listTraitement(){
        return traitementService.findAll();
    }
    /*find by id*/
    @GetMapping(value="/Traitement/{id}")
    public Optional<Traitement> AfficherTraitement(@PathVariable("id") Long id){
        return traitementService.findById(id);
    }
    /*post */
    @PostMapping(value = "/Traitement")
    public void addTraitement(@RequestBody Traitement tr){
        traitementService.save(tr);
    }
    /*put */
    @PutMapping(value = "/Traitement/Update/{id}")
    public void updateTraitement(@RequestBody Traitement tr,@PathVariable("id") Long id){
        tr.setId(id);
        traitementService.save(tr);
    }
    /* delete */
    @DeleteMapping(value = "/Traitement/Delete/{id}")
    public boolean deleteTraitement(@PathVariable("id") Long id){
        traitementService.deleteById(id);
        return true;
    }
}
