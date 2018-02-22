/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbwka.vwi.vertsys.jpa;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author j_herter
 */
@Entity
public class Foto {
    
    @Id
    @GeneratedValue
    long id =0;
    
    String bezeichnung ="";
    String KameraName="";
    
    @ManyToOne
    private Anzeige anzeige = new Anzeige();
    
    @OneToMany(mappedBy="foto")
    private List<Anzeige> anzeigen = new ArrayList<>();

    public void setId(long id) {
        this.id = id;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public void setKameraName(String KameraName) {
        this.KameraName = KameraName;
    }

    public void setAnzeige(Anzeige anzeige) {
        this.anzeige = anzeige;
    }


    public long getId() {
        return id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public String getKameraName() {
        return KameraName;
    }

    public Anzeige getAnzeige() {
        return anzeige;
    }
    
    
    
}
