package unlam.diseno.estructurales.decorator;

public class FiatUno extends Auto {
    @Override
    public String getDescripcion() {
        return "Fiat Uno modelo 2006";
    }

    @Override
    public int getPrecio() {
        return 15000;
    }
}
