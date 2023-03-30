package Salud;
import java.util.Scanner;
public class Empleado extends Persona{
    private String cargo, departamento;
    private int valorHora, horasTrabajadas;
    private double totalPago;
    public Empleado(String cargo, String departamento, int valorhora, int horastrabajadas) {
        this.cargo = cargo;
        this.departamento = departamento;
        this.valorHora = valorhora;
        this.horasTrabajadas = horastrabajadas;

    }
    
    public Empleado() {
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public int getValorhora() {
        return valorHora;
    }
    public void setValorhora(int valorhora) {
        this.valorHora = valorhora;
    }
    public int getHorastrabajadas() {
        return horasTrabajadas;
    }
    public void setHorastrabajadas(int horastrabajadas) {
        this.horasTrabajadas = horastrabajadas;
    }
    public Persona getPerson() {
        return person;
    }
    public void setPerson(Persona person) {
        this.person = person;
    }
    public Scanner getLectura() {
        return lectura;
    }
    public void setLectura(Scanner lectura) {
        this.lectura = lectura;
    }
    Persona person = new Persona();
    Scanner lectura = new Scanner (System.in);
    public void calcularHonorarios (){
        System.out.println(" Por favor escriba su cargo: ");
        cargo=lectura.next();
        System.out.println(" Por favor escriba su departamento: ");
        departamento=lectura.next();
        System.out.println(" Por favor escriba cuanto le pagan por hora: ");
        valorHora=lectura.nextInt();
        System.out.println(" Por favor escriba las horas trabajadas: ");
        horasTrabajadas=lectura.nextInt();
        totalPago= (valorHora*horasTrabajadas)-0.00966;

        //Imprimir el tipo y número de documento, nombres y apellidos, cargo, horas trabajadas, valor por hora y total a pagar.
        person.getTipoDoc();
        person.getDocumento();
        person.getNombre();
        person.getApellido();
        System.out.println(" Las horas trabajadas son: " +horasTrabajadas);
        System.out.println( " Su cargo es: "+ cargo);
        System.out.println(" El valor por horas es: "+valorHora);
        System.out.println(" Y el total a pagar es: " +totalPago);
        System.out.println(" El total que deberán pagarle es: " +totalPago);
        
    }
}