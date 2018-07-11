package unlam.diseno.estructurales.bridge;

// Clase abstraction

public abstract class Forma {
    private Dibuja dibuja;

    public Forma(Dibuja dibuja) {
        this.dibuja = dibuja;
    }

    public abstract void dibuja();

    public void dibujaCirculo(double x, double y, double z) {
        dibuja.dibujaCirculo(x,y,z);
    }

    public void dibujaRectangulo(double x1, double y1, double x2, double y2) {
        dibuja.dibujaRectangulo(x1, y1, x2, y2);
    }
}
