/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbwka.vwi.vertsys.jpa;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author j_herter
 */
@Entity
public class Anzeige {
    
    @Id
    @GeneratedValue
    long id = 0;
    
    String titel="";
    String beschreibung="";
    String onlineBis="";
    String preisvorstellung="";
    int postleitzahl =0;
    String ort="";
    
    private Art art =  Art.UNBEKANNT;
    
    @Column (precision =7, scale=2)
    private long preis=0;
    
    
    @ManyToOne
    private Benutzer benutzer = new Benutzer();
    
    @ManyToMany
    List<Kategorie> kategorien = new ArrayList<>();
    
    @ManyToOne
    private Foto foto = new Foto();

    public long getId() {
        return id;
    }

    public String getTitel() {
        return titel;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public String getOnlineBis() {
        return onlineBis;
    }

    public String getPreisvorstellung() {
        return preisvorstellung;
    }

    public int getPostleitzahl() {
        return postleitzahl;
    }

    public String getOrt() {
        return ort;
    }

    public Art getArt() {
        return art;
    }

    public long getPreis() {
        return preis;
    }

    public Benutzer getBenutzer() {
        return benutzer;
    }

    public List<Kategorie> getKategorien() {
        return kategorien;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public void setOnlineBis(String onlineBis) {
        this.onlineBis = onlineBis;
    }

    public void setPreisvorstellung(String preisvorstellung) {
        this.preisvorstellung = preisvorstellung;
    }

    public void setPostleitzahl(int postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public void setArt(Art art) {
        this.art = art;
    }

    public void setPreis(long preis) {
        this.preis = preis;
    }

    public void setBenutzer(Benutzer benutzer) {
        this.benutzer = benutzer;
    }

    public void setKategorien(List<Kategorie> kategorien) {
        this.kategorien = kategorien;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

  
    
    
    
    
    
}
