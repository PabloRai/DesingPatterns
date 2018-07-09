package unlam.diseno.creacionales.builder;

/*
Permite la creación de un objeto complejo,
a partir de una variedad de partes que contribuyen individualmente a la creación y ensamblación del objeto mencionado.
Hace uso de la frase "divide y conquistarás".
Por otro lado, centraliza el proceso de creación en un único punto, de tal forma que el mismo proceso de construcción
pueda crear representaciones diferentes.
Los objetos que dependen de un algoritmo tendrán que cambiar cuando el algoritmo cambia.
Por lo tanto, los algoritmos que estén expuestos a dicho cambio deberían ser separados,
permitiendo de esta manera reutilizar dichos algoritmos para crear diferentes representaciones.
 */

public abstract class AutoBuilder {
    protected AutoProduct auto;

    protected AutoProduct getAuto() {
        return auto;
    }

    protected void crearAuto() {
        auto = new AutoProduct();
    }

    public abstract void buildMarca();
    public abstract void buildModelo();
    public abstract void buildPuertas();
    public abstract void buildMotor();
}
