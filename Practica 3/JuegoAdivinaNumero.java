import java.util.*;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
        this.numeroAAdivinar = 6;
    }

    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10) {
            return true;
        } else {
            System.out.println("Error: El número debe estar entre 0 y 10");
            return false;
        }
    }
    public void juega(Scanner scanner) {
        reiniciaPartida();
        
        System.out.println("Adivina un número entre 0 y 10:");

        while (true) {
            int numeroUsuario = scanner.nextInt();

            if (!validaNumero(numeroUsuario)) {
                System.out.println("Intenta con un número válido:");
                continue;
            }

            if (numeroUsuario == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord();
                break;
            } else {
                System.out.println("Fallaste. Pierdes una vida.");
                boolean quedanVidas = quitaVida();

                if (!quedanVidas) {
                    System.out.println("Game over. No te quedan vidas.");
                    break;
                } else {
                    if (numeroUsuario < numeroAAdivinar) {
                        System.out.println("El número es MAYOR. Intenta de nuevo:");
                    } else {
                        System.out.println("El número es MENOR. Intenta de nuevo:");
                    }
                }
            }
        }
    }
}