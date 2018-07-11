package unlam.diseno.creacionales.prototype;

/*
El patrón prototype tiene un objetivo muy sencillo: crear a partir de un modelo.
Permite crear objetos prediseñados sin conocer detalles de cómo crearlos.
Esto lo logra especificando los prototipos de objetos a crear. Los nuevos objetos que se crearán de los prototipos, en realidad, son clonados.
Vale decir, tiene como finalidad crear nuevos objetos duplicándolos, clonando una instancia creada previamente.
 */

import unlam.diseno.creacionales.abstractFactory.LCD;
import unlam.diseno.creacionales.abstractFactory.Plasma;
import unlam.diseno.creacionales.abstractFactory.Tv;

import java.util.HashMap;

public class TvPrototype {

    private HashMap<String, Tv> prototipos = new HashMap<>();

    public TvPrototype() {
        Plasma plasma = new Plasma( "Sony",  43,  "Full hd",  10000,  13.2,  1);
        LCD lcd = new LCD("LG", 32, "4k", 15000, 500 );
        prototipos.put("LCD", lcd);
        prototipos.put("Plasma", plasma);
    }

    public Object getPrototipo(String tipo) throws CloneNotSupportedException {
        return prototipos.get(tipo).clone();
    }
}
