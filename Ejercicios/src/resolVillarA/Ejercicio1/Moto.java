class Moto extends Vehiculo {
    private int cilindrada;
    public Moto(String patente, String marca, double precioBase,int cilindrada) {
        super(patente, marca, precioBase);
        this.cilindrada = cilindrada;
    }
    @Override
    public double calcularPrecioBaseFinal() {
        double precioFinal = getPrecioBase();

        if (cilindrada > 250 && cilindrada <= 500){
            precioFinal = precioFinal + (precioFinal * 0.10);
        } else if (cilindrada > 500){
            precioFinal = precioFinal + (precioFinal * 0.25);
        }
        return precioFinal;
    }
}
