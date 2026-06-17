package resolVillarA.Ejercicio2;

class Estudiante extends Persona implements Informable{
    private double notaFinal;
    public Estudiante(String nombre, int edad, double notaFinal) {
        super(nombre, edad);
        this.notaFinal = notaFinal;
    }
    public double getNotaFinal() {
        return notaFinal;
    }
    public void setNotaFinal(double notaFinal) {
        if (notaFinal>= 0 && notaFinal <=10){
        this.notaFinal = notaFinal;} else{
            System.out.println("La nota final debe estar entre 0 y 10");
        }
    }
    @Override
    public void mostrarRol() {
        System.out.println("Rol: Alumno");
    }
    @Override
    public String generarReporte(){
        String condicion;
        if (this.notaFinal>=7) {
            condicion = "Promocionado";
        }else if (this.notaFinal>=6 && this.notaFinal<=7){
            condicion = "Regular";
        }else{
            condicion = "Desaprobado";
        }

        return "Alumno: " + this.nombre + " | Edad: " + this.edad + " | Nota: " + this.notaFinal + " | Estado: " + condicion;
    }
}
    
