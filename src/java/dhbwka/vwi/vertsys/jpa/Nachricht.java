
package dhbwka.vwi.vertsys.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author j_herter
 */
@Entity
public class Nachricht implements Serializable{
    
    @Id
    @GeneratedValue
    long id = 0;
    
    String text ="";
    
    String artikel ="";
    
    @ManyToOne
    private Benutzer benutzer = new Benutzer();

    public void setId(long id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setArtikel(String artikel) {
        this.artikel = artikel;
    }

    public void setBenutzer(Benutzer benutzer) {
        this.benutzer = benutzer;
    }

    public long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getArtikel() {
        return artikel;
    }

    public Benutzer getBenutzer() {
        return benutzer;
    }
    
    
}
