package controlador.pedido;

import controlador.ITipoPedido;
import controlador.productoBuilder.CafeSoloBuilder;

public class CafeSolo extends Pedido{
    public CafeSolo() {
        // Se van agregando los ingredientes y al final se llama al método built()
        producto = new CafeSoloBuilder().built();
    }

    @Override
    public String toString() {
        return ITipoPedido.CAFESOLO;
    }
}
