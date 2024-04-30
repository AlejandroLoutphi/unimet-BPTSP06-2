/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgames1c2;

import java.util.Arrays;

/**
 *
 * @author Alejandro Loutphi
 */
public class PokemonType {
    private final String name;
    private final String[] weaknesses;
    private final String[] resistances;
    private final String[] immunities;
    
    public PokemonType(
            String name,
            String[] weaknesses,
            String[] resistances,
            String[] immunities) {
        this.name = name;
        this.weaknesses = weaknesses;
        this.resistances = resistances;
        this.immunities = immunities;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String[] getWeaknesses() {
        return this.weaknesses;
    }
    
    public String[] getStrengths() {
        return this.resistances;
    }
    
    public String[] getImmunities() {
        return this.immunities;
    }
    
    public boolean isWeakTo(PokemonType opponent) {
        return Arrays
                .asList(this.weaknesses)
                .contains(opponent.getName());
    }
    
    public boolean isResistantTo(PokemonType opponent) {
        return Arrays
                .asList(this.resistances)
                .contains(opponent.getName());
    }
    
    public boolean isImmuneTo(PokemonType opponent) {
        return Arrays
                .asList(this.immunities)
                .contains(opponent.getName());
    }
}
