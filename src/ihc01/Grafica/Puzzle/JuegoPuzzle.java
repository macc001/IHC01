/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihc01.Grafica.Puzzle;

import java.applet.Applet;
import java.awt.GridLayout;

/**
 *
 * @author macc
 */
public class JuegoPuzzle extends Applet {

    private Puzzle p1;
    private Puzzle p2;

    public void init() {
        p1 = new Puzzle(3, 3);
        p2 = new Puzzle(3, 3);
        p1.setLayout(new GridLayout(3,3));
        p2.setLayout(new GridLayout(3,3));
        p1.generarFinal();
        p2.generarInicial();
        this.add(p1);
        this.add(p2);
    }
}
