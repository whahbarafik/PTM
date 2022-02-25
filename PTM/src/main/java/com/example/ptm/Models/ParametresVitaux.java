package com.example.ptm.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
public class ParametresVitaux extends Abstract{
    public Date Date;
    public float Poid;
    public float Taille;
    public int TensionSystolique;
    public int TensionDiastolique;
    @ManyToOne
    private Patient patients;

    public ParametresVitaux(java.util.Date date, float poid, float taille, int tensionSystolique, int tensionDiastolique, Patient patients) {
        Date = date;
        Poid = poid;
        Taille = taille;
        TensionSystolique = tensionSystolique;
        TensionDiastolique = tensionDiastolique;
        this.patients = patients;
    }

    public ParametresVitaux() {

    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public float getPoid() {
        return Poid;
    }

    public void setPoid(float poid) {
        Poid = poid;
    }

    public float getTaille() {
        return Taille;
    }

    public void setTaille(float taille) {
        Taille = taille;
    }

    public int getTensionSystolique() {
        return TensionSystolique;
    }

    public void setTensionSystolique(int tensionSystolique) {
        TensionSystolique = tensionSystolique;
    }

    public int getTensionDiastolique() {
        return TensionDiastolique;
    }

    public void setTensionDiastolique(int tensionDiastolique) {
        TensionDiastolique = tensionDiastolique;
    }

    public Patient getPatients() {
        return patients;
    }

    public void setPatients(Patient patients) {
        this.patients = patients;
    }
}
