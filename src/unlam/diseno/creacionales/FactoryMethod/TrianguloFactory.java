package unlam.diseno.creacionales.FactoryMethod;

public class TrianguloFactory implements  TrianguloFactoryMethod{
    @Override
    public Triangulo crearTriangulo(int ladoA, int ladoB, int ladoC) {
        if( (ladoA == ladoB) && (ladoB == ladoC)) {
            return new Equilatero(ladoA, ladoB, ladoC);
        } else if( (ladoA != ladoB) && (ladoB != ladoC) && (ladoA != ladoC)) {
            return  new Escaleno(ladoA, ladoB, ladoC);
        } else {
            return  new Isoceles(ladoA, ladoB, ladoC);
        }
    }
}
