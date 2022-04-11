/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *
 * @author alumno
 */
public class Gato extends Mascota{
    private String colorCollar;
    private String tipoDePelaje;
    private String comida;

    public Gato() {
    }

    public Gato(String color, String colorOjos, String raza, String nombre, int edad) {
        super(color, colorOjos, raza, nombre, edad);
    }
    
    public Gato(String colorCollar, String tipoDePelaje, String comida) {
        this.colorCollar = colorCollar;
        this.tipoDePelaje = tipoDePelaje;
        this.comida = comida;
    }

    public Gato(String colorCollar, String tipoDePelaje, String comida, String color, String colorOjos, String raza) {
        super(color, colorOjos, raza);
        this.colorCollar = colorCollar;
        this.tipoDePelaje = tipoDePelaje;
        this.comida = comida;
    }

    public Gato(String colorCollar, String tipoDePelaje, String comida, String color, String colorOjos, String raza, String nombre, int edad) {
        super(color, colorOjos, raza, nombre, edad);
        this.colorCollar = colorCollar;
        this.tipoDePelaje = tipoDePelaje;
        this.comida = comida;
    }

    

    public String getColorCollar() {
        return colorCollar;
    }

    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }

    public String getTipoDePelaje() {
        return tipoDePelaje;
    }

    public void setTipoDePelaje(String tipoDePelaje) {
        this.tipoDePelaje = tipoDePelaje;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }
    
    public void rasguñar(){
        System.out.println("gigiiiii");
    }
    
    public void maullar(){
        System.out.println("miau miauuuu");
    }
    public void trepar(){
        System.out.println("estoy trepando");
    }

    @Override
    public String toString() {
        return "Gato{" + "colorCollar=" + colorCollar + ", tipoDePelaje=" + tipoDePelaje + ", comida=" + comida + '}';
    }
    
    
}
