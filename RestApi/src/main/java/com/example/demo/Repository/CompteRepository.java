package com.example.demo.Repository;
import com.example.demo.Models.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CompteRepository extends JpaRepository<Compte , Long> {
    @Override
    List<Compte> findAll();
}
