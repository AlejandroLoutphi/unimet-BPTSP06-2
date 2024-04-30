/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgames1c2;

/**
 *
 * @author Alejandro Loutphi
 */
public class Pokemon extends Card {
    private final PokemonType pokemonType;
    private final Attack[] attacks;
    private final String description;
    private final int maxHp;
    private int hp;
    
    public Pokemon(
            String name,
            PokemonType pokemonType,
            Attack[] attacks,
            String description,
            int maxHp) {
        super(name);
        this.pokemonType = pokemonType;
        this.attacks = attacks;
        this.description = description;
        this.maxHp = maxHp;
        this.hp = maxHp;
    }
    
    public PokemonType getPokemonType() {
        return this.pokemonType;
    }
    
    public Attack[] getAttakcs() {
        return this.attacks;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public int getMaxHp() {
        return this.maxHp;
    }
    
    public int getHp() {
        return this.hp;
    }
    
    public boolean decrementHp(int amount) {
        /**
         * @param amount Cantidad por la cual decrementar this.Hp
         * @return true si el Pokemon sigue vivo después del decremento, false de lo contrario
         */
        this.hp -= amount;
        return this.hp > 0;
    }
}
