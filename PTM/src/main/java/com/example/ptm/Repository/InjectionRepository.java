package com.example.ptm.Repository;

import com.example.ptm.Models.Injection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InjectionRepository extends JpaRepository<Injection,Long> {
    @Override
    List<Injection> findAll();

}
