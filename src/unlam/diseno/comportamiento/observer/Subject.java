package unlam.diseno.comportamiento.observer;

public interface Subject {
    void deattach(ILibroEstadoMalo iLibroEstadoMalo);
    void attach(ILibroEstadoMalo iLibroEstadoMalo);
    void notifyObservers();

}
