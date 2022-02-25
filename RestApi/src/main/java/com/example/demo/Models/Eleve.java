package com.example.demo.Models;

import javax.persistence.*;

@Entity
@Table
public class Eleve extends AbstractEntity{
    private Long numBac;
    private Long numCin;

    public Eleve() {
    }

    public Long getNumBac() {
        return numBac;
    }

    public void setNumBac(Long numBac) {
        numBac = numBac;
    }

    public Long getNumCin() {
        return numCin;
    }

    public void setNumCin(Long numCin) {
        numCin = numCin;
    }

    public Eleve(Long numBac, Long numCin) {
        numBac = numBac;
        numCin = numCin;
    }
}
