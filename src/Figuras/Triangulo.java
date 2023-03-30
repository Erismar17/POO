package Figuras;

public class Triangulo extends Figura{
    float base, altura;
    public Triangulo() {

    }
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }   
    public void calcularArea() {
        float area = (base * altura) / 2;
        System.out.println(" El área del Triangulo es :"+area);  
    }
}