package Componentes;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.annotation.processing.SupportedOptions;
import javax.sound.sampled.SourceDataLine;
import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;

import org.w3c.dom.events.MouseEvent;

public class Ventana extends JFrame{
    static int n = 0;
    int numero;

    public Ventana() {
        n++;
        this.numero = n;
        Toolkit pantalla = getToolkit();
        Dimension tamanio = pantalla.getScreenSize();
        int altura = tamanio.height;
        int anchura = tamanio.width;
        setSize(anchura / 2, altura / 2);
        
        setLocation(100*n,100*n);

        this.setTitle("ventana " + numero);
        this.setVisible(true);

        MouseInputListener l = new MouseInputListener() {

            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {

            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                System.out.println("Mouse Pressed en ventana " + numero + " | Coordenadas: " + x + "," + y);

            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                System.out.println("Mouse Released en ventana " + numero + " | Coordenadas: " + x + "," + y);

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
