package unlam.diseno.creacionales.factoryMethod;

public class Escaleno extends Triangulo {

    public Escaleno(int ladoA, int ladoB, int ladoC) {
        super(ladoA, ladoB, ladoC);
    }

    @Override
    public String getDescripcion() {
        return "Soy un triangulo escaleno";
    }
}
