package com.example.ptm.Controllers;

import com.example.ptm.Models.Pansement;
import com.example.ptm.Models.ParametresVitaux;
import com.example.ptm.Repository.ParametresVitauxRepository;
import com.example.ptm.Services.PansementService;
import com.example.ptm.Services.ParametresVitauxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ParametresVitauxController {
    @Autowired
    private ParametresVitauxService parametresVitauxService ;
    /*get all */
    @GetMapping(value = "/ParametresVitaux")
    public List<ParametresVitaux> listParametresVitaux(){
        return parametresVitauxService.findAll();
    }
    /*find by id*/
    @GetMapping(value="/ParametresVitaux/{id}")
    public Optional<ParametresVitaux> AfficherParametresVitaux(@PathVariable("id") Long id){
        return parametresVitauxService.findById(id);
    }
    /*post */
    @PostMapping(value = "/ParametresVitaux")
    public void addParametresVitaux(@RequestBody ParametresVitaux pv){
        parametresVitauxService.save(pv);
    }
    /*put */
    @PutMapping(value = "/ParametresVitaux/Update/{id}")
    public void updateParametresVitaux(@RequestBody ParametresVitaux pv,@PathVariable("id") Long id){
        pv.setId(id);
        parametresVitauxService.save(pv);
    }
    /* delete */
    @DeleteMapping(value = "/ParametresVitaux/Delete/{id}")
    public boolean deleteParametresVitaux(@PathVariable("id") Long id){
        parametresVitauxService.deleteById(id);
        return true;
    }
}
