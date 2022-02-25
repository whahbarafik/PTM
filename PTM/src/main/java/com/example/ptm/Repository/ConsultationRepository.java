package com.example.ptm.Repository;

import com.example.ptm.Models.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsultationRepository extends JpaRepository<Consultation , Long> {
    @Override
    List<Consultation> findAll();
}
