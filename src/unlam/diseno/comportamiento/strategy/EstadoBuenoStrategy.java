package unlam.diseno.comportamiento.strategy;

public class EstadoBuenoStrategy implements LibroStrategy {
    @Override
    public Libro findLibro(String titulo) {
        return new Libro("Pepe con estado bueno");
    }
}
