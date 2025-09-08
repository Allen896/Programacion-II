public class VectorTridimensional {
    public double x;
    public double y;
    public double z;
    
    public VectorTridimensional() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    
    public VectorTridimensional(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    //  FIGURA 1:
    
    // a)  a + b = (a₁+b₁, a₂+b₂, a₃+b₃)
    public VectorTridimensional suma(VectorTridimensional b) {
        return new VectorTridimensional(this.x + b.x, this.y + b.y, this.z + b.z);
    }
    
    // b)  r * a = (r*a₁, r*a₂, r*a₃)
    public VectorTridimensional multiplicacion(double r) {
        return new VectorTridimensional(r * this.x, r * this.y, r * this.z);
    }
    
    // c)  |a| = √(a₁² + a₂² + a₃²)
    public double longitud() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }
    
    // d)  a / |a| = (a₁/|a|, a₂/|a|, a₃/|a|)
    public VectorTridimensional normal() {
        double magnitud = this.longitud();
        return new VectorTridimensional(this.x / magnitud, this.y / magnitud, this.z / magnitud);
    }
    
    // e)  a · b = a₁b₁ + a₂b₂ + a₃b₃
    public double productoEscalar(VectorTridimensional b) {
        return this.x * b.x + this.y * b.y + this.z * b.z;
    }
    
    // f)  a x b = (a₂b₃-a₃b₂, a₃b₁-a₁b₃, a₁b₂-a₂b₁)
    public VectorTridimensional productoVectorial(VectorTridimensional b) {
        double x = this.y * b.z - this.z * b.y;
        double y = this.z * b.x - this.x * b.z;
        double z = this.x * b.y - this.y * b.x;
        return new VectorTridimensional(x, y, z);
    }
    
    // FIGURA 2: 
    
    // g) Proyección de a sobre b: Proy_b a = [(a·b)/|b|²] * b
    public VectorTridimensional proyeccion(VectorTridimensional b) {
        double productoEscalar = this.productoEscalar(b);
        double magnitudBCuad = b.x * b.x + b.y * b.y + b.z * b.z;
        double factor = productoEscalar / magnitudBCuad;
        return new VectorTridimensional(factor * b.x, factor * b.y, factor * b.z);
    }
    
    // h) Componente de a en b: Comp_b a = (a·b)/|b|
    public double componente(VectorTridimensional b) {
        double productoEscalar = this.productoEscalar(b);
        double magnitudB = Math.sqrt(b.x * b.x + b.y * b.y + b.z * b.z);
        return productoEscalar / magnitudB;
    }
    
    //para el paralelogramo
    
    // Diagonal del paralelogramo: a + b
    public VectorTridimensional diagonalSuma(VectorTridimensional b) {
        return this.suma(b);
    }
    
    //  a - b
    public VectorTridimensional diagonalResta(VectorTridimensional b) {
        return new VectorTridimensional(this.x - b.x, this.y - b.y, this.z - b.z);
    }
    
    //  rectángulo (perpendicular): |a + b| = |a - b|
    public boolean esRectangulo(VectorTridimensional b) {
        double suma = this.suma(b).longitud();
        double resta = this.diagonalResta(b).longitud();
        return Math.abs(suma - resta) < 0.0001;
    }
    
    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }
}