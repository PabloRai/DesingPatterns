package unlam.diseno.comportamiento.observer;

import java.util.ArrayList;

public class AlarmaLibro implements Subject {
    private static ArrayList<ILibroEstadoMalo> observadores = new ArrayList<>();

    public void attach(ILibroEstadoMalo observador) {
        observadores.add(observador);
    }

    public void deattach(ILibroEstadoMalo observador) {
        observadores.remove(observador);
    }

    public void notifyObservers() {
        for (ILibroEstadoMalo observer: observadores) {
            observer.update();
        }
    }
}
