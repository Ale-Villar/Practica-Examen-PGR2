package resolVillarA.Ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        // 1. Declaramos el Scanner bien arriba para poder usarlo en todo el main
        Scanner scanner = new Scanner(System.in);
        
        int opcionElegida = 0;
        boolean entradaValida = false;

        // ==========================================
        // REQUERIMIENTO 1.1: EL MENÚ CON TRY-CATCH
        // ==========================================
        while (!entradaValida) {
            try {
                System.out.println("--- MENÚ DE LA TIENDA ---");
                System.out.println("1. Comprar Remera ($20000)");
                System.out.println("2. Comprar Pantalon Cargo ($40000)");
                System.out.println("3. Comprar Buzo ($80000)");
                System.out.println("4. Salir");
                System.out.print("Ingrese la Opcion que desea: ");
                
                // Intentamos leer el número
                opcionElegida = scanner.nextInt(); 
                scanner.nextLine(); // Limpiamos el "Enter"
                
                // Si llegamos acá, ingresó un número correcto y salimos del bucle
                entradaValida = true; 

            } catch (InputMismatchException e) {
                // Si ingresó texto en vez de número, atajamos el error
                System.out.println("Error: Entrada no valida");
                scanner.nextLine(); // Limpiamos la basura del teclado para que no se trabe
            }
        }

        // ==========================================
        // VARIABLES GLOBALES DEL PRECIO
        // ==========================================
        double precioBase = 0.0;
        boolean vaAComprar = true;

        // ==========================================
        // SELECCIÓN DE PRODUCTOS
        // ==========================================
        if (opcionElegida == 1) {
            precioBase = 20000;
            System.out.println("Producto: Remera.");
        } else if (opcionElegida == 2) {
            precioBase = 40000;
            System.out.println("Producto: Pantalon Cargo");
        } else if (opcionElegida == 3) {
            precioBase = 80000;
            System.out.println("Producto: Buzo");
        } else if (opcionElegida == 4) {
            System.out.println("Gracias por su visita");
            vaAComprar = false;
        } else {
            System.out.println("Opcion no valida");
            vaAComprar = false;
        }

        // ==========================================
        // REQUERIMIENTO 1.2: VALIDACIÓN DE CUPONES
        // ==========================================
        if (vaAComprar) {
            System.out.print("¿Tiene un cupón de descuento? Ingréselo (o deje vacío): ");
            String cuponUsuario = scanner.nextLine();

            try {
                // Mandamos el texto y el precioBase a nuestro método verificador
                double precioFinal = aplicarDescuento(cuponUsuario, precioBase);
                System.out.println("¡Cupón aplicado con éxito!");
                System.out.println("El total a pagar es: $" + precioFinal);
                
            } catch (CuponInvalidoException e) {
                // Si la alarma de cupón falso suena, mostramos tu mensaje de error
                System.out.println(e.getMessage());
                // Y le cobramos sin el descuento
                System.out.println("El total a pagar es: $" + precioBase);
            }
        }
        
        scanner.close(); // Cerramos la herramienta
    }

    // ==========================================
    // MÉTODO AUXILIAR PARA EL CUPÓN
    // ==========================================
    public static double aplicarDescuento(String cupon, double precioActual) throws CuponInvalidoException {
        // Si escribió algo y NO es "PROMO10", lanzamos la excepción manualmente
        if (!cupon.isEmpty() && !cupon.equals("PROMO10")) {
            throw new CuponInvalidoException("El cupón ingresado no es válido o ha expirado");
        } 
        
        // Si puso exactamente "PROMO10", le descontamos el 10%
        if (cupon.equals("PROMO10")) {
            return precioActual * 0.90; 
        }

        // Si lo dejó vacío, devuelve el precio original
        return precioActual;
    }
}