import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Ventana extends JFrame {
    public Ventana() {
        Toolkit pantalla = getToolkit();
        Dimension tamanio = pantalla.getScreenSize();
        int altura = tamanio.height;
        int anchura = tamanio.width;
        setSize(anchura, altura);
        setLocationRelativeTo(null);

        this.setTitle("ventana 1");
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
