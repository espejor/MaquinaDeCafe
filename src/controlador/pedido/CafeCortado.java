package controlador.pedido;

import controlador.ITipoPedido;
import controlador.productoBuilder.CafeCortadoBuilder;

public class CafeCortado extends Pedido{
    public CafeCortado() {
        // Se van agregando los ingredientes y al final se llama al método built()
        producto = new CafeCortadoBuilder().built();
    }

    @Override
    public String toString() {
        return ITipoPedido.CAFECORTADO;
    }
}
