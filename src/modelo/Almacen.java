package modelo;


import modelo.ingredientes.INombreIngrediente;
import modelo.ingredientes.Ingrediente;
import modelo.ingredientes.IngredienteFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static modelo.ingredientes.INombreIngrediente.*;

public class Almacen implements IModelo {
    private String ingredientesDepositos[] = INombreIngrediente.nombreIngredientes;
    private int capacidadDepositos[] = {1000,2000,2000,3000,1000};
    private IDeposito depositos[] = new Deposito[ingredientesDepositos.length];

    Map<String,Integer> ingredientes = new HashMap<>();

    public Almacen() {
        for (int i = 0; i < depositos.length; i++) {
            Ingrediente ingrediente = new IngredienteFactory(ingredientesDepositos[i]).getIngrediente();
            depositos[i] = new Deposito(ingrediente,capacidadDepositos[i]);
        }
    }


    @Override
    public void rellenar(IDeposito deposito) {
        deposito.reponer();
    }

    @Override
    public void servir(Ingrediente ingrediente, int dosis) throws ErrorConsumoException {
        double cantidad = ingrediente.getDosis().getCantidad() * dosis;
        getDeposito(ingrediente).consumir(cantidad);
    }

    @Override
    public boolean maquinaBloqueada() {
        for (IDeposito deposito : depositos){
            if (deposito.hayQueReponer())
                return true;
        }
        return  false;
    }

    @Override
    public int[] getNiveles() {
        int[] niveles = new int[5];
        for (int i = 0; i < niveles.length; i++) {
            niveles[i] = getDeposito(INombreIngrediente.nombreIngredientes[i]).getNivel();
        }
        return niveles;
    }

    @Override
    public IDeposito getDeposito(Ingrediente ingrediente) {
        return getDeposito(ingrediente.toString());
    }


    private IDeposito getDeposito(String clave) {
        for (IDeposito deposito : depositos){
            if (deposito.getIngrediente().toString().equals(clave))
                return deposito;
        }
        return null;
    }
}
