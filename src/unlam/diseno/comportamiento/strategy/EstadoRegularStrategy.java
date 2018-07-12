package unlam.diseno.comportamiento.strategy;

public class EstadoRegularStrategy implements LibroStrategy {
    @Override
    public Libro findLibro(String titulo) {
        return new Libro("Pepe con estado regular");
    }
}
