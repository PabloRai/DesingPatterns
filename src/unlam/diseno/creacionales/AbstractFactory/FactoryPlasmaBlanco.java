package unlam.diseno.creacionales.AbstractFactory;

public class FactoryPlasmaBlanco extends TvAbstractFactory {
    @Override
    public Tv crearTv() {
        return new Plasma();
    }

    @Override
    public Color crearColor() {
        return new Blanco();
    }
}
