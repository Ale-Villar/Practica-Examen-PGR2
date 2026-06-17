
class Auto extends Vehiculo{
 private int cantidadDePuertas;
    public Auto(String patente, String marca, double precioBase, int cantidadDePuertas) {
    super(patente, marca, precioBase);
    this.cantidadDePuertas = cantidadDePuertas;
    }

    @Override
    public double calcularPrecioBaseFinal() {
        double precioFinal = getPrecioBase();

        if (cantidadDePuertas > 4) {
            precioFinal = precioFinal + (precioFinal*0.10); // Incremento por tener más de 4 puertas
        }
        return precioFinal;
    }

}
