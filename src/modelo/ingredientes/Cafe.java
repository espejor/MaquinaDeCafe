package modelo.ingredientes;

public class Cafe extends Ingrediente {

    public Cafe(Dosis dosis) {
        super(dosis);
    }

    @Override
    public String toString() {
        return CAFE;
    }
}
