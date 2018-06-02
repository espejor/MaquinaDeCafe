package controlador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static controlador.ITipoPedido.SINAZUCAR;

public class ManejadorBoton implements ActionListener{
    Controlador controlador;

    public ManejadorBoton(Controlador controlador) {
        this.controlador = controlador;
    }

    /**
     * Invoked when an action occurs.
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().substring(0,8).equals("Rellenar")) {
            String ingrediente = e.getActionCommand().substring(9);
            controlador.rellenar(ingrediente);
        }
        else if (e.getActionCommand().equals(SINAZUCAR))
            controlador.setSinAzucar(((JCheckBox)e.getSource()).isSelected());
        else {
            controlador.crearPedido(e.getActionCommand());
            controlador.confeccionarPedido();
        }
    }
}
