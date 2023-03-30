package Figuras;
import java.util.Scanner;
public class Ejecucion {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        Rectangulo r1;
        Circulo c1;
        Triangulo t1;
        int decision;
        float largo, ancho, radio, base, altura;
        System.out.println("Seleccione una opción: \n1. Rectangulo. \n2. Circulo. \n3. Triangulo.");
        decision=lectura.nextInt();

        
        switch (decision) {
            case 1:
                System.out.println("Escriba el largo del rectangulo: ");
                largo=lectura.nextInt();
                System.out.println(" Escriba el ancho del rectangulo: ");
                ancho=lectura.nextInt();
                r1=new Rectangulo(largo, ancho);
                r1.calcularArea();
            break;

            case 2:
                System.out.println("Escribe el radio del circulo: ");
                radio=lectura.nextInt();
                c1= new Circulo(radio);
                c1.calcularArea();
            break;

            case 3:
                System.out.println("Escriba el tamaño de la base del triangulo: ");
                base=lectura.nextInt();
                System.out.println(" Escriba la altura del triangulo: ");
                altura=lectura.nextInt();
                t1= new Triangulo(base, altura);
                t1.calcularArea();
            break;

            default: System.out.println("Usted eligió una opción equivocada, por favor, intentalo de nuevo.");
            break;
        }
    lectura.close();
    }
}