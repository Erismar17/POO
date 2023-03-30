package Figuras;

public class Circulo extends Figura{
    double radio, pi=3.1416;
    public Circulo() {

    }
    public Circulo(double radio) {
        this.radio = radio;
    }   
    public void calcularArea() {   
        double area=radio*pi;
        System.out.println(" El área del Circulo es :"+area);  
    }
}