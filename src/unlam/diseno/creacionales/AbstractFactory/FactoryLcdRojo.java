package unlam.diseno.creacionales.AbstractFactory;

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
