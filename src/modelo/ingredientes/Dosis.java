package modelo.ingredientes;

public class Dosis implements IDosis {
    private double cantidad;
    String unidad;

    public Dosis(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Getter de cantidad
     * @return cantidad
     */
    public double getCantidad() {
        return cantidad;
    }
}
