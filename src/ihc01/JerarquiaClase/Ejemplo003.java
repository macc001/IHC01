/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihc01.JerarquiaClase;

import java.util.LinkedList;

/**
 *
 * @author Dev01
 */
public class Ejemplo003 {

    public static Alumno mejorAlumno(LinkedList<Alumno> a) {
        Alumno may = a.getFirst();
        for (Alumno a1 : a) {
            if (a1.getNf() > may.getNf()) {
                may = a1;
            }
        }
        return may;
    }

    public static void main(String[] args) {
        LinkedList<Alumno> l1 = new LinkedList();

        l1.add(new Alumno("juan", 20));
        l1.add(new Alumno("pedro", 40));
        l1.add(new Alumno("maria", 45));
        l1.add(new Alumno("jose", 10));
        l1.add(new Alumno("marta", 51));
        System.out.println(mejorAlumno(l1));
    }

    public static class Alumno {

        private final String nombre;
        private final int nf;

        public Alumno(String nombre, int nf) {
            this.nombre = nombre;
            this.nf = nf;
        }

        @Override
        public String toString() {
            return "{" + "nombre=" + nombre + ", nf=" + nf + '}';
        }

        public String getNombre() {
            return nombre;
        }

        public int getNf() {
            return nf;
        }
    }
}
