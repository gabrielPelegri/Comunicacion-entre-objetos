package Componentes;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.annotation.processing.SupportedOptions;
import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;

import org.w3c.dom.events.MouseEvent;

public class Ventana extends JFrame {
    public Ventana() {
        Toolkit pantalla = getToolkit();
        Dimension tamanio = pantalla.getScreenSize();
        int altura = tamanio.height;
        int anchura = tamanio.width;
        setSize(anchura / 2, altura / 2);
        setLocationRelativeTo(null);

        this.setTitle("ventana 1");
        this.setVisible(true);

        MouseInputListener l = new MouseInputListener() {

            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                System.out.println("Ratón en ventana 1");

            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseDragged(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseMoved(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub

            }

        };
        addMouseListener(l);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
