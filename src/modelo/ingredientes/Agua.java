package modelo.ingredientes;

public class Agua extends Ingrediente {

    public Agua(Dosis dosis) {
        super(dosis);
    }

    @Override
    public String toString() {
        return AGUA;
    }
}
