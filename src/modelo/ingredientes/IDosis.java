package modelo.ingredientes;

public interface IDosis extends IDosisCantidad{
    String GRAMOS = "gr";
    String CENTILITROS = "cl";

    double getCantidad();
}
