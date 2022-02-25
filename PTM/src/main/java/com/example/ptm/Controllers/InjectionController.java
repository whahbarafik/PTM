package com.example.ptm.Controllers;

import com.example.ptm.Models.Hospitalisation;
import com.example.ptm.Models.Injection;
import com.example.ptm.Repository.InjectionRepository;
import com.example.ptm.Services.HospitalisationService;
import com.example.ptm.Services.InjectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class InjectionController {
    @Autowired
    private InjectionService injectionService;
    /*get all */
    @GetMapping(value = "/Injection")
    public List<Injection> listInjection(){
        return injectionService.findAll();
    }
    /*find by id*/
    @GetMapping(value="/Injection/{id}")
    public Optional<Injection> AfficherInjection(@PathVariable("id") Long id){
        return injectionService.findById(id);
    }
    /*post */
    @PostMapping(value = "/Injection")
    public void addInjection(@RequestBody Injection i){
        injectionService.save(i);
    }
    /*put */
    @PutMapping(value = "/Injection/Update/{id}")
    public void updateInjection(@RequestBody Injection i,@PathVariable("id") Long id){
        i.setId(id);
        injectionService.save(i);
    }
    /* delete */
    @DeleteMapping(value = "/Injection/Delete/{id}")
    public boolean deleteInjection(@PathVariable("id") Long id){
        injectionService.deleteById(id);
        return true;
    }
}
