package unlam.diseno.comportamiento.observer;

public class Administracion implements ILibroEstadoMalo {
    @Override
    public void update() {
        System.out.println("Me enteré que el libro está en mal estado");
    }
}
