package com.example.demo.Repository;

import com.example.demo.Models.Eleve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EleveRepository extends JpaRepository<Eleve , Long> {
   @Override
   List<Eleve> findAll();
}
