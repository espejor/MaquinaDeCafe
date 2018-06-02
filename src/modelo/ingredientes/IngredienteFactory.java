package modelo.ingredientes;

import static modelo.ingredientes.INombreIngrediente.*;

public class IngredienteFactory {
    Ingrediente ingrediente;

    public IngredienteFactory(String tipoIngrediente) {
        if (tipoIngrediente.equals(CAFE))
            ingrediente = new Cafe(new DosisSolido(IDosisCantidad.DOSIS_CAFE));
        if (tipoIngrediente.equals(CHOCOLATE))
            ingrediente = new Chocolate(new DosisLiquido(IDosisCantidad.DOSIS_CHOCOLATE));
        if (tipoIngrediente.equals(AZUCAR))
            ingrediente = new Azucar(new DosisSolido(IDosisCantidad.DOSIS_AZUCAR));
        if (tipoIngrediente.equals(AGUA))
            ingrediente = new Agua(new DosisLiquido(IDosisCantidad.DOSIS_AGUA));
        if (tipoIngrediente.equals(LECHE))
            ingrediente = new Leche(new DosisSolido(IDosisCantidad.DOSIS_LECHE));
    }

    /**
     * Getter de ingrediente
     * @return ingrediente
     */
    public Ingrediente getIngrediente() {
        return ingrediente;
    }
}
