package resolVillarA.Ejercicio2;
import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio2 {

    public static void main(String[] args) {
        ArrayList<Estudiante> listaEstudiante = new ArrayList<>();
        listaEstudiante.add(new Estudiante("Bautista",20,6.5));
        listaEstudiante.add(new Estudiante("Alejandro", 22, 3.5));
        listaEstudiante.add(new Estudiante("Lorena", 44, 8.5 ));

        Iterator<Estudiante> it = listaEstudiante.iterator();

        System.out.println("====Calificaciones de los Estudiantes====");

        while (it.hasNext()) {
        Estudiante est = it.next();
        
        // Llamamos a los métodos que pide el enunciado
        est.mostrarRol(); 
        System.out.println(est.generarReporte());
        System.out.println("- - - - - - - - - - - - - - - -");
        
        }
    }
}
