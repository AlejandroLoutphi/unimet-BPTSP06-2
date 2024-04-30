/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgames1c2;

/**
 *
 * @author Alejandro Loutphi
 */
public abstract class Card {
    private final String name;
    
    public Card(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
}
