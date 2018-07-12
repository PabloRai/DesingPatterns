package unlam.diseno.comportamiento.state;

public class Abierta implements IEstadoVentanilla {
    @Override
    public void atende(Persona persona) {
        System.out.println("Atendiendo a " + persona.getNombre());
    }
}
