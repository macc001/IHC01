/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihc01.JerarquiaClase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Dev01
 */
public class Ejemplo002 {

    public static void ordenarlista(LinkedList l1) {
        Collections.sort(l1);
    }

    public static int suma(LinkedList<Integer> l1) {
        int sum = 0;
        for (Integer i : l1) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        ArrayList l3 = new ArrayList();

        l1.add("uno");
        l1.add("dos");
        l1.add("zos");
        l1.add("aos");
        l1.add("tres");
        l2.add(1);
        l2.add(2);
        l2.add(3);
     //   ordenarlista(l1);
        System.out.println(suma(l2));
    }
}
