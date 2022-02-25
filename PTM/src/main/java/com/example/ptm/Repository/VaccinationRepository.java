package com.example.ptm.Repository;

import com.example.ptm.Models.Vaccination;
import org.apache.catalina.LifecycleState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VaccinationRepository extends JpaRepository<Vaccination,Long> {
@Override
    List<Vaccination> findAll();
}
