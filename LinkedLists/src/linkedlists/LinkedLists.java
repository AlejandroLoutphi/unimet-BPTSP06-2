/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlists;

/**
 *
 * @author Alejandro Loutphi
 */
public class LinkedLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoubleLinkedList<String> foo = new DoubleLinkedList<>(new String[]{"a", "b", "c"});
        //for (int i = 0; i < foo.size(); i++) {
        //    System.out.println(Boolean.toString(foo.get(i) == null));
        //}
        System.out.println(Integer.toString(foo.size()));
    }
    
}
