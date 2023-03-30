package Principal;
import Salud.*;
public class Inicio {
    public static void main(String[] args) {
        //declarar variables
        String pesoResultado = "";
        Persona persona = new Persona();
        persona.pedirDatos();
        persona. mostrarPersona();
        /*persona.calcularIMC();*/
        pesoResultado = persona.calcularIMC(pesoResultado);

        if (pesoResultado == "PESO BAJO") {
             System.out.println(" Su peso está por debajo de lo ideal.");
        } else if (pesoResultado == "PESO IDEAL") {
            System.out.println(" Su peso es el adecuado. ");
        } else if (pesoResultado == "SOBRE PESO") {
            System.out.println(" Usted tiene sobre peso. ");
        }

        persona.getApellido();
        persona.mayorEdad();

        Empleado empleado = new Empleado();
        empleado.calcularHonorarios();
    }
}