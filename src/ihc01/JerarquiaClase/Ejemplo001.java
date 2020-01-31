/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihc01.JerarquiaClase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Dev01
 */
public class Ejemplo001 {

    public static void intercalar(List l1, List l2, List l3) {
        int i = 0;
        while (i < l1.size() && i < l2.size()) {
            l3.add(l1.get(i));
            l3.add(l2.get(i));
            i++;
        }
        while (i < l1.size()) {
            l3.add(l1.get(i));
            i++;
        }
        while (i < l2.size()) {
            l3.add(l2.get(i));
            i++;
        }
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        ArrayList l3 = new ArrayList();

        l1.add("uno");
        l1.add("dos");
        l1.add("tres");
        l2.add(1);
        l2.add(2);
        l2.add(3);
        intercalar(l1, l2, l3);
        System.out.println(l3);
    }

}
