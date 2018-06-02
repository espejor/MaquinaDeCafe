package controlador;

import controlador.pedido.Pedido;
import modelo.ErrorConsumoException;
import modelo.IModelo;
import modelo.ingredientes.Ingrediente;
import modelo.ingredientes.IngredienteFactory;
import vista.IVista;



public class Controlador implements ITipoPedido{
    private IModelo modelo;
    private IVista vista;

    private Pedido pedido;
    private boolean sinAzucar = false;

//    ActionListener manejadorBoton = new ManejadorBoton(this);

    public Controlador(IModelo modelo,IVista vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setListeners(new ManejadorBoton(this));
    }


    public void crearPedido(String tipoDePedido){
        pedido = new PedidoFactory(tipoDePedido).getPedido();
        if (sinAzucar)
            pedido.getProducto().sinAzucar();
    }

    public void confeccionarPedido(){
        try {
            pedido.servir(modelo);
            servirPedido();
        } catch (ErrorConsumoException e) {
            sendToDisplay(e.getMessage());
        }
    }


    private void servirPedido(){
        String txt = "Sirviendo un \n" + pedido.toString();
        if (sinAzucar)
            txt += " Sin Azucar";
        sendToDisplay(txt);
        actualizarNiveles();
    }

    private void sendToDisplay(String txt){
        vista.mostrarInfo(txt);
    }

    private void  actualizarNiveles(){
        int [] niveles = modelo.getNiveles();
        vista.actualizarNiveles(niveles);
    }

    /**
     * Setter de sinAzucar
     * @param sinAzucar del tipo boolean
     */
    public void setSinAzucar(boolean sinAzucar) {
        this.sinAzucar = sinAzucar;
    }

    public void rellenar(String ingredienteARellenar) {
        Ingrediente ingrediente = new IngredienteFactory(ingredienteARellenar).getIngrediente();
        modelo.rellenar(modelo.getDeposito(ingrediente));
        actualizarNiveles();
    }
}
