/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *
 * @author alumno
 */
public class Perro extends Mascota{
    private boolean colaCortada;
    private String colorPechera;
    private String tamanio;

    public Perro() {
    }

    public Perro(boolean colaCortada, String colorPechera, String tamanio) {
        this.colaCortada = colaCortada;
        this.colorPechera = colorPechera;
        this.tamanio = tamanio;
    }

    public Perro(boolean colaCortada, String colorPechera, String tamanio, String color, String colorOjos, String raza) {
        super(color, colorOjos, raza);
        this.colaCortada = colaCortada;
        this.colorPechera = colorPechera;
        this.tamanio = tamanio;
    }

    public boolean isColaCortada() {
        return colaCortada;
    }

    public void setColaCortada(boolean colaCortada) {
        this.colaCortada = colaCortada;
    }

    public String getColorPechera() {
        return colorPechera;
    }

    public void setColorPechera(String colorPechera) {
        this.colorPechera = colorPechera;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    
    public void correr(){
        System.out.println("estoy corriendo ");
    }
    
    public void corretear(){
        System.out.println("estoy correteando");
    }
    public void ladrar(){
        System.out.println("gua gua gua");
    }
    
    
    
  
}
