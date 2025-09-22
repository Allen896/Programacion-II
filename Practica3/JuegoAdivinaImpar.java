public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

    public JuegoAdivinaImpar(int numeroDeVidas) {
        super(numeroDeVidas);
        this.numeroAAdivinar = 5; 
    }

    @Override
    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10) {
            if (numero % 2 != 0) {
                return true;
            } else {
                System.out.println("Error: Debes ingresar un número IMPAR");
                return false;
            }
        } else {
            System.out.println("Error: El número debe estar entre 0 y 10");
            return false;
        }
    }
}