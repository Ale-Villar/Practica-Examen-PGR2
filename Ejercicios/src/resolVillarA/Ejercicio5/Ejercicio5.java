package resolVillarA.Ejercicio5;
import java.util.ArrayList;
import java.util.Iterator;
public class Ejercicio5 {
public static void main(String[] args) {
    ArrayList<Empleado> listaEmpleado = new ArrayList<>();
    listaEmpleado.add(new Administrativo("Anaya",24567890,850000,12, true ));
    listaEmpleado.add(new Administrativo("Kenneth",31234567,620000,5, false ));
    listaEmpleado.add(new Produccion("Denis",40987654,450000,2, "diurno"));
    listaEmpleado.add(new Produccion("Tiago",28111222,1100000,15, "nocturno"));
    listaEmpleado.add(new Produccion("Chanel",35444555,540000,8, "diurno"));

    Iterator<Empleado> it = listaEmpleado.iterator();
    System.out.println("====Lista de Empleados====");
    while (it.hasNext()) {
            Empleado emp = it.next();
            emp.mostrarInformacion(); 
            System.out.println("----------------------------"); // Un separador para que quede lindo
        }
    System.out.println("Total de empleados registrados: " + Empleado.cantidadEmpleados);
    }

}
