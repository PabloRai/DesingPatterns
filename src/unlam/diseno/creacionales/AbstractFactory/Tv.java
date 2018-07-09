package unlam.diseno.creacionales.AbstractFactory;

public class Tv implements Cloneable{
    private String marca;
    private int pulgadas;
    private String descripcion;
    private double precio;

    public Tv() {}

    public Tv(String marca, int pulgadas, String descripcion, double precio) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
