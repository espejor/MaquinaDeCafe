package controlador.productoBuilder;

public abstract class ProductoBuilder {
    private Producto producto;


    public ProductoBuilder() {
        producto = new Producto();
    }

    public ProductoBuilder cafe (int dosisCafe) {
        producto.setCafe(dosisCafe);
        return this;
    }

    public ProductoBuilder leche (int dosisLeche) {
        producto.setLeche(dosisLeche);
        return this;
    }

    public ProductoBuilder azucar(int dosisAzucar) {
        producto.setAzucar(dosisAzucar);
        return this;
    }

    public ProductoBuilder chocolate (int dosisChocolate) {
        producto.setChocolate(dosisChocolate);
        return this;
    }

    public ProductoBuilder agua (int dosisAgua){
        producto.setAgua(dosisAgua);
        return this;
    }

    public Producto built(){
        return producto;
    }
}
