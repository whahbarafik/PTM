package com.example.ptm.Repository;

import com.example.ptm.Models.ParametresVitaux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParametresVitauxRepository extends JpaRepository<ParametresVitaux,Long> {
    @Override
    List<ParametresVitaux> findAll();
}
