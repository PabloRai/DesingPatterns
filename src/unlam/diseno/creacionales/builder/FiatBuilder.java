package unlam.diseno.creacionales.builder;

public class FiatBuilder extends AutoBuilder {
    @Override
    public void buildMarca() {
        auto.setMarca("Fiat");
    }

    @Override
    public void buildModelo() {
        auto.setModelo("Palio");
    }

    @Override
    public void buildPuertas() {
        auto.setCantidadPuertas(3);
    }

    @Override
    public void buildMotor() {
        Motor motor = new Motor();
        motor.setNumero(123);
        motor.setPotencia(250);
    }
}
