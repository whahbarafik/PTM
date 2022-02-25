package com.example.ptm.Repository;

import com.example.ptm.Models.Pansement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PansementRepository extends JpaRepository<Pansement,Long> {
    @Override
    List<Pansement> findAll();
}
