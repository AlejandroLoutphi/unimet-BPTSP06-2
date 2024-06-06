/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graphpractice;

import linkedlists.DoubleLinkedList;

/**
 *
 * @author Alejandro Loutphi
 */
public class GraphPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoubleLinkedList<Integer> o = new DoubleLinkedList<Integer>(new Integer[]{0, 1, 2, 3, 4});
        DoubleLinkedList<Integer> p = new DoubleLinkedList<Integer>(new Integer[]{});

        p.add(12);
        p.add(30);
        p.add(1, 24);
        p.add(3, 46);

        p.set(3, 59);

        System.out.println(Integer.toString(p.get(3)));
    }

}
