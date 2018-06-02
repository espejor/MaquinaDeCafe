package controlador.pedido;

import controlador.ITipoPedido;
import controlador.productoBuilder.CafeSoloDobleBuilder;
import controlador.productoBuilder.ProductoBuilder;

public class CafeSoloDoble extends Pedido {
    public CafeSoloDoble() {
        // Se van agregando los ingredientes y al final se llama al método built()
        producto = new CafeSoloDobleBuilder().built();
    }
    @Override
    public String toString() {
        return ITipoPedido.CAFESOLODOBLE;
    }

}
