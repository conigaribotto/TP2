package entidades;

public class Persona {

    private String nombre,apellido;
    private int edad;
    private double altura;
    private Reloj reloj;

    public Reloj getReloj() {
        return reloj;
    }

    public void setReloj(Reloj reloj) {
        this.reloj = reloj;
    }

    public Persona(String nombre, String apellido, int edad, double altura, RelojFit relojFit) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
       // this.altura=altura;
        this.reloj=relojFit;
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

    public String decirHora() {
        return getReloj().getHora();
    }

    public void decirCoorenada() {
        
        System.out.println("Coordenadas del reloj Fit:");
        //System.out.println("x=" + reloj.getX());
    }

    public void hablar() {
        System.out.println("Hola!");
    }

    public void comer() {
        System.out.println("Estoy comiendo :D");
    }
}
