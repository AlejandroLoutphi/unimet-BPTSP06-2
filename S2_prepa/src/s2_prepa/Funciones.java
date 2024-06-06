/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s2_prepa;

/**
 *
 * @author Alejandro Loutphi
 */
public class Funciones {

    private String name;
    private int num0;
    private int num1;

    public Funciones(
            String name,
            int num0,
            int num1
            ) {
        this.name = name;
        this.num0 = num0;
        this.num1 = num1;
    } 

    public void print_product() {
        System.out.println("El producto de " + name + " " + Integer.toString(num0*num1));
    }
}

