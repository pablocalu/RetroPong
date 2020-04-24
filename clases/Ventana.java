/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JFrame;

/**
 *
 * @author pablo
 */
public class Ventana extends JFrame {

    private final int alto = 500, ancho = 800;
    private Tablero lamina;
    private Hilo hilo;
    
    public Ventana() {
        setTitle("RetroPong");
        setSize(ancho, alto);
        setLocationRelativeTo(null);
        setResizable(false);
        lamina = new Tablero();
        add(lamina);
        addKeyListener(new MovimientoPaletas());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // hilo = new Hilo(lamina);
        //hilo.start();
        
        lamina.iJuego();
    }
}
