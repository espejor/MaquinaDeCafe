package controlador.pedido;


import controlador.ITipoPedido;
import controlador.productoBuilder.CafeConLecheBuilder;

public class CafeConLeche extends Pedido {
    public CafeConLeche() {
        // Se van agregando los ingredientes y al final se llama al método built()
        producto = new CafeConLecheBuilder().built();
    }

    @Override
    public String toString() {
        return ITipoPedido.CAFECONLECHE;
    }
}
