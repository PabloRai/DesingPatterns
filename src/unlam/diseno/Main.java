package unlam.diseno;

import unlam.diseno.creacionales.abstractFactory.*;
import unlam.diseno.creacionales.factoryMethod.Triangulo;
import unlam.diseno.creacionales.factoryMethod.TrianguloFactory;
import unlam.diseno.creacionales.prototype.TvPrototype;
import unlam.diseno.creacionales.builder.AutoDirector;
import unlam.diseno.creacionales.builder.AutoProduct;
import unlam.diseno.creacionales.builder.FiatBuilder;
import unlam.diseno.creacionales.singleton.Singleton;
import unlam.diseno.estructurales.flyweight.Alumno;

public class Main {

    public static void main(String[] args) {
        testFlyweight();
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

    private static void testAbstractFactory() {
        TvAbstractFactory lcdFactory = new FactoryLcdRojo();
        EnsamblajeTv ensamblajeTv = new EnsamblajeTv(lcdFactory);
        TvAbstractFactory plasmaFactory = new FactoryPlasmaBlanco();
        EnsamblajeTv ensamblajeTv1 = new EnsamblajeTv(plasmaFactory);
    }

    private static void testPrototype() {
        TvPrototype tvPrototype = new TvPrototype();
        try {
            Tv plasma = (Plasma) tvPrototype.getPrototipo("Plasma");
            System.out.println(plasma.getPrecio());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }


    private  static void testFactoryMethod() {
        TrianguloFactory trianguloFactory = new TrianguloFactory();
        Triangulo triangulo = trianguloFactory.crearTriangulo(10, 10, 10);
        System.out.println(triangulo.getDescripcion());
        triangulo = trianguloFactory.crearTriangulo(10, 10, 11);
        System.out.println(triangulo.getDescripcion());
        triangulo = trianguloFactory.crearTriangulo(10, 11, 12);
        System.out.println(triangulo.getDescripcion());
    }

    private static void testFlyweight() {
        // El cliente (el main) no debería instanciar directamente a la clase concreta alumno, debería de existir una AlumnoFactory
        double promedioGeneral = 6;
        String[] nombreAlumnos = {"Roberto", "Carlos", "Bolanios"};
        String[] apellidoAlumnos = {"A", "B", "C"};
        double[] promedioAlumnos = {6, 7, 9};
        Alumno alumno = new Alumno(promedioGeneral);
        for (int i = 0; i < 3; i++) {
            alumno.setNombre(nombreAlumnos[i]);
            alumno.setApellido(apellidoAlumnos[i]);
            alumno.setPromedioAlumno(promedioAlumnos[i]);
            System.out.println(nombreAlumnos[i] + " " + alumno.compara());
        }
    }
}
