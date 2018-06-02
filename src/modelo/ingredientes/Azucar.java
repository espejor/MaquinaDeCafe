package modelo.ingredientes;

public class Azucar extends Ingrediente {
    public Azucar(Dosis dosis) {
        super(dosis);
    }

    @Override
    public String toString() {
        return AZUCAR;
    }
}
