package modelo.ingredientes;

public class Chocolate extends Ingrediente {
    public Chocolate(Dosis dosis) {
        super(dosis);
    }

    @Override
    public String toString() {
        return CHOCOLATE;
    }
}
