package com.example.ptm.Repository;

import com.example.ptm.Models.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {
    @Override
    List<Admin> findAll();
}
