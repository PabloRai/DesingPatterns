package unlam.diseno.creacionales.abstractFactory;

public class Rojo extends Color{
    private boolean isPrimario;

    @Override
    public void colorea(Tv tv) {
        System.out.println("Pintando de color rojo el " + tv.getDescripcion());
    }

    public boolean isPrimario() {
        return isPrimario;
    }

    public void setPrimario(boolean primario) {
        isPrimario = primario;
    }
}
