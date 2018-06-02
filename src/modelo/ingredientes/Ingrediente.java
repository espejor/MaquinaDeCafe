package modelo.ingredientes;


public abstract class Ingrediente implements IIngrediente {
    protected Dosis dosis;


    public Ingrediente(Dosis dosis) {
        this.dosis = dosis;
    }

    /**
     * Getter de dosis
     * @return dosis
     */
    public Dosis getDosis() {
        return dosis;
    }



    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj))
            return true;
        if (this.toString().equals(obj.toString()))
            return true;
        return false;
    }
}
