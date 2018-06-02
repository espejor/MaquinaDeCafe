package vista;

import javax.swing.*;
import java.awt.*;

public class PanelDisplay extends JPanel{
    private JLabel texto = new JLabel();
    /**
     * Creates a new <code>JPanel</code> with a double buffer
     * and a flow layout.
     */
    public PanelDisplay() {
        setSize(80,80);
        setBackground(Color.WHITE);
        texto.setFont(new Font("Arial",Font.BOLD,12));
        texto.setText("En espera");
        texto.setHorizontalAlignment(SwingConstants.CENTER);
        this.setAlignmentY(CENTER_ALIGNMENT);
        add(texto);
    }

    /**
     * Setter de texto
     * @param texto del tipo javax.swing.JLabel
     */
    public void setTexto(String texto) {
        this.texto.setText(texto);
    }
}
