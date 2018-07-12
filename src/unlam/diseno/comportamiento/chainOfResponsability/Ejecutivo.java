package unlam.diseno.comportamiento.chainOfResponsability;

public class Ejecutivo implements IAprobador {
    private IAprobador next;

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
        if(monto < 10000) {
            System.out.println("El monto es menor a 10000, lo tomo yo, el Ejecutivo");
        } else {
            next.solicitudPrestamo(monto);
        }
    }
}
