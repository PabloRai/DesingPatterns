package unlam.diseno.comportamiento.chainOfResponsability;

public class Lider implements IAprobador {
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
        if(monto >= 10000 && monto < 50000) {
            System.out.println("Lo tomo yo, el lider");
        } else {
            next.solicitudPrestamo(monto);
        }
    }
}
