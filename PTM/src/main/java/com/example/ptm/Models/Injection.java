package com.example.ptm.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table

public class Injection extends Abstract{
    public Date Date;
    public String AgentTraitent;
    public String SubstanceInjecte;
    public String VoieAdministration;
    public float Dose;
    public String Observation;
    @ManyToOne
    private Patient patients;

    public Injection(java.util.Date date, String agentTraitent, String substanceInjecte, String voieAdministration, float dose, String observation, Patient patients) {
        Date = date;
        AgentTraitent = agentTraitent;
        SubstanceInjecte = substanceInjecte;
        VoieAdministration = voieAdministration;
        Dose = dose;
        Observation = observation;
        this.patients = patients;
    }

    public Injection() {

    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public String getAgentTraitent() {
        return AgentTraitent;
    }

    public void setAgentTraitent(String agentTraitent) {
        AgentTraitent = agentTraitent;
    }

    public String getSubstanceInjecte() {
        return SubstanceInjecte;
    }

    public void setSubstanceInjecte(String substanceInjecte) {
        SubstanceInjecte = substanceInjecte;
    }

    public String getVoieAdministration() {
        return VoieAdministration;
    }

    public void setVoieAdministration(String voieAdministration) {
        VoieAdministration = voieAdministration;
    }

    public float getDose() {
        return Dose;
    }

    public void setDose(float dose) {
        Dose = dose;
    }

    public String getObservation() {
        return Observation;
    }

    public void setObservation(String observation) {
        Observation = observation;
    }

    public Patient getPatients() {
        return patients;
    }

    public void setPatients(Patient patients) {
        this.patients = patients;
    }
}
