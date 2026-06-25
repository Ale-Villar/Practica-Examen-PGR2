package resolVillarA.Ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        GestionHotel gestor = new GestionHotel();

        // 1. Mayúsculas corregidas y el orden de los datos arreglado (Tipo, Noches, Código)
        gestor.registrarHabitacion(new Habitacion("Suite", 2, "A101"));
        gestor.registrarHabitacion(new Habitacion("Suite", 3, "A101")); // Esta suma 3 noches más a la A101
        gestor.registrarHabitacion(new Habitacion("Estándar", 4, "B202"));

    // 2. Unificamos el nombre a "scanner"
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el codigo de la Habitacion: ");
        String codigoBuscado = scanner.nextLine();

        try {
            Habitacion encontrada = gestor.buscarHabitacion(codigoBuscado);
        
            System.out.println("¡Búsqueda Exitosa!");
            System.out.println("Su Habitacion es: " + encontrada.getTipo());
            System.out.println("Noches totales reservadas: " + encontrada.getNochesReservadas());
        } catch (HabitacionNoEncontradaException e) {
        System.out.println(e.getMessage());
        }

        // Cerramos usando el nombre correcto
        scanner.close();
    }
}
