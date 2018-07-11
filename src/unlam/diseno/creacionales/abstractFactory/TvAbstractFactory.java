package unlam.diseno.creacionales.abstractFactory;
/*
    Este patrón crea diferentes familias de objetos. Su objetivo principal es soportar múltiples estándares que vienen definidos
    por las diferentes jerarquías de herencia de objetos. Es similar al Factory Method, sólo que esta orientado a combinar productos.
*/

public abstract class TvAbstractFactory {
    public abstract Tv crearTv();
    public abstract Color crearColor();

}
