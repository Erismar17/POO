package Juegos;
import java.util.*;
public class PPT implements Juego{
    String nombreUsuario;
    int numeroMaquina = (int)(Math.random()*2+1), numeroUsuario, winner; 
    Scanner lectura = new Scanner(System.in);

    public void Iniciar() {
            System.out.println("¡Bienvenido! ¿Preparado para jugar piedra, papel o tijera?");
            System.out.print(" Por favor, escribe tú nombre: ");
            nombreUsuario = lectura.next();
    }

    public void Jugar() {
        System.out.println("Por favor elige 1 2 o 3 \n1. Piedra. \n2. Papel. \n2 Tijera. ");
        numeroUsuario = lectura.nextInt();

        switch (numeroUsuario) {
            case 1:
            if (numeroMaquina == 1) {
                System.out.println("Elegiste piedra, la máquina elegió piedra también.");
                winner = 1;
            } else if (numeroMaquina == 2) {
                System.out.println("Elegiste piedra, la máquina elegió papel.");
                winner = 2;
            } else if (numeroMaquina == 3) {
                System.out.println("Elegiste piedra, la máquina elegió tijera.");
                winner = 1;
            }
        break;
            case 2:
            if (numeroMaquina == 1) {
                System.out.println("Elegiste papel, la máquina elegió piedra. ");
            } else if (numeroMaquina == 2) {
                winner = 1;
                System.out.println("Elegiste papel, la máquina eligió papel.");
            } else if (numeroMaquina == 3) {
                winner = 1;
                System.out.println("Elegiste papel, la máquina eligió tijera.");
                winner = 1;
            }
        break;
            case 3:
            if (numeroMaquina == 1) {
                System.out.println("Elegiste tijera, la máquina elegió piedra.");
            } else if (numeroMaquina == 2) {
                winner = 1;
                System.out.println("Elegiste tijera, la máquina eligió papel.");
            } else if (numeroMaquina == 3) {
                winner = 2;
                System.out.println("Elegiste tijera, la máquina eligió tijera.");
                winner = 1;
            }
        break;
            
            default:
                System.out.println("Elegiste una opción equivocada, vuelve a intentarlo del 1 al 3");
        break;
        }
    }

    public void Finalizar() {
        if (winner == 1) {
            System.out.println("Has perdido");
        } else {
            System.out.println("Has ganado");
        }
    }
    
}