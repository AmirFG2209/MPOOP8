/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *
 * @author alumno
 */
public class Persona extends SerVivo {
    private Mascota mascota;

    public Persona() {
    }

    public Persona(Mascota mascota) {
        this.mascota = mascota;
    }

    public Persona(Mascota mascota, String nombre, int edad) {
        super(nombre, edad);
        this.mascota = mascota;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Persona{" + "mascota=" + mascota + '}';
    }
    
    

    
    
   
    

    

    
    
    
    
}
