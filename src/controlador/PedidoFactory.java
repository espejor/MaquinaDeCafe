package controlador;

import controlador.pedido.*;

public class PedidoFactory implements ITipoPedido{
    private Pedido pedido;

    public PedidoFactory(String tipoProducto) {
        if (tipoProducto.equals(CAFESOLO))
            pedido = new CafeSolo();
        if (tipoProducto.equals(CAFECONLECHE))
            pedido = new CafeConLeche();
        if (tipoProducto.equals(CAFESOLODOBLE))
            pedido = new CafeSoloDoble();
        if (tipoProducto.equals(CAFECORTADO))
            pedido = new CafeCortado();
        if (tipoProducto.equals(CHOCOLATE))
            pedido = new Chocolate();
    }

    /**
     * Getter de pedido
     * @return pedido
     */
    public Pedido getPedido() {
        return pedido;
    }
}
