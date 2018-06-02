package vista;

import javax.swing.*;
import java.awt.*;

public class SketchDeposito extends JPanel{
    private  int nivel;
    private String ingrediente;
    private static final int inicioRegla = 50;

    /**
     * Creates a new <code>JPanel</code> with a double buffer
     * and a flow layout.
     */
    public SketchDeposito(String ingrediente, int nivel) {
        setBackground(Color.WHITE);
        this.nivel = nivel;
        this.ingrediente = ingrediente;
    }

    private void pintarRegla(Graphics g){
        g.setColor(Color.black);

        g.drawString("100%",5,inicioRegla);
        g.drawString("50%",10,inicioRegla + 50);
        g.drawString("0%",15,inicioRegla + 100);
        g.drawLine(50,inicioRegla ,50,inicioRegla + 100);

        g.drawLine(40,inicioRegla,60,inicioRegla );
        g.drawLine(45,inicioRegla + 25,55,inicioRegla + 25);
        g.drawLine(45,inicioRegla + 50,55,inicioRegla + 50);
        g.drawLine(45,inicioRegla + 75,55,inicioRegla + 75);

        g.drawLine(40,inicioRegla + 100,60,inicioRegla + 100);
    }

    private void pintarNivel(Graphics g) {
        if (nivel < 25)
            g.setColor(Color.red);
        else
            g.setColor(Color.green);
        g.fillRect(46,inicioRegla + 100 - nivel,8,nivel);
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        pintarNivel(g);
        pintarRegla(g);
    }

    /**
     * Setter de nivel
     * @param nivel del tipo int
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
        repaint();
    }
}
