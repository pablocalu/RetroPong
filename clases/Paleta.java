/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author pablo
 */
public class Paleta {

    private int x, y;
    private static final int ancho = 10, alto = 40;

    public Paleta(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle2D getPaleta() {
        return new Rectangle2D.Double(x, y, ancho, alto);
    }
    
    public void MoverP1(Rectangle limites){
        if(MovimientoPaletas.w && y > limites.getMinY()){
            y--;
        }
        if(MovimientoPaletas.s && y < limites.getMaxY() - alto){
            y++;
        }
    }
    
    public void MoverP2(Rectangle limites){
         if(MovimientoPaletas.up && y > limites.getMinY()){
            y--;
        }
        if(MovimientoPaletas.down && y < limites.getMaxY() - alto){
            y++;
        }
    }
}
