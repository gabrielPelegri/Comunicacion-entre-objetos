package Componentes;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;

public class Ventana extends JFrame implements MouseInputListener {
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

        setLocation(100 * n, 100 * n);

        this.setTitle("ventana " + numero);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed en ventana " + numero + " en (" + e.getX() + ", " + e.getY() + ")");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released en ventana " + numero + " en (" + e.getX() + ", " + e.getY() + ")");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub

    }
}
