package unlam.diseno.creacionales.abstractFactory;

public abstract class Color {
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public abstract void colorea(Tv tv);
}
