
package main;

import entidades.Persona;
import entidades.RelojFit;


public class TestMain {

   
    public static void main(String[] args) {
        
        //4_ Desde la java main class, llamar a los metodos de unReloj, accediendo desde objeto unaPersona
        // Llamar los metodos de todas las clasess
         
        RelojFit relojFit = new RelojFit("Martes", "19:00hs", "Modelo Fit", 123456,2,2);   

        Persona persona = new Persona("Coni", "Genia Garibotto", 23, 1.59, relojFit);

        // Llamar a los métodos de la clase RelojFit a través del objeto Persona
        System.out.println("Coordenadas del reloj Fit: x=" + persona.getReloj().getX() + ", y=" + persona.getReloj().getY());

        System.out.println("Día del reloj: " + relojFit.getDia());
        System.out.println("Hora del reloj: " + relojFit.getHora());

    }
    
}
