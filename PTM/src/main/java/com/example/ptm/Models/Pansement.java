package com.example.ptm.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
public class Pansement extends Abstract{
    public Date Date;
    public String Agent;
    public String Traitement;
    public int NbreChangement;
    public String OriginePlaie;
    public String ProfondeurPlaie;
    public String DimensionPlaie;
    public String CouleurPlaie;
    public String Odeur;
    public String Douleur;
    public Date DatePointSuture;
    public Date DateAblation;
    public String QualiteExsudat;
    public float QuantiteExsudat;
    @ManyToOne
    private Patient patient;

    public Pansement(java.util.Date date, String agent, String traitement, int nbreChangement, String originePlaie, String profondeurPlaie, String dimensionPlaie, String couleurPlaie, String odeur, String douleur, java.util.Date datePointSuture, java.util.Date dateAblation, String qualiteExsudat, float quantiteExsudat, Patient patient) {
        Date = date;
        Agent = agent;
        Traitement = traitement;
        NbreChangement = nbreChangement;
        OriginePlaie = originePlaie;
        ProfondeurPlaie = profondeurPlaie;
        DimensionPlaie = dimensionPlaie;
        CouleurPlaie = couleurPlaie;
        Odeur = odeur;
        Douleur = douleur;
        DatePointSuture = datePointSuture;
        DateAblation = dateAblation;
        QualiteExsudat = qualiteExsudat;
        QuantiteExsudat = quantiteExsudat;
        this.patient = patient;
    }

    public Pansement() {

    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public String getAgent() {
        return Agent;
    }

    public void setAgent(String agent) {
        Agent = agent;
    }

    public String getTraitement() {
        return Traitement;
    }

    public void setTraitement(String traitement) {
        Traitement = traitement;
    }

    public int getNbreChangement() {
        return NbreChangement;
    }

    public void setNbreChangement(int nbreChangement) {
        NbreChangement = nbreChangement;
    }

    public String getOriginePlaie() {
        return OriginePlaie;
    }

    public void setOriginePlaie(String originePlaie) {
        OriginePlaie = originePlaie;
    }

    public String getProfondeurPlaie() {
        return ProfondeurPlaie;
    }

    public void setProfondeurPlaie(String profondeurPlaie) {
        ProfondeurPlaie = profondeurPlaie;
    }

    public String getDimensionPlaie() {
        return DimensionPlaie;
    }

    public void setDimensionPlaie(String dimensionPlaie) {
        DimensionPlaie = dimensionPlaie;
    }

    public String getCouleurPlaie() {
        return CouleurPlaie;
    }

    public void setCouleurPlaie(String couleurPlaie) {
        CouleurPlaie = couleurPlaie;
    }

    public String getOdeur() {
        return Odeur;
    }

    public void setOdeur(String odeur) {
        Odeur = odeur;
    }

    public String getDouleur() {
        return Douleur;
    }

    public void setDouleur(String douleur) {
        Douleur = douleur;
    }

    public java.util.Date getDatePointSuture() {
        return DatePointSuture;
    }

    public void setDatePointSuture(java.util.Date datePointSuture) {
        DatePointSuture = datePointSuture;
    }

    public java.util.Date getDateAblation() {
        return DateAblation;
    }

    public void setDateAblation(java.util.Date dateAblation) {
        DateAblation = dateAblation;
    }

    public String getQualiteExsudat() {
        return QualiteExsudat;
    }

    public void setQualiteExsudat(String qualiteExsudat) {
        QualiteExsudat = qualiteExsudat;
    }

    public float getQuantiteExsudat() {
        return QuantiteExsudat;
    }

    public void setQuantiteExsudat(float quantiteExsudat) {
        QuantiteExsudat = quantiteExsudat;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
