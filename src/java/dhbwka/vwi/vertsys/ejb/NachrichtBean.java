/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbwka.vwi.vertsys.ejb;

import dhbwka.vwi.vertsys.jpa.Nachricht;

/**
 *
 * @author j_herter
 */
public class NachrichtBean extends EntityBean<Nachricht, Long>{
    public NachrichtBean(){
        super(Nachricht.class);
    }
}
