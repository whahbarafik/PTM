package com.example.ptm.Repository;


import com.example.ptm.Models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
@Override
List<Patient> findAll();
}
