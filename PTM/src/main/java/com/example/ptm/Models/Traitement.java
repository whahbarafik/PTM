package com.example.ptm.Models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
public class Traitement extends Abstract{
    public String CentreTraitement;
    public java.util.Date Date;
    public String NomMedecin;
    @ManyToOne
    private Patient patients;

    public Traitement(String centreTraitement, java.util.Date date, String nomMedecin, Patient patients) {
        CentreTraitement = centreTraitement;
        Date = date;
        NomMedecin = nomMedecin;
        this.patients = patients;
    }

    public Traitement() {

    }

    public String getCentreTraitement() {
        return CentreTraitement;
    }

    public void setCentreTraitement(String centreTraitement) {
        CentreTraitement = centreTraitement;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public String getNomMedecin() {
        return NomMedecin;
    }

    public void setNomMedecin(String nomMedecin) {
        NomMedecin = nomMedecin;
    }

    public Patient getPatients() {
        return patients;
    }

    public void setPatients(Patient patients) {
        this.patients = patients;
    }
}
