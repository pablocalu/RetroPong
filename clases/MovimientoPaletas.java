/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author pablo
 */
public class MovimientoPaletas extends KeyAdapter{
    
    static boolean w, s, up, down;
    
    @Override
    public void keyPressed(KeyEvent e){
        //previamente chequee los codigos en la api de java de cada tecla que voy a presionar
        int id = e.getKeyCode();
        
        if(id == KeyEvent.VK_W){
            w = true ;
        }
        if(id == KeyEvent.VK_S){
            s = true ;
        }
        if(id == KeyEvent.VK_UP){
            up = true ;
        }
        if(id == KeyEvent.VK_DOWN){
            down = true ;
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        int id = e.getKeyCode();
        
        if(id == KeyEvent.VK_W){
            w = false ;
        }
        if(id == KeyEvent.VK_S){
            s = false ;
        }
        if(id == KeyEvent.VK_UP){
            up = false ;
        }
        if(id == KeyEvent.VK_DOWN){
            down = false ;
        }
    }
    
}
