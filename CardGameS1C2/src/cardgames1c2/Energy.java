/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgames1c2;

/**
 *
 * @author Alejandro Loutphi
 */
public class Energy extends Card {
    PokemonType pokemonType;
    
    public Energy(
            String name,
            PokemonType pokemonType) {
        super(name);
        this.pokemonType = pokemonType;
    }
    
    public PokemonType getPokemonType() {
        return this.pokemonType;
    }
}
