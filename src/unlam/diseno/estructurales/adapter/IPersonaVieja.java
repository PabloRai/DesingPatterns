package unlam.diseno.estructurales.adapter;

import java.util.Date;

public interface IPersonaVieja {
    String getNombre();
    void setNombre(String nombre);
    String getApellido();
    void setApellido(String apellido);
    Date getFechaDeNacimiento();
    void setFechaDeNacimiento(Date fechaDeNacimiento);
}
