package unlam.diseno.creacionales.factoryMethod;

public class Isoceles extends Triangulo{

    public Isoceles(int ladoA, int ladoB, int ladoC) {
        super(ladoA, ladoB, ladoC);
    }

    @Override
    public String getDescripcion() {
        return "Soy un triangulo isoceles";
    }
}
