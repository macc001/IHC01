/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihc01.Grafica.Lista;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author macc
 */
public class Lista extends Applet {

    private List l1;
    private List l2;
    private List l3;
    private Button b1;
    private Button b2;

    public void init() {
        l1 = new List(10, true);
        l2 = new List(10, false);
        l2.setBackground(Color.magenta);
        l3 = new List(10, false);
        l3.setBackground(Color.LIGHT_GRAY);
        b1 = new Button("copiar");
        b1.setBackground(Color.CYAN);
        b2 = new Button("ordenar");
        l1.add("uno");
        l1.add("dos");
        l1.add("tres");
        l1.add("cuatro");
        l1.add("cinco");
        l1.add("seis");
        this.add(l1);
        this.add(b1);
        this.add(l2);
        this.add(b2);
        this.add(l3);
    }

    // TODO overwrite start(), stop() and destroy() methods
    public boolean action(Event e, Object o) {
        if (e.target == b1) {
            copiar();
        } else if (e.target == b2) {
            ordenar();
        }
        return true;
    }

    private void copiar() {
        String a[] = l1.getItems();
        for (int i = 0; i < a.length; i++) {
            l2.add(a[i]);
        }
    }

    private void ordenar() {
        String a[] = l1.getItems();
        LinkedList l = new LinkedList(Arrays.asList(a));
        Collections.sort(l);
        for (int i = 0; i < l.size(); i++) {
            l3.add((String) l.get(i));
        }
    }

}
