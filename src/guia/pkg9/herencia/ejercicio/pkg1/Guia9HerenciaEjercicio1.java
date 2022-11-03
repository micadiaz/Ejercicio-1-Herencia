
package guia.pkg9.herencia.ejercicio.pkg1;

import java.util.ArrayList;


public class Guia9HerenciaEjercicio1 {

    
    public static void main(String[] args) {
      ArrayList<Animal1>animales=new ArrayList();
      Animal1 a= new Animal1();
      Perro b= new Perro("Pepe","Croquetas",6,"Chihuaha");
      b.muestra();
      System.out.println("--------------------");
      Gato c=new Gato("Coqui","Pescado",2,"Siames");
      c.muestra();
      System.out.println("--------------------");
      Caballo d=new Caballo("Neron","Pasto",4,"Fino");
      d.muestra(); 
    }
    
}
/*Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente: */