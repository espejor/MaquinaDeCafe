package controlador.pedido;

import controlador.ITipoPedido;
import controlador.productoBuilder.ChocolateBuilder;

public class Chocolate extends Pedido{
    public Chocolate() {
        // Se van agregando los ingredientes y al final se llama al método built()
        producto = new ChocolateBuilder().built();
    }

    @Override
    public String toString() {
        return ITipoPedido.CHOCOLATE;
    }
}
