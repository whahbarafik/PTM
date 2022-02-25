package com.example.ptm.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Table(name = "patient")
@Entity
public class Patient extends Abstract{
    public String Nom;
    public String Prenom;
    @Column(nullable = false,length = 8)
    private int Cin;
    public String Email;
    @Column(nullable = false)
    public String Addresse;
    @Column(nullable = false)
    private String Pass;
    public Date DateNaiss;
    public String EtatCivil;
    public String Atcd;
    public String MaladieChronique;
    public String GroupeSanguin;
    public String Allergie;
    public String Covid;
    public int Tel;
    public int TelUrgent;
    @OneToMany
    private List<Consultation> consultation;
    @OneToMany
    private List<Hospitalisation> hospitalisations;
    @OneToMany
    private List<Injection> injections;
    @OneToMany
    private List<Pansement> pansements;
    @ManyToOne
    private Médecin médecins;
    @OneToMany
    private List<ParametresVitaux> parametresVitauxes;
    @OneToMany
    private List<Prelevement> prelevements;
    @OneToMany
    private List<Traitement> traitements;
    @OneToMany
    private List<Vaccination> vaccinations;

    public Patient(String pass) {
        Pass = pass;
    }

    public Patient(String nom, String prenom, int cin, String email, String addresse, Date dateNaiss, String etatCivil, String atcd, String maladieChronique, String groupeSanguin, String allergie, String covid, int tel, int telUrgent, List<Consultation> consultation, List<Hospitalisation> hospitalisations, List<Injection> injections, List<Pansement> pansements, Médecin médecins, List<ParametresVitaux> parametresVitauxes, List<Prelevement> prelevements, List<Traitement> traitements, List<Vaccination> vaccinations) {
        Nom = nom;
        Prenom = prenom;
        Cin = cin;
        Email = email;
        Addresse = addresse;
        DateNaiss = dateNaiss;
        EtatCivil = etatCivil;
        Atcd = atcd;
        MaladieChronique = maladieChronique;
        GroupeSanguin = groupeSanguin;
        Allergie = allergie;
        Covid = covid;
        Tel = tel;
        TelUrgent = telUrgent;
        this.consultation = consultation;
        this.hospitalisations = hospitalisations;
        this.injections = injections;
        this.pansements = pansements;
        this.médecins = médecins;
        this.parametresVitauxes = parametresVitauxes;
        this.prelevements = prelevements;
        this.traitements = traitements;
        this.vaccinations = vaccinations;
    }

    public Patient() {

    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public int getCin() {
        return Cin;
    }

    public void setCin(int cin) {
        Cin = cin;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddresse() {
        return Addresse;
    }

    public void setAddresse(String addresse) {
        Addresse = addresse;
    }

    public Date getDateNaiss() {
        return DateNaiss;
    }

    public void setDateNaiss(Date dateNaiss) {
        DateNaiss = dateNaiss;
    }

    public String getEtatCivil() {
        return EtatCivil;
    }

    public void setEtatCivil(String etatCivil) {
        EtatCivil = etatCivil;
    }

    public String getAtcd() {
        return Atcd;
    }

    public void setAtcd(String atcd) {
        Atcd = atcd;
    }

    public String getMaladieChronique() {
        return MaladieChronique;
    }

    public void setMaladieChronique(String maladieChronique) {
        MaladieChronique = maladieChronique;
    }

    public String getGroupeSanguin() {
        return GroupeSanguin;
    }

    public void setGroupeSanguin(String groupeSanguin) {
        GroupeSanguin = groupeSanguin;
    }

    public String getAllergie() {
        return Allergie;
    }

    public void setAllergie(String allergie) {
        Allergie = allergie;
    }

    public String getCovid() {
        return Covid;
    }

    public void setCovid(String covid) {
        Covid = covid;
    }

    public int getTel() {
        return Tel;
    }

    public void setTel(int tel) {
        Tel = tel;
    }

    public int getTelUrgent() {
        return TelUrgent;
    }

    public void setTelUrgent(int telUrgent) {
        TelUrgent = telUrgent;
    }

    public List<Consultation> getConsultation() {
        return consultation;
    }

    public void setConsultation(List<Consultation> consultation) {
        this.consultation = consultation;
    }

    public List<Hospitalisation> getHospitalisations() {
        return hospitalisations;
    }

    public void setHospitalisations(List<Hospitalisation> hospitalisations) {
        this.hospitalisations = hospitalisations;
    }

    public List<Injection> getInjections() {
        return injections;
    }

    public void setInjections(List<Injection> injections) {
        this.injections = injections;
    }

    public List<Pansement> getPansements() {
        return pansements;
    }

    public void setPansements(List<Pansement> pansements) {
        this.pansements = pansements;
    }

    public Médecin getMédecins() {
        return médecins;
    }

    public void setMédecins(Médecin médecins) {
        this.médecins = médecins;
    }

    public List<ParametresVitaux> getParametresVitauxes() {
        return parametresVitauxes;
    }

    public void setParametresVitauxes(List<ParametresVitaux> parametresVitauxes) {
        this.parametresVitauxes = parametresVitauxes;
    }

    public List<Prelevement> getPrelevements() {
        return prelevements;
    }

    public void setPrelevements(List<Prelevement> prelevements) {
        this.prelevements = prelevements;
    }

    public List<Traitement> getTraitements() {
        return traitements;
    }

    public void setTraitements(List<Traitement> traitements) {
        this.traitements = traitements;
    }

    public List<Vaccination> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List<Vaccination> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }
}
