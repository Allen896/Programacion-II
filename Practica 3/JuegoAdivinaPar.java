public class JuegoAdivinaPar extends JuegoAdivinaNumero {

    public JuegoAdivinaPar(int numeroDeVidas) {
        super(numeroDeVidas);
        this.numeroAAdivinar = 4; 
        
    }

    @Override
    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10) {
            if (numero % 2 == 0) {
                return true;
            } else {
                System.out.println("Error: Debes ingresar un número PAR");
                return false;
            }
        } else {
            System.out.println("Error: El número debe estar entre 0 y 10");
            return false;
        }
    }
}