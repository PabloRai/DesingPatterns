package unlam.diseno.estructurales.decorator;

public class Gasoil extends AutoDecorator {
    public Gasoil(Vendible vendible) {
        super(vendible);
    }

    @Override
    public String getDescripcion() {
        return getVendible().getDescripcion() + " gasoil";
    }

    @Override
    public int getPrecio() {
        return getVendible().getPrecio() + 2000;
    }
}
