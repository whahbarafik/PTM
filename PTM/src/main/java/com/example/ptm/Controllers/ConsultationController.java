package com.example.ptm.Controllers;
import com.example.ptm.Models.Consultation;
import com.example.ptm.Repository.ConsultationRepository;
import com.example.ptm.Services.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
public class ConsultationController {
    @Autowired
    private ConsultationService consultationService;
    /*get all */
    @GetMapping(value = "/Consultation")
    public List<Consultation> listConsultation(){
        return consultationService.findAll();
    }
    /*find by id*/
    @GetMapping(value="/Consultation/{id}")
    public Optional<Consultation> AfficherConsultation(@PathVariable("id") Long id){
        return consultationService.findById(id);
    }
    /*post */
    @PostMapping(value = "/Consultation")
    public void addConsultation(@RequestBody Consultation c){
        consultationService.save(c);
    }
    /*put */
    @PutMapping(value = "/Consultation/Update/{id}")
    public void updateConsultation(@RequestBody Consultation c,@PathVariable("id") Long id){
        c.setId(id);
        consultationService.save(c);
    }
    /* delete */
    @DeleteMapping(value = "/Consultation/Delete/{id}")
    public boolean deleteConsultation(@PathVariable("id") Long id){
        consultationService.deleteById(id);
        return true;
    }
}
