package unlam.diseno.estructurales.bridge;


// Abstraccion refinada
public class Rectangulo extends Forma {
    private double x1,y1,x2,y2;

    public Rectangulo(Dibuja dibuja, double x1, double y1, double x2, double y2) {
        super(dibuja);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void dibuja() {
        dibujaRectangulo(x1, y1, x2, y2);
    }
}
