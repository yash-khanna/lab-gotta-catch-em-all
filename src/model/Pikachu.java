package model;

public class Pikachu extends Pokemon {
	int pokemonNumber = 25;

	public Pikachu(String pokemonName, int pokemonNumber) {
		super(pokemonName);
		this.pokemonNumber = pokemonNumber;
	}
	
	public String characteristics() {
		return "Pikachu is an Electric-type Pokémon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pokémon franchise mascot.";
	}
	
	public String type() {
		return "ELECTRIC";
	}
	
	public String evolution() {
		return "  RAICHU";
	}
	
	public String baseExp() {
		return "112";
	}
	
}
