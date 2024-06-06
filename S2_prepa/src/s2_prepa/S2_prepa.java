/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s2_prepa;

/**
 *
 * @author Alejandro Loutphi
 */
public class S2_prepa {

    public static int number() {
        return 49;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int counter = 0;
        while(counter < 10) {
            System.out.println("Counter number: " + Integer.toString(counter));
            ++counter;
        }

        for(int i = 10; i >= 0; --i) {
            System.out.println("Counter number: " + Integer.toString(i));
        }

        System.out.println(Integer.toString(number()));

        Funciones square_three = new Funciones("Square Three", 3, 3);

        square_three.print_product();

    }
    
}
