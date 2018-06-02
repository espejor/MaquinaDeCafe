package vista;

import java.awt.event.ActionListener;

public interface IVista {
    void setListeners(ActionListener listener);
    void mostrarInfo(String info);
    void actualizarNiveles(int[] niveles);
    void mostrarVentanaPrincipal();
}
