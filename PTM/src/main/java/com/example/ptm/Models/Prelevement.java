package com.example.ptm.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
public class Prelevement extends Abstract{
    public Date Date;
    public String NomPrescipteur;
    public String ServicePrescipteur;
    public String NomPreleveur;
    public String NaturePrelevement;
    public String NomExamen;
    public String EtatPatient;
    public String SitePrelevement;
    public int NbreTube;
    public String NotionUrgence;
    @ManyToOne
    private Patient patients;

    public Prelevement(java.util.Date date, String nomPrescipteur, String servicePrescipteur, String nomPreleveur, String naturePrelevement, String nomExamen, String etatPatient, String sitePrelevement, int nbreTube, String notionUrgence, Patient patients) {
        Date = date;
        NomPrescipteur = nomPrescipteur;
        ServicePrescipteur = servicePrescipteur;
        NomPreleveur = nomPreleveur;
        NaturePrelevement = naturePrelevement;
        NomExamen = nomExamen;
        EtatPatient = etatPatient;
        SitePrelevement = sitePrelevement;
        NbreTube = nbreTube;
        NotionUrgence = notionUrgence;
        this.patients = patients;
    }

    public Prelevement() {

    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public String getNomPrescipteur() {
        return NomPrescipteur;
    }

    public void setNomPrescipteur(String nomPrescipteur) {
        NomPrescipteur = nomPrescipteur;
    }

    public String getServicePrescipteur() {
        return ServicePrescipteur;
    }

    public void setServicePrescipteur(String servicePrescipteur) {
        ServicePrescipteur = servicePrescipteur;
    }

    public String getNomPreleveur() {
        return NomPreleveur;
    }

    public void setNomPreleveur(String nomPreleveur) {
        NomPreleveur = nomPreleveur;
    }

    public String getNaturePrelevement() {
        return NaturePrelevement;
    }

    public void setNaturePrelevement(String naturePrelevement) {
        NaturePrelevement = naturePrelevement;
    }

    public String getNomExamen() {
        return NomExamen;
    }

    public void setNomExamen(String nomExamen) {
        NomExamen = nomExamen;
    }

    public String getEtatPatient() {
        return EtatPatient;
    }

    public void setEtatPatient(String etatPatient) {
        EtatPatient = etatPatient;
    }

    public String getSitePrelevement() {
        return SitePrelevement;
    }

    public void setSitePrelevement(String sitePrelevement) {
        SitePrelevement = sitePrelevement;
    }

    public int getNbreTube() {
        return NbreTube;
    }

    public void setNbreTube(int nbreTube) {
        NbreTube = nbreTube;
    }

    public String getNotionUrgence() {
        return NotionUrgence;
    }

    public void setNotionUrgence(String notionUrgence) {
        NotionUrgence = notionUrgence;
    }

    public Patient getPatients() {
        return patients;
    }

    public void setPatients(Patient patients) {
        this.patients = patients;
    }
}
