package resolVillarA.Ejercicio5;

public class Administrativo extends Empleado {
    private boolean esPresencial = true;
    public Administrativo(String nombre, int DNI, double sueldoBase, int Antiguedad, boolean esPresencial) {
        super(nombre, DNI, sueldoBase, Antiguedad);
        this.esPresencial = esPresencial;
    }
    @Override
    public double calcularSalario() {
       double sueldoNeto = 0;

        if(esPresencial){
         sueldoNeto = sueldoBase - (sueldoBase * 0.08);
        }else{
           sueldoNeto = sueldoBase - (sueldoBase * 0.12);
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

        if(esPresencial){
            System.out.println("Modalidad Presencial");
        }else{
            System.out.println("Modalidad Remota");
        }
    }
    
}
