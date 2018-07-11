package unlam.diseno.creacionales.abstractFactory;

public class EnsamblajeTv {

    public EnsamblajeTv(TvAbstractFactory factory) {
        Tv tv = factory.crearTv();
        Color color = factory.crearColor();
        color.colorea(tv);
    }
}
