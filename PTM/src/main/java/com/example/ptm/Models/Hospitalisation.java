package com.example.ptm.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
public class Hospitalisation extends Abstract{
    public String Hopitale;
    public Date date;
    public String Urgence;
    public String Docteur;
    public String Service;
    public String MotifHospitalisation;
    public String ChefService;
    public Date DateIn;
    public Date DateOut;
    public String Diagnostic;
    public String RendezVous;
    public String Traitement;
    @ManyToOne
    private Patient patient;

    public Hospitalisation(String hopitale, Date date, String urgence, String docteur, String service, String motifHospitalisation, String chefService, Date dateIn, Date dateOut, String diagnostic, String rendezVous, String traitement, Patient patient) {
        Hopitale = hopitale;
        this.date = date;
        Urgence = urgence;
        Docteur = docteur;
        Service = service;
        MotifHospitalisation = motifHospitalisation;
        ChefService = chefService;
        DateIn = dateIn;
        DateOut = dateOut;
        Diagnostic = diagnostic;
        RendezVous = rendezVous;
        Traitement = traitement;
        this.patient = patient;
    }

    public Hospitalisation() {

    }

    public String getHopitale() {
        return Hopitale;
    }

    public void setHopitale(String hopitale) {
        Hopitale = hopitale;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUrgence() {
        return Urgence;
    }

    public void setUrgence(String urgence) {
        Urgence = urgence;
    }

    public String getDocteur() {
        return Docteur;
    }

    public void setDocteur(String docteur) {
        Docteur = docteur;
    }

    public String getService() {
        return Service;
    }

    public void setService(String service) {
        Service = service;
    }

    public String getMotifHospitalisation() {
        return MotifHospitalisation;
    }

    public void setMotifHospitalisation(String motifHospitalisation) {
        MotifHospitalisation = motifHospitalisation;
    }

    public String getChefService() {
        return ChefService;
    }

    public void setChefService(String chefService) {
        ChefService = chefService;
    }

    public Date getDateIn() {
        return DateIn;
    }

    public void setDateIn(Date dateIn) {
        DateIn = dateIn;
    }

    public Date getDateOut() {
        return DateOut;
    }

    public void setDateOut(Date dateOut) {
        DateOut = dateOut;
    }

    public String getDiagnostic() {
        return Diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        Diagnostic = diagnostic;
    }

    public String getRendezVous() {
        return RendezVous;
    }

    public void setRendezVous(String rendezVous) {
        RendezVous = rendezVous;
    }

    public String getTraitement() {
        return Traitement;
    }

    public void setTraitement(String traitement) {
        Traitement = traitement;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
