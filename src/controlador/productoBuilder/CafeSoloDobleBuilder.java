package controlador.productoBuilder;

public class CafeSoloDobleBuilder extends ProductoBuilder {
    public CafeSoloDobleBuilder() {
        this
            .cafe(2)
            .agua(2)
            .azucar(1)
            .built();// Construye el Producto
    }
}
