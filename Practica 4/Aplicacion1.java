import java.util.*;

public class Aplicacion1 {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];

        System.out.println("5 figuras \n");


        figuras[0] = new Cuadrado("rojo", 5.0);
        figuras[1] = new Circulo("azul", 3.0);
        figuras[2] = new Cuadrado("verde", 4.0);
        figuras[3] = new Circulo("amarillo", 2.5);
        figuras[4] = new Cuadrado("naranja", 6.0);

        System.out.println("=== Información de Figuras ===");
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Figura " + (i + 1) + ": " + figuras[i]);
            System.out.println("Área: " + String.format("%.2f", figuras[i].area()));
            System.out.println("Perímetro: " + String.format("%.2f", figuras[i].perimetro()));
            

            if (figuras[i] instanceof Coloreado) {
                Coloreado coloreable = (Coloreado) figuras[i];
                System.out.println("Método colorear: " + coloreable.comoColorear());
            }
            System.out.println();
        }
    }
}