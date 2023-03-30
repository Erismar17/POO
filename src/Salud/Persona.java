package Salud;
import java.util.*;
public class Persona {
    Scanner lectura = new Scanner(System.in);
    //Declarar artibutos.
    private String tipoDoc, nombre, apellido, sexo;
    private double estatura;
    private int documento, edad, peso;
    //Creamos el objeto.
    public void Persona(){

    } 


    //Métodos.
    public void pedirDatos(){
        System.out.println(" Por favor esriba su tipo de documento: ");
        tipoDoc= lectura.next();
        System.out.println(" Por favor escriba su nombre: ");
        nombre=lectura.next();
        System.out.println(" Por favor escriba su apellido: ");
        apellido=lectura.next();
        System.out.println(" Por favor escriba su estatura: ");
        estatura=lectura.nextDouble();
        System.out.println(" Por favor escriba su sexo: ");
        sexo=lectura.next();
        System.out.println(" Por favor escriba su documento: ");
        documento=lectura.nextInt();
        System.out.println(" Por favor escriba su edad: ");
        edad=lectura.nextInt();
        System.out.println(" Por favor escriba su peso: ");
        peso=lectura.nextInt();
        }
            public void mostrarPersona(){
            System.out.println(" Su tipo de documento es: " +tipoDoc);
            System.out.println(" Su nombre es: "+nombre);
            System.out.println(" Su apellido es: "+apellido);
            System.out.println(" Su estatura es: "+estatura);
            System.out.println(" Su sexo es: "+sexo);
            System.out.println(" Su documento es: "+documento);
            System.out.println(" Su edad es: "+edad);
            System.out.println(" Su peso es: "+peso);
            }
        //Operación
                /*public void calcularIMC(){*/

            public String calcularIMC(String pesoResultado){
                double pesoActual = peso / (estatura * estatura);

                if (pesoActual<20) {
                    pesoResultado = "PESO BAJO";
                } else if(pesoActual>=20 && pesoActual>=25){
                    pesoResultado = "PESO IDEAL";
                    } else if (pesoActual>25){
                        pesoResultado = "SOBRE PESO";
                    }
                    return pesoResultado;
            }

            public void mayorEdad(){
                //Determinar si es mayor de edad o no.
                if (edad>=18) {
                    System.out.println(" Es mayor de edad. ");
                } else {
                    System.out.println(" Usted es menor de edad.");
                }
            }

            public Scanner getLectura() {
                return lectura;
            }

            public void setLectura(Scanner lectura) {
                this.lectura = lectura;
            }

            public String getTipoDoc() {
                return tipoDoc;
            }

            public void setTipoDoc(String tipoDoc) {
                this.tipoDoc = tipoDoc;
            }

            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public String getApellido() {
                return apellido;
            }

            public void setApellido(String apellido) {
                this.apellido = apellido;
            }

            public String getSexo() {
                return sexo;
            }

            public void setSexo(String sexo) {
                this.sexo = sexo;
            }

            public double getEstatura() {
                return estatura;
            }

            public void setEstatura(double estatura) {
                this.estatura = estatura;
            }

            public int getDocumento() {
                return documento;
            }

            public void setDocumento(int documento) {
                this.documento = documento;
            }

            public int getEdad() {
                return edad;
            }

            public void setEdad(int edad) {
                this.edad = edad;
            }

            public int getPeso() {
                return peso;
            }

            public void setPeso(int peso) {
                this.peso = peso;
            }
            
}