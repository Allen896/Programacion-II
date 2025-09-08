public class TestAlgebraVectorial {

    public static void main(String[] args) {
        AlgebraVectorial v1 = new AlgebraVectorial(1, 2, 3);
        AlgebraVectorial v2 = new AlgebraVectorial(4, 5, 6);
        AlgebraVectorial v3 = new AlgebraVectorial(2, 4, 6);
        AlgebraVectorial v4 = new AlgebraVectorial(-2, 1, 0);
        
        AlgebraVectorial algebra = new AlgebraVectorial();
        
        System.out.println("Vectores:");
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);
        System.out.println("v4 = " + v4);
        System.out.println();
        
        //  metodos
        System.out.println("Resultados:");
        System.out.println("v1 y v2 perpendicular (a): " + algebra.perpendicular(v1, v2));
        System.out.println("v1 y v4 perpendicular (b): " + algebra.perpendicular(v4));
        System.out.println("v1 y v4 perpendicular (c): " + algebra.perpendicular(-2, 1, 0));
        System.out.println("v1 y v2 perpendicular (d): " + algebra.perpendicular(v1, v2, "tipo"));
        System.out.println("v1 y v3 paralela (e): " + algebra.paralela(v1, v3));
        System.out.println("v1 y v2 paralela (f): " + algebra.paralela(v2));
        
        AlgebraVectorial proyeccion = algebra.proyeccion(v1, v2);
        double componente = algebra.componente(v1, v2);
        System.out.println("Proyección v1 sobre v2: " + proyeccion);
        System.out.println("Componente v1 en v2: " + componente);
    }
}
