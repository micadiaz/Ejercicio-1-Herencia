package guia.pkg9.herencia.ejercicio.pkg1;

public class Gato extends Animal1 {
    
    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    public void muestra(){
        System.out.println("Nombre= "+getNombre());
        System.out.println("se alimenta de= "+ getAlimento());
        System.out.println("Edad= "+getEdad());
        System.out.println("Raza= "+getRaza());
}
}
/*Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente: */