package resolVillarA.Ejercicio3;

public class Habitacion {
    protected String tipo;
    protected int nochesReservadas;
    protected String codigo;
    
    public Habitacion(String tipo, int nochesReservadas, String codigo) {
        this.tipo = tipo;
        this.nochesReservadas = nochesReservadas;
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNochesReservadas() {
        return nochesReservadas;
    }

    public void setNochesReservadas(int nochesReservadas) {
        this.nochesReservadas = nochesReservadas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
