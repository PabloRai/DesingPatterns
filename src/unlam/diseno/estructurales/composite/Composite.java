package unlam.diseno.estructurales.composite;

import java.util.ArrayList;

public class Composite implements ISueldo {
    private ArrayList<ISueldo> empleados = new ArrayList<>();

    @Override
    public double getSueldo() {
        double resultado = 0;
        for (ISueldo empleado: empleados) {
            resultado += empleado.getSueldo();
        }
        return resultado;
    }

    public void agregarEmpleado(ISueldo empleado) {
        empleados.add(empleado);
    }
}
