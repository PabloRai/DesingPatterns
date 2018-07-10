package unlam.diseno.estructurales.adapter;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ViejaToNuevaAdapter implements IPersonaNueva {
    private PersonaVieja personaVieja;

    public  ViejaToNuevaAdapter(PersonaVieja personaVieja) {
        this.personaVieja = personaVieja;
    }
    @Override
    public String getNombre() {
        return personaVieja.getNombre() + " " + personaVieja.getApellido();
    }

    @Override
    public void setNombre(String nombre) {
        String[] nombreYApellido = nombre.split(" ");
        personaVieja.setNombre(nombreYApellido[0]);
        personaVieja.setApellido(nombreYApellido[1]);
    }

    @Override
    public int getEdad() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int firstYear = gregorianCalendar.get(Calendar.YEAR);
        gregorianCalendar.setTime(personaVieja.getFechaDeNacimiento());
        return firstYear - gregorianCalendar.get(Calendar.YEAR);
    }

    @Override
    public void setEdad(int edad) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int actualYear = gregorianCalendar.get(Calendar.YEAR);
        gregorianCalendar.set(Calendar.YEAR, actualYear - edad);
        personaVieja.setFechaDeNacimiento(gregorianCalendar.getTime());
    }
}
