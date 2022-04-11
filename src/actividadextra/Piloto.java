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
public class Piloto extends Persona{
    private boolean cinturonSeguridad;
    private boolean buenosReflejos;
    private  boolean licencia;

    public Piloto() {
    }

    public Piloto(boolean cinturonSeguridad, boolean buenosReflejos, boolean licencia) {
        this.cinturonSeguridad = cinturonSeguridad;
        this.buenosReflejos = buenosReflejos;
        this.licencia = licencia;
    }

    public Piloto(boolean cinturonSeguridad, boolean buenosReflejos, boolean licencia, Mascota mascota) {
        super(mascota);
        this.cinturonSeguridad = cinturonSeguridad;
        this.buenosReflejos = buenosReflejos;
        this.licencia = licencia;
    }

    public Piloto(boolean cinturonSeguridad, boolean buenosReflejos, boolean licencia, Mascota mascota, String nombre, int edad) {
        super(mascota, nombre, edad);
        this.cinturonSeguridad = cinturonSeguridad;
        this.buenosReflejos = buenosReflejos;
        this.licencia = licencia;
    }
    
    public boolean isCinturonSeguridad() {
        return cinturonSeguridad;
    }

    public void setCinturonSeguridad(boolean cinturonSeguridad) {
        this.cinturonSeguridad = cinturonSeguridad;
    }

    public boolean isBuenosReflejos() {
        return buenosReflejos;
    }

    public void setBuenosReflejos(boolean buenosReflejos) {
        this.buenosReflejos = buenosReflejos;
    }

    public boolean isLicencia() {
        return licencia;
    }

    public void setLicencia(boolean licencia) {
        this.licencia = licencia;
    }
    
    public void espejear(){
        System.out.println("Veo hacia ambos lados");
    } 
    public void conducir(int velocidad){
        System.out.println("Estoy conduciendo a  "+velocidad+"Km/h");
    }
    public void prenderIntermitentes(){
        System.out.println("voy a dar vuelta a la derecha");
    }

    @Override
    public String toString() {
        return "Piloto{" + "cinturonSeguridad=" + cinturonSeguridad + ", buenosReflejos=" + buenosReflejos + ", licencia=" + licencia + '}';
    }
    
    
    
}
