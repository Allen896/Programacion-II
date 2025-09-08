public class AlgebraVectorial {
    public double x;
    public double y;
    public double z;
    
    public AlgebraVectorial() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    
    public AlgebraVectorial(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }
    
    public AlgebraVectorial(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    // a) Perpendicular: |a + b| = |a - b|
    public boolean perpendicular(AlgebraVectorial a, AlgebraVectorial b) {
        double suma = Math.sqrt(Math.pow(a.x + b.x, 2) + Math.pow(a.y + b.y, 2) + Math.pow(a.z + b.z, 2));
        double resta = Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2) + Math.pow(a.z - b.z, 2));
        return Math.abs(suma - resta) < 0.0001;
    }
    
    // b) Perpendicular: |a - b| = |b - a|
    public boolean perpendicular(AlgebraVectorial a) {
        double ab = Math.sqrt(Math.pow(this.x - a.x, 2) + Math.pow(this.y - a.y, 2) + Math.pow(this.z - a.z, 2));
        double ba = Math.sqrt(Math.pow(a.x - this.x, 2) + Math.pow(a.y - this.y, 2) + Math.pow(a.z - this.z, 2));
        return Math.abs(ab - ba) < 0.0001;
    }
    
    // c) Perpendicular: a · b = 0
    public boolean perpendicular(double x, double y, double z) {
        return (this.x * x + this.y * y + this.z * z) == 0;
    }
    
    // d) Perpendicular: |a + b|² = |a|² + |b|²
    public boolean perpendicular(AlgebraVectorial a, AlgebraVectorial b, String tipo) {
        double sumaCuad = Math.pow(a.x + b.x, 2) + Math.pow(a.y + b.y, 2) + Math.pow(a.z + b.z, 2);
        double aCuad = Math.pow(a.x, 2) + Math.pow(a.y, 2) + Math.pow(a.z, 2);
        double bCuad = Math.pow(b.x, 2) + Math.pow(b.y, 2) + Math.pow(b.z, 2);
        return Math.abs(sumaCuad - (aCuad + bCuad)) < 0.0001;
    }
    
    // e) Paralela: a = r*b
    public boolean paralela(AlgebraVectorial a, AlgebraVectorial b) {
        if (b.x == 0 || b.y == 0 || b.z == 0) return false;
        double r1 = a.x / b.x;
        double r2 = a.y / b.y;
        double r3 = a.z / b.z;
        return Math.abs(r1 - r2) < 0.0001 && Math.abs(r1 - r3) < 0.0001;
    }
    
    // f) Paralela: a × b = 0
    public boolean paralela(AlgebraVectorial a) {
        double crossX = this.y * a.z - this.z * a.y;
        double crossY = this.z * a.x - this.x * a.z;
        double crossZ = this.x * a.y - this.y * a.x;
        double magnitud = Math.sqrt(crossX * crossX + crossY * crossY + crossZ * crossZ);
        return magnitud < 0.0001;
    }
    
    // g) Proyección de a sobre b
    public AlgebraVectorial proyeccion(AlgebraVectorial a, AlgebraVectorial b) {
        double productoEscalar = a.x * b.x + a.y * b.y + a.z * b.z;
        double magnitudBCuad = b.x * b.x + b.y * b.y + b.z * b.z;
        double factor = productoEscalar / magnitudBCuad;
        return new AlgebraVectorial(factor * b.x, factor * b.y, factor * b.z);
    }
    
    // h) Componente de a en b
    public double componente(AlgebraVectorial a, AlgebraVectorial b) {
        double productoEscalar = a.x * b.x + a.y * b.y + a.z * b.z;
        double magnitudB = Math.sqrt(b.x * b.x + b.y * b.y + b.z * b.z);
        return productoEscalar / magnitudB;
    }
    
    @Override
    public String toString() {
        return String.format("Vector(%.2f, %.2f, %.2f)", x, y, z);
    }
}
