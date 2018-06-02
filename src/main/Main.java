package main;

import controlador.Controlador;
import modelo.Almacen;
import modelo.IModelo;
import vista.IVista;
import vista.VentanaPrincipal;

public class Main {
    public static void main(String args[]) {
        IModelo modelo = new Almacen();
        IVista vista = new VentanaPrincipal();
        new Controlador(modelo,vista);

        vista.mostrarVentanaPrincipal();
    }
}
