package unlam.diseno.comportamiento.chainOfResponsability;

public interface IAprobador {
    IAprobador getNext();
    void setNext(IAprobador next);
    void solicitudPrestamo(int monto);
}
