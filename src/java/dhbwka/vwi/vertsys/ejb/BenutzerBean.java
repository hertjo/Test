/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbwka.vwi.vertsys.ejb;

import dhbwka.vwi.vertsys.jpa.Benutzer;

/**
 *
 * @author j_herter
 */
public class BenutzerBean extends EntityBean<Benutzer, Long>{
    public BenutzerBean(){
        super(Benutzer.class);
    }
}
