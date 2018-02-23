/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbwka.vwi.vertsys.ejb;

import dhbwka.vwi.vertsys.jpa.Anzeige;
import javax.ejb.Stateless;

/**
 *
 * @author j_herter
 */
@Stateless
public class AnzeigeBean extends EntityBean<Anzeige, Long>{
    public AnzeigeBean(){
        super(Anzeige.class);
    }
}