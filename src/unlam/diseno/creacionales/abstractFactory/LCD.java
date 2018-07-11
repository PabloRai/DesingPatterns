package unlam.diseno.creacionales.abstractFactory;

public class LCD extends Tv {
    private double costoDeFabricacion;

    public LCD() {
        setDescripcion("LCD");
    }

    public LCD(String marca, int pulgadas, String descripcion, double precio, double costoDeFabricacion) {
        super(marca, pulgadas, descripcion, precio);
        this.costoDeFabricacion = costoDeFabricacion;
    }

    public double getCostoDeFabricacion() {
        return costoDeFabricacion;
    }

    public void setCostoDeFabricacion(double costoDeFabricacion) {
        this.costoDeFabricacion = costoDeFabricacion;
    }
}
