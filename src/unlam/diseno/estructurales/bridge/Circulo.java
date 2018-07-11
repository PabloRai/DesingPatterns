package unlam.diseno.estructurales.bridge;


// Abstraccion refinada
public class Circulo extends Forma {
    private double x,y,z;

    public Circulo(Dibuja dibuja, double x, double y, double z) {
        super(dibuja);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void dibuja() {
        dibujaCirculo(x, y, z);
    }
}
