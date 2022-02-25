package com.example.ptm.Repository;

import com.example.ptm.Models.Traitement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TraitementRepository extends JpaRepository<Traitement,Long> {
@Override
    List<Traitement> findAll();
}
