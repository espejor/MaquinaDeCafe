package vista;

import modelo.ingredientes.INombreIngrediente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

import static modelo.IDeposito.*;

public class PanelNiveles extends JPanel{
    private SketchDeposito[] sketchDepositos = new SketchDeposito[INombreIngrediente.nombreIngredientes.length];
    private JButton[] botonesRellenar;

    /**
     * Creates a new <code>JPanel</code> with a double buffer
     * and a flow layout.
     */
    public PanelNiveles() {
        JPanel panelTitulos  = new JPanel(new GridLayout(1,5,10,10));
        JPanel panelDepositos = new JPanel(new GridLayout(1,5));
        JPanel panelRellenar = new JPanel(new GridLayout(1,5,10,10));
        setLayout(new BorderLayout());
        add(panelTitulos,BorderLayout.NORTH);
        add (panelDepositos);
        add(panelRellenar,BorderLayout.SOUTH);

        for (int i = 0; i < sketchDepositos.length; i++) {
            sketchDepositos[i] = new SketchDeposito(INombreIngrediente.nombreIngredientes[i],100);
            panelDepositos.add(sketchDepositos[i]);
        }

        botonesRellenar = new JButton[5];

        String[] nombreIngredientes = INombreIngrediente.nombreIngredientes;

        for (int i = 0; i < botonesRellenar.length; i++) {
            botonesRellenar[i] = new JButton("Rellenar " + nombreIngredientes[i]);

            panelRellenar.add(botonesRellenar[i]);

            JLabel etiqueta = new JLabel(nombreIngredientes[i]);
            etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
            panelTitulos.add(etiqueta);
        }

        panelTitulos.setBackground(Color.WHITE);
    }

    public void actualizarNiveles(int[] niveles) {
        for (int i = 0; i < sketchDepositos.length; i++) {
            sketchDepositos[i].setNivel(niveles[i]);
        }
    }

    public void setManejador(ActionListener manejador) {
        for (JButton boton: botonesRellenar){
            boton.addActionListener(manejador);
        }
    }
}
