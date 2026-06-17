

abstract class Vehiculo implements MontoAlquiler {
private String patente;
private String marca;
private double precioBase;

public Vehiculo(String patente, String marca, double precioBase){
    this.patente = patente;
    this.marca = marca;
    this.precioBase = precioBase;
    }

    public abstract double calcularPrecioBaseFinal();

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    
    
       @Override
        public double calcularMontoTotal(int diasRenta, String metodoPago, int cuotas) {
        // 1. ¡Polimorfismo en acción! 
        // Llama al calcularPrecioBaseFinal() del Auto o de la Moto según corresponda.
         double precioBase = this.calcularPrecioBaseFinal(); 
    
        // 2. Calculamos el total por los días
         double totalPorDias = precioBase * diasRenta;
    
         if(metodoPago.equals("Efectivo")){
            totalPorDias = totalPorDias - (totalPorDias * 0.15);
        } else if (metodoPago.equals("Tarjeta")){
            totalPorDias = totalPorDias + (totalPorDias * 0.10 * cuotas);
         }
    return totalPorDias;
    }
    
}