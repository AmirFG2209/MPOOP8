/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *
 * @author alumno
 */
public class Mascota extends SerVivo{
    private String color;
    private String colorOjos;
    private String raza;

    public Mascota() {
    }

    public Mascota(String color, String colorOjos, String raza) {
        this.color = color;
        this.colorOjos = colorOjos;
        this.raza = raza;
    }

    public Mascota(String color, String colorOjos, String raza, String nombre, int edad) {
        super(nombre, edad);
        this.color = color;
        this.colorOjos = colorOjos;
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public void jugar(){
        System.out.println("Estoy jugando");
    }
    
    public void saltar (){
        System.out.println("estoy saltando");
    }
    
    public void dormir(){
        System.out.println("zzzzzz");
    }

    @Override
    public String toString() {
        return "Mascota{" + "color=" + color + ", colorOjos=" + colorOjos + ", raza=" + raza + '}';
    }
    
    
}
