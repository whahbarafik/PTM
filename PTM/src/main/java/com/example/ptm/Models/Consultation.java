package com.example.ptm.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Table
@Entity
public class Consultation extends Abstract{

    public String Cabinet;
    public String Spetialite;
    public String InterventionCherigicale;
    public String Diagnostic;
    public String Traitement;
    public Date RendezVous;
    @JoinColumn
    @ManyToOne
    private Patient patient;

    public Consultation(String cabinet, String spetialite, String interventionCherigicale, String diagnostic, String traitement, Date rendezVous, Patient patient) {
        Cabinet = cabinet;
        Spetialite = spetialite;
        InterventionCherigicale = interventionCherigicale;
        Diagnostic = diagnostic;
        Traitement = traitement;
        RendezVous = rendezVous;
        this.patient = patient;
    }

    public Consultation() {

    }

    public String getCabinet() {
        return Cabinet;
    }

    public void setCabinet(String cabinet) {
        Cabinet = cabinet;
    }

    public String getSpetialite() {
        return Spetialite;
    }

    public void setSpetialite(String spetialite) {
        Spetialite = spetialite;
    }

    public String getInterventionCherigicale() {
        return InterventionCherigicale;
    }

    public void setInterventionCherigicale(String interventionCherigicale) {
        InterventionCherigicale = interventionCherigicale;
    }

    public String getDiagnostic() {
        return Diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        Diagnostic = diagnostic;
    }

    public String getTraitement() {
        return Traitement;
    }

    public void setTraitement(String traitement) {
        Traitement = traitement;
    }

    public Date getRendezVous() {
        return RendezVous;
    }

    public void setRendezVous(Date rendezVous) {
        RendezVous = rendezVous;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
