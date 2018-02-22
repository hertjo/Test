/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbwka.vwi.vertsys.jpa;

import static dhbwka.vwi.vertsys.jpa.Foto_.anzeigen;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;

/**
 *
 * @author j_herter
 */
@Entity
public class Benutzer implements Serializable{
    
    @Id
    @GeneratedValue
    long id =0;
    
    String vorname ="";
    
    String nachname="";
    
    String strasse ="";
    
    int hausnummer= 0;
    
    int postleitzahl= 0;
    
    String ort ="";
    
    String land ="";
    
    String email="";
    
    int telefonnummer =0;


    
    @OneToMany(mappedBy="benutzer")
    private List<Nachricht> nachrichten = new ArrayList<>();
    
    //Veröffentlichung
    @OneToMany(mappedBy="benutzer")
    private List<Anzeige> anzeigen1 = new ArrayList<>();
    
    //Merkt sich
    @ManyToMany
    private List<Anzeige> anzeigen2 = new ArrayList<>();

    public long getId() {
        return id;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getStrasse() {
        return strasse;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public int getPostleitzahl() {
        return postleitzahl;
    }

    public String getOrt() {
        return ort;
    }

    public String getLand() {
        return land;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }

    public List<Nachricht> getNachrichten() {
        return nachrichten;
    }

    public List<Anzeige> getAnzeigen1() {
        return anzeigen1;
    }

    public List<Anzeige> getAnzeigen2() {
        return anzeigen2;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    public void setPostleitzahl(int postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefonnummer(int telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public void setNachrichten(List<Nachricht> nachrichten) {
        this.nachrichten = nachrichten;
    }

    public void setAnzeigen1(List<Anzeige> anzeigen1) {
        this.anzeigen1 = anzeigen1;
    }

    public void setAnzeigen2(List<Anzeige> anzeigen2) {
        this.anzeigen2 = anzeigen2;
    }

 
    
}
