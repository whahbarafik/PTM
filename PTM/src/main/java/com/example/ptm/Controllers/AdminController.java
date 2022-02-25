package com.example.ptm.Controllers;

import com.example.ptm.Models.Admin;
import com.example.ptm.Models.Consultation;
import com.example.ptm.Services.AdminService;
import com.example.ptm.Services.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;
    /*get all */
    @GetMapping(value = "/Boss")
    public List<Admin> listAdmin(){
        return adminService.findAll();
    }
    /*find by id*/
    @GetMapping(value="/Boss/{id}")
    public Optional<Admin> AfficherAdmin(@PathVariable("id") Long id){
        return adminService.findById(id);
    }
    /*post */
    @PostMapping(value = "/Boss")
    public void addAdmin(@RequestBody Admin a){
        adminService.save(a);
    }
    /*put */
    @PutMapping(value = "/Boss/Update/{id}")
    public void updateAdmin(@RequestBody Admin a,@PathVariable("id") Long id){
        a.setId(id);
        adminService.save(a);
    }
    /* delete */
    @DeleteMapping(value = "/Boss/Delete/{id}")
    public boolean deleteAdmin(@PathVariable("id") Long id){
        adminService.deleteById(id);
        return true;
    }
}
