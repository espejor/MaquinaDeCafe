package controlador.pedido;

import controlador.productoBuilder.Producto;
import modelo.ErrorConsumoException;
import modelo.IModelo;
import modelo.ingredientes.INombreIngrediente;
import modelo.ingredientes.IngredienteFactory;

public abstract class Pedido {
    protected Producto producto;

    public void servir(IModelo modelo) throws ErrorConsumoException {
        if (!modelo.maquinaBloqueada()) {
            modelo.servir(new IngredienteFactory(INombreIngrediente.CAFE).getIngrediente(), producto.getCafe());
            modelo.servir(new IngredienteFactory(INombreIngrediente.LECHE).getIngrediente(), producto.getLeche());
            modelo.servir(new IngredienteFactory(INombreIngrediente.CHOCOLATE).getIngrediente(), producto.getChocolate());
            modelo.servir(new IngredienteFactory(INombreIngrediente.AZUCAR).getIngrediente(), producto.getAzucar());
            modelo.servir(new IngredienteFactory(INombreIngrediente.AGUA).getIngrediente(), producto.getAgua());
        }else
            throw new ErrorConsumoException("Máquina bloqueada");
    }

    @Override
    public String toString() {
        return producto.toString();
    }

    public Producto getProducto() {
        return producto;
    }
}
