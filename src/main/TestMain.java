
package main;

import entidades.Persona;
import entidades.RelojFit;


public class TestMain {

   
    public static void main(String[] args) {
        
        //4_ Desde la java main class, llamar a los metodos de un Reloj, accediendo desde objeto una Persona
        // Llamar los metodos de todas las clasess
         
        RelojFit relojFit = new RelojFit("Martes", "19:00hs", "Modelo no fit", 25, 1,58);

        Persona persona = new Persona("Coniiii", "Genia Garibotto", 23, 1.57, relojFit);

        // Llamar a los métodos de la clase RelojFit a través del objeto Persona
        // System.out.println(persona.()).g);
       System.out.println("Coordenadas del reloj Fit: x="+((RelojFit)persona.getReloj()).getX() +", y="+((RelojFit)persona.getReloj()).getY());

       // System.out.println("Día del reloj: " + relojFit.getDia());
        //System.out.println("Hora del reloj: " + persona.decirHora());

    }
    
}
