package com.example.ptm.Controllers;
import com.example.ptm.Models.Patient;
import com.example.ptm.Repository.PatientRepository;
import com.example.ptm.Services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
public class PatientController {
    @Autowired
    private PatientService patientService;
    /*get all */
    @GetMapping(value = "/Patient")
    public List<Patient> listPatient(){
        return patientService.findAll();
    }
    /*find by id*/
    @GetMapping(value="/Patient/{id}")
    public Optional<Patient> AfficherPatient(@PathVariable("id") Long id){
        return patientService.findById(id);
    }
    /*post */
    @PostMapping(value = "/Patient")
    public void addPatient(@RequestBody Patient p){
        patientService.save(p);
    }
    /*put */
    @PutMapping(value = "/Patient/Update/{id}")
    public void updatePatient(@RequestBody Patient p,@PathVariable("id") Long id){
        p.setId(id);
        patientService.save(p);
    }
    /* delete */
    @DeleteMapping(value = "/Patient/Delete/{id}")
    public boolean deletePatient(@PathVariable("id") Long id){
        patientService.deleteById(id);
        return true;
    }
}
