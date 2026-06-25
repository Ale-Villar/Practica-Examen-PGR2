package resolVillarA.Ejercicio5;

abstract class Empleado implements Calculable {
    protected String nombre;
    protected int DNI;
    protected double sueldoBase;
    protected int Antiguedad;
    public static int cantidadEmpleados = 0;

    public Empleado(String nombre, int DNI, double sueldoBase, int Antiguedad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldoBase = sueldoBase;
        this.Antiguedad = Antiguedad;
        cantidadEmpleados++;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("DNI: "+DNI);
        System.out.println("Sueldo Base: "+sueldoBase);
        System.out.println("Antiguedad: "+Antiguedad);
    }

}
