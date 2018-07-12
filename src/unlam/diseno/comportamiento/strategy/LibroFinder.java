package unlam.diseno.comportamiento.strategy;

public class LibroFinder {
    private LibroStrategy strategy;
    public Libro findLibro(Persona persona, String titulo) {
        if(persona instanceof Profesor) {
            strategy = new EstadoBuenoStrategy();
        } else if (persona instanceof  Alumno) {
            strategy = new EstadoRegularStrategy();
        }
        return strategy.findLibro(titulo);
    }
}
