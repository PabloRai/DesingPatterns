package unlam.diseno.comportamiento.chainOfResponsability;

public class Banco implements IAprobador {
    IAprobador next;
    @Override
    public IAprobador getNext() {
        return next;
    }

    @Override
    public void setNext(IAprobador next) {
        this.next = next;
    }

    @Override
    public void solicitudPrestamo(int monto) {
        next = new Ejecutivo();
        next.setNext(new Lider());
        next.solicitudPrestamo(monto);
    }
}
