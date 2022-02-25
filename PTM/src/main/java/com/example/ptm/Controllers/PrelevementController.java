package com.example.ptm.Controllers;

import com.example.ptm.Models.Pansement;
import com.example.ptm.Models.Prelevement;
import com.example.ptm.Repository.PrelevementRepository;
import com.example.ptm.Services.PansementService;
import com.example.ptm.Services.PrelevementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PrelevementController {
    @Autowired
    private PrelevementService prelevementService;
    /*get all */
    @GetMapping(value = "/Prelevement")
    public List<Prelevement> listPrelevement(){
        return prelevementService.findAll();
    }
    /*find by id*/
    @GetMapping(value="/Prelevement/{id}")
    public Optional<Prelevement> AfficherPrelevement(@PathVariable("id") Long id){
        return prelevementService.findById(id);
    }
    /*post */
    @PostMapping(value = "/Prelevement")
    public void addPrelevement(@RequestBody Prelevement pr){
        prelevementService.save(pr);
    }
    /*put */
    @PutMapping(value = "/Prelevement/Update/{id}")
    public void updatePrelevement(@RequestBody Prelevement pr,@PathVariable("id") Long id){
        pr.setId(id);
        prelevementService.save(pr);
    }
    /* delete */
    @DeleteMapping(value = "/Prelevement/Delete/{id}")
    public boolean deletePrelevement(@PathVariable("id") Long id){
        prelevementService.deleteById(id);
        return true;
    }
}
