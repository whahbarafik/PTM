package com.example.ptm.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
public class Vaccination extends Abstract{
    public String NomVaccin;
    public int NumDose;
    public Date DateInjection;
    public String VoieInjection;
    public int Poid;
    public int Taille;
    public String Agent;
    public String Observation;
    public Date DateProchaineDose;
    @ManyToOne
    private Patient patients;

    public Vaccination(String nomVaccin, int numDose, Date dateInjection, String voieInjection, int poid, int taille, String agent, String observation, Date dateProchaineDose, Patient patients) {
        NomVaccin = nomVaccin;
        NumDose = numDose;
        DateInjection = dateInjection;
        VoieInjection = voieInjection;
        Poid = poid;
        Taille = taille;
        Agent = agent;
        Observation = observation;
        DateProchaineDose = dateProchaineDose;
        this.patients = patients;
    }

    public Vaccination() {

    }

    public String getNomVaccin() {
        return NomVaccin;
    }

    public void setNomVaccin(String nomVaccin) {
        NomVaccin = nomVaccin;
    }

    public int getNumDose() {
        return NumDose;
    }

    public void setNumDose(int numDose) {
        NumDose = numDose;
    }

    public Date getDateInjection() {
        return DateInjection;
    }

    public void setDateInjection(Date dateInjection) {
        DateInjection = dateInjection;
    }

    public String getVoieInjection() {
        return VoieInjection;
    }

    public void setVoieInjection(String voieInjection) {
        VoieInjection = voieInjection;
    }

    public int getPoid() {
        return Poid;
    }

    public void setPoid(int poid) {
        Poid = poid;
    }

    public int getTaille() {
        return Taille;
    }

    public void setTaille(int taille) {
        Taille = taille;
    }

    public String getAgent() {
        return Agent;
    }

    public void setAgent(String agent) {
        Agent = agent;
    }

    public String getObservation() {
        return Observation;
    }

    public void setObservation(String observation) {
        Observation = observation;
    }

    public Date getDateProchaineDose() {
        return DateProchaineDose;
    }

    public void setDateProchaineDose(Date dateProchaineDose) {
        DateProchaineDose = dateProchaineDose;
    }

    public Patient getPatients() {
        return patients;
    }

    public void setPatients(Patient patients) {
        this.patients = patients;
    }
}
