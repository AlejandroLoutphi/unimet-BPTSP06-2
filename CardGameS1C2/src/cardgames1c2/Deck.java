/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgames1c2;

/**
 *
 * @author Alejandro Loutphi
 */
public class Deck {
    private final Card[] cards;
    
    public Deck(Card[] cards) {
        this.cards = cards;
    }
    
    public Card[] getCards() {
        return this.cards;
    }
}
