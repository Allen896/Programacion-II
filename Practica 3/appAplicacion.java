import java.util.*;

public class appAplicacion {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in); 
        
        JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);

        System.out.println(" JUEGO ADIVINA NÚMERO ");
        juego1.juega(scanner);
        
        System.out.println("\n JUEGO ADIVINA PAR ");
        juego2.juega(scanner);
        
        System.out.println("\n JUEGO ADIVINA IMPAR ");
        juego3.juega(scanner);
        
        scanner.close(); 

    }
}
