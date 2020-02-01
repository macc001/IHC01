/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihc01.Grafica.TresRaya;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;

/**
 *
 * @author macc
 */
public class TresRaya extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        this.add(new Button("Nueva Partida"));
    }

    // TODO overwrite start(), stop() and destroy() methods
    public void paint(Graphics g) {
        int w = this.getWidth() / 3;
        int h = this.getHeight() / 3;
        g.drawOval(w * 3 / 2 - 30, h * 3 / 2 - 30, 60, 60);
        g.drawLine(w, 0, w, h * 3);
        g.drawLine(w * 2, 0, w * 2, h * 3);
        g.drawLine(0, h, w * 3, h);
        g.drawLine(0, h * 2, w * 3, h * 2);
    }
}
