

import java.util.ArrayList;
import java.util.Iterator;
public class Ejercicio1 {
    public static void main(String[] args) {
     ArrayList<Vehiculo> listaVehiculo = new ArrayList<>();

     listaVehiculo.add(new Auto("ABC123", "Toyota", 800000, 4));
     listaVehiculo.add(new Auto("ABC456", "BMW", 500000, 3));
     listaVehiculo.add(new Auto("ABC789", "Subaru", 900000, 4));

     listaVehiculo.add(new Moto("CC333CC", "Zanella", 200000, 110));
     listaVehiculo.add(new Moto("DD444DD", "Honda", 600000, 300));
     listaVehiculo.add(new Moto("EE555EE", "Ducati", 1200000, 600)); 

     int contadorSuperanMillon = 0;

     Iterator<Vehiculo> it = listaVehiculo.iterator();

     System.out.println("--- REPORTE DE ALQUILERES (Base: 5 días) ---");
     while (it.hasNext()) {
         Vehiculo v = it.next();
            double precioEfectivo = v.calcularMontoTotal(5,"Efectivo",1);
            double precioTarjeta = v.calcularMontoTotal(5,"Tarjeta",3);

            System.out.println("Vehiculo: "+ v.getMarca()+ " | Patente: "+ v.getPatente());
            System.out.println(" > Total en Efectivo: $" + precioEfectivo);
            System.out.println(" > Total en Tarjeta (3 cuotas): $" + precioTarjeta);

            if (precioTarjeta > 1000000) {
            contadorSuperanMillon++;
        }
     }
     System.out.println("Cantidad de vehículos que superan el millón: " + contadorSuperanMillon);
    }
}