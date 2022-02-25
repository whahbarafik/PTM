package com.example.ptm.Repository;

import com.example.ptm.Models.Hospitalisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HospitalisationRepository extends JpaRepository<Hospitalisation,Long> {
    @Override
    List <Hospitalisation> findAll();

}
