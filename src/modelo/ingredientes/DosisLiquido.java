package modelo.ingredientes;

public class DosisLiquido extends Dosis {
    public DosisLiquido(double cantidad) {
        super(cantidad);
        unidad = CENTILITROS;
    }
}
