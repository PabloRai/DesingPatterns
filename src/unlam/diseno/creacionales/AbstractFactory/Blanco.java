package unlam.diseno.creacionales.AbstractFactory;

public class Blanco extends Color{
    private boolean isPrimario;

    @Override
    public void colorea(Tv tv) {
        System.out.println("Pintando de color blanco el " + tv.getDescripcion());
    }

    public boolean isPrimario() {
        return isPrimario;
    }

    public void setPrimario(boolean primario) {
        isPrimario = primario;
    }
}
