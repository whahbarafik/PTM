package com.example.ptm.Controllers;

import com.example.ptm.Models.Hospitalisation;
import com.example.ptm.Models.Médecin;
import com.example.ptm.Repository.HospitalisationRepository;
import com.example.ptm.Services.HospitalisationService;
import com.example.ptm.Services.MédecinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HospitalisationController {
    @Autowired
    private HospitalisationService hospitalisationService;
    /*get all */
    @GetMapping(value = "/Hospitalisation")
    public List<Hospitalisation> listHospitalisation(){
        return hospitalisationService.findAll();
    }
    /*find by id*/
    @GetMapping(value="/Hospitalisation/{id}")
    public Optional<Hospitalisation> AfficherHospitalisation(@PathVariable("id") Long id){
        return hospitalisationService.findById(id);
    }
    /*post */
    @PostMapping(value = "/Hospitalisation")
    public void addHospitalisation(@RequestBody Hospitalisation h){
        hospitalisationService.save(h);
    }
    /*put */
    @PutMapping(value = "/Hospitalisation/Update/{id}")
    public void updateHospitalisation(@RequestBody Hospitalisation h,@PathVariable("id") Long id){
        h.setId(id);
        hospitalisationService.save(h);
    }
    /* delete */
    @DeleteMapping(value = "/Hospitalisation/Delete/{id}")
    public boolean deleteHospitalisation(@PathVariable("id") Long id){
        hospitalisationService.deleteById(id);
        return true;
    }
}
