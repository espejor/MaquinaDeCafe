package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VentanaPrincipal  extends JFrame implements IVista{
    private PanelDisplay panelDisplay = new PanelDisplay();
    private PanelBotones panelBotones = new PanelBotones();
    private PanelNiveles panelNiveles = new PanelNiveles();

    /**
     * Creates a new, initially invisible <code>Frame</code> with the
     * specified title.
     * <p>
     * This constructor sets the component's locale property to the value
     * returned by <code>JComponent.getDefaultLocale</code>.
     * @throws HeadlessException if GraphicsEnvironment.isHeadless()
     *                           returns true.
     * @see GraphicsEnvironment#isHeadless
     * @see Component#setSize
     * @see Component#setVisible
     * @see JComponent#getDefaultLocale
     */
    public VentanaPrincipal() throws HeadlessException {
        super("Máquina de café");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,1));


        JPanel panelCentral = new JPanel(new GridLayout(1,2));
        panelCentral. add(panelBotones);
        panelCentral.add(panelDisplay);
        add(panelCentral);
        add(panelNiveles);
        pack();
        setLocationRelativeTo(null);
    }

    @Override
    public void setListeners(ActionListener listener) {
        panelBotones.setManejador(listener);
        panelNiveles.setManejador(listener);
    }

    public void mostrarInfo(String info) {
        panelDisplay.setTexto(info);
    }

    public void actualizarNiveles(int[] niveles) {
        panelNiveles.actualizarNiveles(niveles);
    }

    @Override
    public void mostrarVentanaPrincipal() {
        setVisible(true);
    }

}
