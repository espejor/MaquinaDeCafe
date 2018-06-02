package modelo;

import modelo.ErrorConsumoException;
import modelo.ingredientes.Ingrediente;

public interface IDeposito {

    void consumir(double cantidad) throws ErrorConsumoException;
    void reponer();
    boolean hayQueReponer();
    int getNivel();

    Ingrediente getIngrediente();
}
