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
public class Kategorie {
    @Id
    @GeneratedValue
    long id =0;
    
    String name ="";
    
    @ManyToOne
    private Anzeige anzeige = new Anzeige();
    
    @ManyToOne
    private Kategorie kategorie = new Kategorie();
    
    @OneToMany(mappedBy="kategorie")
    private List<Kategorie> kategorien = new ArrayList<>();

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnzeige(Anzeige anzeige) {
        this.anzeige = anzeige;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Anzeige getAnzeige() {
        return anzeige;
    }
    
    
    
    
}

