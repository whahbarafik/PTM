package com.example.ptm.Repository;

import com.example.ptm.Models.Médecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface M_decinRepository extends JpaRepository<Médecin,Long> {
    @Override
    List<Médecin> findAll();
}
