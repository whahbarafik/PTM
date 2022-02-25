package com.example.ptm.Repository;


import com.example.ptm.Models.Prelevement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrelevementRepository extends JpaRepository<Prelevement,Long> {
    @Override
    List<Prelevement> findAll();
}
