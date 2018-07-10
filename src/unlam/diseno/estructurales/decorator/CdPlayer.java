package unlam.diseno.estructurales.decorator;

public class CdPlayer extends AutoDecorator{
    public CdPlayer(Vendible vendible) {
        super(vendible);
    }

    @Override
    public String getDescripcion() {
        return getVendible().getDescripcion() + " cd player";
    }

    @Override
    public int getPrecio() {
        return getVendible().getPrecio() + 500;
    }
}
