package unlam.diseno.creacionales.AbstractFactory;

public class Plasma extends Tv {
    private double angulo;
    private double tiempoDeRespuesta;

    public Plasma(String marca, int pulgadas, String descripcion, double precio, double angulo, double tiempoDeRespuesta) {
        super(marca, pulgadas, descripcion, precio);
        this.angulo = angulo;
        this.tiempoDeRespuesta = tiempoDeRespuesta;
    }

    public Plasma() {
        setDescripcion("Plasma");
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getTiempoDeRespuesta() {
        return tiempoDeRespuesta;
    }

    public void setTiempoDeRespuesta(double tiempoDeRespuesta) {
        this.tiempoDeRespuesta = tiempoDeRespuesta;
    }
}
