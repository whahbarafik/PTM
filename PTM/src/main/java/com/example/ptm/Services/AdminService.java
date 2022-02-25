package com.example.ptm.Services;

import com.example.ptm.Models.Admin;
import com.example.ptm.Models.Consultation;
import com.example.ptm.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;
    public List<Admin> findAll(){return adminRepository.findAll();}
    public Optional<Admin> findById (Long id){return adminRepository.findById(id);}
    public Admin save(Admin a){return adminRepository.save(a);}
    public void deleteById(Long id){adminRepository.deleteById(id);}
}
