package unlam.diseno.estructurales.composite;

public class Empleado implements ISueldo {
    private double sueldo;

    public Empleado(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public double getSueldo() {
        return sueldo;
    }
}
