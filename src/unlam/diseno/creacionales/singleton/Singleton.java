package unlam.diseno.creacionales.singleton;
/*
La idea del patrón singleton es proveer un mecanismo para limitar el número de instancias de una clase.
Por lo tanto el mismo objeto es siempre compartido por distintas partes del código.
Puede ser visto como una solución más elegante,
para una variable global porque los datos son abstraídos por detrás de la interfaz que publicala clase singleton.
Dicho de otra manera, esta patrón busca garantizar que una clase sólo tenga una instancia y proporcionar un punto de acceso global a ella.
 */
public class Singleton {
    // Volatile singifica que la variable va a ser modificada por varios threds y que no debe ser cacheada
    private static volatile Singleton instance;
    private String nombre;

    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized(Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
