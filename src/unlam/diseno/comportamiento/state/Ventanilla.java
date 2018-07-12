package unlam.diseno.comportamiento.state;

public class Ventanilla {
    // Acá faltarí=ian más atributos..
    private IEstadoVentanilla estadoVentanilla;


    public Ventanilla() {
        estadoVentanilla = new Abierta();
    }
    public void atende(Persona persona) {
        estadoVentanilla.atende(persona);
    }

    public void abrite() {
        estadoVentanilla = new Abierta();
    }

    public void cerrate() {
        estadoVentanilla = new Cerrada();
    }
}
