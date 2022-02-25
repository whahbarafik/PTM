package com.example.ptm.Repository;

import com.example.ptm.Models.Technicien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TechnicienRepository extends JpaRepository<Technicien,Long> {
@Override
    List<Technicien> findAll();
}
