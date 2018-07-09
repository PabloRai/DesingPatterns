package unlam.diseno.creacionales.AbstractFactory;

public class EnsamblajeTv {

    public EnsamblajeTv(TvAbstractFactory factory) {
        Tv tv = factory.crearTv();
        Color color = factory.crearColor();
        color.colorea(tv);
    }
}
