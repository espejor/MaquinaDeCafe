package modelo.ingredientes;

public class Leche extends Ingrediente {

    public Leche(Dosis dosis) {
        super(dosis);
    }

    @Override
    public String toString() {
        return LECHE;
    }
}
