package com.example.ptm.Controllers;

import com.example.ptm.Models.Médecin;
import com.example.ptm.Repository.M_decinRepository;
import com.example.ptm.Services.MédecinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MédecinController {
    @Autowired
    private MédecinService médecinService;
    /*get all */
    @GetMapping(value = "/Medecin")
    public List<Médecin> listMédecin(){
        return médecinService.findAll();
    }
    /*find by id*/
    @GetMapping(value="/Medecin/{id}")
    public Optional<Médecin> AfficherMedecin(@PathVariable("id") Long id){
        return médecinService.findById(id);
    }
   /*post */
   @PostMapping(value = "/Medecin")
   public void addMedecin(@RequestBody Médecin m){
       médecinService.save(m);
   }
   /*put */
    @PutMapping(value = "/Medecin/Update/{id}")
    public void updateMedecin(@RequestBody Médecin m,@PathVariable("id") Long id){
        m.setId(id);
        médecinService.save(m);
    }
    /* delete */
    @DeleteMapping(value = "/Medecin/Delete/{id}")
    public boolean deleteMedecin(@PathVariable("id") Long id){
        médecinService.deleteById(id);
        return true;
    }
}
