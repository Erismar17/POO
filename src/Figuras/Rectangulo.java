package Figuras;

public class Rectangulo extends Figura{
    float largo, ancho, area;
    public Rectangulo() {

    }
    public Rectangulo(float largo, float ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }   
    public void calcularArea() {   
        float area=largo*ancho;
        System.out.println(" El área del rectangulo es :"+area);  
    }
}