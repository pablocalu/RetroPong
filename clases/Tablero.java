/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author pablo
 */
public class Tablero extends JPanel {

    Pelota pelota = new Pelota(0, 0);
    Paleta p1 = new Paleta(10, 200);
    Paleta p2 = new Paleta(794 - 10 - 10, 200);

    public Tablero() {
        setBackground(Color.BLACK);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.WHITE);
        Dibujar(g2);
        Actualizar();
    }

    public void Dibujar(Graphics2D g) {
        g.fill(pelota.getPelota());
        //para ver medidas y poner bien las paletas
        //System.out.print("x = " + getBounds().getMaxX());
        //System.out.print("y = " + getBounds().getMaxY());
        g.fill(p1.getPaleta());
        g.fill(p2.getPaleta());
    }

    public void Actualizar() {
        pelota.Mover(getBounds(), Colision(p1.getPaleta()), Colision(p2.getPaleta()));
        p1.MoverP1(getBounds());
        p2.MoverP2(getBounds());
    }

    public void iJuego() {
        while (true) {
            repaint();
            try {
                Thread.sleep(2, 5);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tablero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private boolean Colision(Rectangle2D r){
        return pelota.getPelota().intersects(r);
    }
    
    
    
}
