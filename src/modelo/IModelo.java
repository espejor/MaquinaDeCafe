package modelo;

import modelo.ingredientes.Ingrediente;

public interface IModelo {
    void servir(Ingrediente ingrediente, int dosis) throws ErrorConsumoException;
    boolean maquinaBloqueada();
    void rellenar(IDeposito deposito);
    IDeposito getDeposito(Ingrediente ingrediente);
    int[] getNiveles();
}
