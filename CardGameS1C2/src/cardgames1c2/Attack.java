/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgames1c2;

/**
 *
 * @author Alejandro Loutphi
 */
public class Attack {
    private final int baseDamage;
    private final PokemonType pokemonType;
    private final String description;
    private final Energy[] energyCost;
    
    public Attack(
            int baseDamage,
            PokemonType pokemonType,
            String description,
            Energy[] energyCost) {
        this.baseDamage = baseDamage;
        this.pokemonType = pokemonType;
        this.description = description;
        this.energyCost = energyCost;
    }
    
    public int getBaseDamage() {
        return this.baseDamage;
    }
    
    public PokemonType getPokemonType() {
        return this.pokemonType;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public Energy[] getEnergyCost() {
        return this.energyCost;
    }
    
    public int getEffDamage(Pokemon opponent) {
        if (opponent
                .getPokemonType()
                .isImmuneTo(this
                        .getPokemonType()))
            return 0;
        
        else if (opponent
                .getPokemonType()
                .isWeakTo(this
                        .getPokemonType()))
            return this.getBaseDamage() * 2;
        
        else if (opponent
                .getPokemonType()
                .isResistantTo(this
                        .getPokemonType()))
            return this.getBaseDamage() / 2;
        
        else return this.getBaseDamage();
    }
}
