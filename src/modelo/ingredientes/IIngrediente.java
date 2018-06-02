package modelo.ingredientes;

public interface IIngrediente extends INombreIngrediente{

    IDosisCantidad getDosis();

    String toString();
}
