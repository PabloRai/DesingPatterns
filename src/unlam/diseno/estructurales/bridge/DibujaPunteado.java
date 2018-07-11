package unlam.diseno.estructurales.bridge;
// Implementacion concreta
public class DibujaPunteado extends  Dibuja {
    @Override
    public void dibujaRectangulo(double x1, double y1, double x2, double y2) {
        System.out.println("Dibujando un rectangulo punteado");
    }

    @Override
    public void dibujaCirculo(double x, double y, double z) {
        System.out.println("Dibujando un circulo punteado");
    }
}
