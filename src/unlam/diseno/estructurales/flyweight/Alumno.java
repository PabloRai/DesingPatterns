package unlam.diseno.estructurales.flyweight;

public class Alumno {
    private String nombre;
    private String apellido;
    private double promedioAlumno;
    private double proomedioGeneral;

    public Alumno(double proomedioGeneral) {
        this.proomedioGeneral = proomedioGeneral;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPromedioAlumno(double promedioAlumno) {
        this.promedioAlumno = promedioAlumno;
    }

    public double compara() {
        return (promedioAlumno / proomedioGeneral -1) * 100;
    }
}
