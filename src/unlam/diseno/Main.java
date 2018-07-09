package unlam.diseno;

import unlam.diseno.creacionales.builder.AutoDirector;
import unlam.diseno.creacionales.builder.AutoProduct;
import unlam.diseno.creacionales.builder.FiatBuilder;
import unlam.diseno.creacionales.singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        testBuilder();
    }


    private static void testSingleton() {
        Singleton singleton = Singleton.getInstance();
        int hashcodeInstance = System.identityHashCode(singleton);
        singleton.setNombre("Pepe");
        System.out.println("Nombre del singleton: " + singleton.getNombre());
        singleton = Singleton.getInstance();
        singleton.setNombre("Magia");
        System.out.println("Nombre del singleton: " + singleton.getNombre());
        //Testeo de terco.
        if (hashcodeInstance == System.identityHashCode(singleton)) {
            System.out.println("Los hashcodes son iguales lo que implica la misma instancia.");
        }
    }

    private static void testBuilder() {
        AutoProduct auto;
        AutoDirector autoDirector = new AutoDirector();
        autoDirector.setAutoBuilder(new FiatBuilder());
        autoDirector.construirAuto();
        auto = autoDirector.getAuto();
        System.out.println(auto.getMarca());
        System.out.println(auto.getModelo());
    }
}
