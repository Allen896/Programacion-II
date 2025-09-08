public class TestVectorTridimensional {

    public static void main(String[] args) {
        
        VectorTridimensional a = new VectorTridimensional(1, 2, 3);
        VectorTridimensional b = new VectorTridimensional(4, 5, 6);
        VectorTridimensional c = new VectorTridimensional(2, 4, 6); // Paralelo :3
        VectorTridimensional d = new VectorTridimensional(-2, 1, 0); // Perpendicular :3
        
        System.out.println("Vectores:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println();
        
        // FIGURA 1: Operaciones básicas 
        System.out.println("FIGURA 1 - Operaciones básicas:");
        System.out.println("a + b = " + a.suma(b));
        System.out.println("2 * a = " + a.multiplicacion(2));
        System.out.println("|a| = " + a.longitud());
        System.out.println("a normalizado = " + a.normal());
        System.out.println("a · b = " + a.productoEscalar(b));
        System.out.println("a x b = " + a.productoVectorial(b));
        System.out.println("¿Paralelogramo rectángulo? " + a.esRectangulo(b));
        System.out.println();
        
        //  FIGURA 2: Proyección y componentes 
        System.out.println("FIGURA 2 - Proyección ortogonal:");
        System.out.println("Proyección de a sobre b = " + a.proyeccion(b));
        System.out.println("Componente de a en b = " + a.componente(b));
    }
}