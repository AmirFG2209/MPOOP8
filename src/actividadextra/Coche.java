/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadextra;

/**
 *
 * @author ivan_
 */
public class Coche {
    private SerVivo servivo;
    

    public Coche() {
    }
    
    public Coche(SerVivo servivo) {
        this.servivo = servivo;
    }

    public SerVivo getServivo() {
        return servivo;
    }

    public void setServivo(SerVivo servivo) {
        this.servivo = servivo;
    }

    @Override
    public String toString() {
        return "Coche{" + "servivo=" + servivo + '}';
    }
    
    
    
}
