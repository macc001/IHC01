/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihc01.Grafica.Puzzle;

import java.awt.Button;
import java.awt.Panel;

/**
 *
 * @author macc
 */
public class Puzzle extends Panel {

    private int n, m;

    public Puzzle(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public void generarFinal() {
        for (int i = 0; i < n * m - 1; i++) {
            this.add(new Button(Integer.toString(i)));
        }
        this.add(new Button("0"));
    }

    public void generarInicial() {
        for (int i = n * m - 1; i > 0; i--) {
            this.add(new Button(Integer.toString(i)));
        }
    }
}
