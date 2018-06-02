package vista;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

import static controlador.ITipoPedido.*;

public class PanelBotones extends JPanel{
    private JCheckBox sinAzucar = new JCheckBox(SINAZUCAR,false);
    private String botonesStr[] = {CAFECONLECHE,CAFESOLO,CAFESOLODOBLE,CAFECORTADO,CHOCOLATE};
    private Boton botones[] = new Boton[botonesStr.length];
    /**
     * Creates a new <code>JPanel</code> with a double buffer
     * and a flow layout.
     */
    public PanelBotones() {
        setLayout(new GridLayout(botonesStr.length + 1,1,10,10));
        add(sinAzucar);
        crearBotones();
    }

    private void crearBotones() {
        for (int i = 0; i < botones.length ; i++) {
            botones[i] = new Boton(botonesStr[i]);
            add(botones[i]);
        }
    }

    public void setManejador(ActionListener manejadorBoton) {
        for (Boton boton : botones){
            boton.addActionListener(manejadorBoton);
        }
        sinAzucar.addActionListener(manejadorBoton);
    }
}
