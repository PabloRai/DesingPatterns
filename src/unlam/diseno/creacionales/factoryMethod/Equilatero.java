package unlam.diseno.creacionales.factoryMethod;

public class Equilatero extends Triangulo {

    public Equilatero(int ladoA, int ladoB, int ladoC) {
        super(ladoA, ladoB, ladoC);
    }

    @Override
    public String getDescripcion() {
        return "Soy un triangulo equilatero";
    }
}
