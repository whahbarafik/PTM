package com.example.ptm.Models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Table
@Entity
public class Admin extends Abstract{
    public String Nom;
    public String Prenom;
    @Column(length = 8)
    private int Cin;
    @Column(nullable = false)
    private String Address;
    @Column(nullable = false)
    private String Password;

    public Admin(String nom, String prenom, int cin, String address, String password) {
        Nom = nom;
        Prenom = prenom;
        Cin = cin;
        Address = address;
        Password = password;
    }

    public Admin() {

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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
