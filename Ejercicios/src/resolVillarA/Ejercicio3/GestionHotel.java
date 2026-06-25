package resolVillarA.Ejercicio3;
import java.util.HashMap;
public class GestionHotel {
    private HashMap<String, Habitacion> mapaHabitaciones = new HashMap<>();
    
    public void registrarHabitacion(Habitacion h){
        String codigo = h.getCodigo();

        if (mapaHabitaciones.containsKey(codigo)){
            Habitacion habitacionExistente = mapaHabitaciones.get(codigo);
            int totalNoches = habitacionExistente.getNochesReservadas() + h.getNochesReservadas();
            habitacionExistente.setNochesReservadas(totalNoches);
        } else {
            mapaHabitaciones.put(codigo, h);
        }
    }

    public Habitacion buscarHabitacion(String codigo) throws HabitacionNoEncontradaException {
        if (!mapaHabitaciones.containsKey(codigo)) {
            
            throw new HabitacionNoEncontradaException("Error: La habitación con código " + codigo + " no existe en el sistema");
        }
        
      
        return mapaHabitaciones.get(codigo);
    }
}
