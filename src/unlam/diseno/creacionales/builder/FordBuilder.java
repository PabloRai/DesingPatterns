package unlam.diseno.creacionales.builder;

public class FordBuilder extends AutoBuilder {
    @Override
    public void buildMarca() {
        auto.setMarca("Ford");
    }

    @Override
    public void buildModelo() {
        auto.setModelo("Focus");
    }

    @Override
    public void buildPuertas() {
        auto.setCantidadPuertas(4);
    }

    @Override
    public void buildMotor() {
        Motor motor = new Motor();
        motor.setNumero(456);
        motor.setPotencia(125);
    }
}

