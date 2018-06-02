package modelo;

import modelo.ingredientes.Ingrediente;

public class Deposito implements IDeposito {
    private Ingrediente ingrediente;
    private double capacidad;
    private double nivel;
    private boolean hayQueReponer = false;

    public Deposito(Ingrediente ingrediente, double capacidad) {
        this.ingrediente = ingrediente;
        this.capacidad = capacidad;
        nivel = capacidad;
    }


    public void consumir(double cantidad) throws ErrorConsumoException{
        nivel -= cantidad;
        if (nivelCritico()) {
            hayQueReponer = true;
        }
    }

    public boolean hayQueReponer(){
        return hayQueReponer;
    }

    @Override
    public int getNivel() {
        return (int) (nivel * 100/capacidad);
    }

    private boolean nivelCritico(){
        return nivel - ingrediente.getDosis().getCantidad() < 0;
    }

    public void reponer(){
        hayQueReponer = false;
        nivel = capacidad;
    }

    @Override
    public String toString() {
        return "Depósito de " + ingrediente + ": Capacidad " + capacidad + " -> Nivel: " + nivel;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }
}
