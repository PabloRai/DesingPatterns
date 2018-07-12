package unlam.diseno.comportamiento.state;

public class Cerrada implements IEstadoVentanilla {
    @Override
    public void atende(Persona persona) {
        System.out.println("La ventanilla esta cerrada!");
    }
}
