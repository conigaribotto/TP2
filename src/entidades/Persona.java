package entidades;

public class Persona {

    private String nombre,apellido;
    private int edad;
    private double altura;
    private Reloj reloj;

    public Persona(String nombre, String apellido, int edad, double altura, Reloj reloj) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.altura=altura;
        this.reloj=reloj;
    }

    public String getNombre() {
        return nombre+" "+apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad=edad;
    }

    public void decirHora() {
        reloj.getHora();
    }

    public void hablar() {
        System.out.println("Hola!");
    }

    public void comer() {
        System.out.println("Estoy comiendo :D");
    }
}
