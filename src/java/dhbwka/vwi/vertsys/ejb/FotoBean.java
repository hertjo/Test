/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbwka.vwi.vertsys.ejb;

import dhbwka.vwi.vertsys.jpa.Benutzer;
import dhbwka.vwi.vertsys.jpa.Foto;

/**
 *
 * @author j_herter
 */
public class FotoBean extends EntityBean<Foto, Long>{
    public FotoBean(){
        super(Foto.class);
    }
}
