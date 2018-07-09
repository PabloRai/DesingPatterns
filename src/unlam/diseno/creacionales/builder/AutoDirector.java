package unlam.diseno.creacionales.builder;

public class AutoDirector {

    private AutoBuilder autoBuilder;

    public void construirAuto() {
        autoBuilder.crearAuto();
        autoBuilder.buildMarca();
        autoBuilder.buildModelo();
        autoBuilder.buildPuertas();
        autoBuilder.buildMotor();
    }

    public AutoProduct getAuto() {
        return autoBuilder.getAuto();
    }

    public void setAutoBuilder(AutoBuilder autoBuilder) {
        this.autoBuilder = autoBuilder;
    }
}
