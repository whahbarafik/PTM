package com.example.ptm.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table
public class Médecin extends Abstract {

    public String Nom;
    public String Prenom;
    public String ModeExecution;
    public String Email;
    public int Tel;
    public String Adresse;
    private String AddM;
    private String PassM;
    @OneToMany
    private List<Patient> patients;

    public Médecin(String nom, String prenom, String modeExecution, String email, int tel, String adresse, String addM, String passM, List<Patient> patients) {
        Nom = nom;
        Prenom = prenom;
        ModeExecution = modeExecution;
        Email = email;
        Tel = tel;
        Adresse = adresse;
        AddM = addM;
        PassM = passM;
        this.patients = patients;
    }

    public Médecin() {

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

    public String getModeExecution() {
        return ModeExecution;
    }

    public void setModeExecution(String modeExecution) {
        ModeExecution = modeExecution;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getTel() {
        return Tel;
    }

    public void setTel(int tel) {
        Tel = tel;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getAddM() {
        return AddM;
    }

    public void setAddM(String addM) {
        AddM = addM;
    }

    public String getPassM() {
        return PassM;
    }

    public void setPassM(String passM) {
        PassM = passM;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
}
