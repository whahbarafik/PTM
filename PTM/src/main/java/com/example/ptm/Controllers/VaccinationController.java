package com.example.ptm.Controllers;

import com.example.ptm.Models.Pansement;
import com.example.ptm.Models.Vaccination;
import com.example.ptm.Repository.VaccinationRepository;
import com.example.ptm.Services.PansementService;
import com.example.ptm.Services.VaccinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class VaccinationController {
    @Autowired
    private VaccinationService vaccinationService;
    /*get all */
    @GetMapping(value = "/Vaccination")
    public List<Vaccination> listVaccination(){
        return vaccinationService.findAll();
    }
    /*find by id*/
    @GetMapping(value="/Vaccination/{id}")
    public Optional<Vaccination> AfficherVaccination(@PathVariable("id") Long id){
        return vaccinationService.findById(id);
    }
    /*post */
    @PostMapping(value = "/Vaccination")
    public void addVaccination(@RequestBody Vaccination v){
        vaccinationService.save(v);
    }
    /*put */
    @PutMapping(value = "/vaccination/Update/{id}")
    public void updateVaccination(@RequestBody Vaccination v,@PathVariable("id") Long id){
        v.setId(id);
        vaccinationService.save(v);
    }
    /* delete */
    @DeleteMapping(value = "/Vaccination/Delete/{id}")
    public boolean deleteVaccination(@PathVariable("id") Long id){
        vaccinationService.deleteById(id);
        return true;
    }
}
