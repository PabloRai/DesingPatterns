package unlam.diseno.creacionales.abstractFactory;

public class FactoryLcdRojo extends TvAbstractFactory {
    @Override
    public Tv crearTv() {
        return new LCD();
    }

    @Override
    public Color crearColor() {
        return new Rojo();
    }
}
