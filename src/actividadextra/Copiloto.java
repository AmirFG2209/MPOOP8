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
public class Copiloto extends Persona {
    private boolean ayudar;
    private boolean atento;
    private boolean comprensivo;

    public Copiloto() {
    }

    public Copiloto(boolean ayudar, boolean atento, boolean comprensivo) {
        this.ayudar = ayudar;
        this.atento = atento;
        this.comprensivo = comprensivo;
    }

    public Copiloto(boolean ayudar, boolean atento, boolean comprensivo, Mascota mascota) {
        super(mascota);
        this.ayudar = ayudar;
        this.atento = atento;
        this.comprensivo = comprensivo;
    }

    public Copiloto(boolean ayudar, boolean atento, boolean comprensivo, Mascota mascota, String nombre, int edad) {
        super(mascota, nombre, edad);
        this.ayudar = ayudar;
        this.atento = atento;
        this.comprensivo = comprensivo;
    }

    

    public boolean isAyudar() {
        return ayudar;
    }

    public void setAyudar(boolean ayudar) {
        this.ayudar = ayudar;
    }

    public boolean isAtento() {
        return atento;
    }

    public void setAtento(boolean atento) {
        this.atento = atento;
    }

    public boolean isComprensivo() {
        return comprensivo;
    }

    public void setComprensivo(boolean comprensivo) {
        this.comprensivo = comprensivo;
    }
    
    public void verHaciaEnfente(){
        System.out.println("Estoy viendo hacia enfrente");
    }
    public void consultarGPS(){
        System.out.println("La ruta marca por aqui");
    }
    public void ponerMusica(String cancion){
        System.out.println("pongo la cancion "+cancion+" mas escuchada");
    }

    @Override
    public String toString() {
        return "Copiloto{" + "ayudar=" + ayudar + ", atento=" + atento + ", comprensivo=" + comprensivo + '}';
    }
    
    

    
    

    
         
}
