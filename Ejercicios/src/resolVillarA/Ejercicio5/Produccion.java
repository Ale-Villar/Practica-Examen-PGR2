package resolVillarA.Ejercicio5;

public class Produccion extends Empleado{
    private String turno;
    public Produccion(String nombre, int DNI, double sueldoBase, int Antiguedad, String turno) {
    super(nombre, DNI, sueldoBase, Antiguedad);
    this.turno = turno;
        }
    @Override
    public double calcularSalario(){
        double sueldoNeto = 0;
        if(turno.equalsIgnoreCase("diurno")){
            sueldoNeto = sueldoBase - (sueldoBase * 0.08);
        }else if(turno.equalsIgnoreCase("nocturno")){
            sueldoNeto = sueldoBase - (sueldoBase * 0.06);
        }
        if(Antiguedad>15){
            sueldoNeto = sueldoNeto + (sueldoNeto*0.20);
        }else if (Antiguedad>10){
            sueldoNeto = sueldoNeto + (sueldoNeto*0.15);
        }else if (Antiguedad>5){
            sueldoNeto = sueldoNeto + (sueldoNeto*0.10);
        }
        return sueldoNeto;
    }
    @Override public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Sueldo Neto: "+calcularSalario());
        System.out.println("Turno: "+turno);
    }
}
