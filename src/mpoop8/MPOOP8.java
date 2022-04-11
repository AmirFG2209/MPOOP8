/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop8;

import actividadextra.Coche;
import actividadextra.Copiloto;
import actividadextra.Gato;
import actividadextra.Perro;
import actividadextra.Piloto;
import actividadextra.SerVivo;
import figura.Cuadrilatero;
import figura.Poligono;
import figura.Triangulo;

/**
 *
 * @author alumno
 */
public class MPOOP8 {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        // TODO code application logic here
        
        Poligono poligono =new Poligono();
        System.out.println(poligono);
        
        poligono=new Triangulo();
        System.out.println(poligono);
        poligono = new Cuadrilatero();
        System.out.println(poligono);
        
        
        Object objeto =new Object();
        System.out.println(objeto);
        
        objeto=new Poligono();
        System.out.println(objeto);
        
        objeto =new Triangulo();
        System.out.println(objeto);
        getPoligono(new Triangulo());
        getPoligono(new Cuadrilatero());
        getPoligono(new Poligono());
   
        //  Triangulo t2=new Poligono(); -> no se puede
        System.out.println("########################################");
        
        SerVivo serVivo1 =new SerVivo();
        System.out.println(serVivo1);
        serVivo1= new Perro();
        serVivo1.setNombre("Coco");
        
        SerVivo serVivo2 = new SerVivo();
        serVivo2  =new Gato();
        serVivo2.setNombre("Bola de nieve");
        System.out.println(serVivo2);
        SerVivo serVivo3 = new SerVivo();
        serVivo3 =new Copiloto();
        serVivo3.setNombre("Juan");
        
        SerVivo serVivo4 = new SerVivo();
        serVivo4 =new Piloto();
        serVivo4.setNombre("Jesus");
       
        getCoche(serVivo1);
        getCoche(serVivo2);
        getCoche(serVivo3);
        getCoche(serVivo4);
        
 
    }
    public static void getPoligono(Poligono pol){
        if(pol instanceof Triangulo){
            System.out.println("El poligono es un triangulo");
        }else if(pol instanceof Cuadrilatero){
            System.out.println("El poligono es un cuadrilatero");
        }else{
            System.out.println("Es otra figura");
        }      
    }
    public static void getCoche(SerVivo ser1){
        if(ser1 instanceof Piloto){
            System.out.println("El piloto," +ser1.getNombre()+" se sienta en el asiento izquierdo");
        }else if(ser1 instanceof Copiloto){
            System.out.println("El copiloto,"+ ser1.getNombre()+" se sienta en el asiento derecho");
        }else if(ser1 instanceof Perro){
            System.out.println("El perro,"+ser1.getNombre()+ " va en la primera caja transportadora");
        }else{
            System.out.println("El gato,"+ser1.getNombre()+ " va en la segunda caja transportadora");
        }
            
    }
    
}


