package model;

public class Mew extends Pokemon {
	int pokemonNumber = 151;

	public Mew(String pokemonName, int pokemonNumber) {
		super(pokemonName);
		this.pokemonNumber = pokemonNumber;
	}
	
	public String characteristics() {
		return "Mew is a Psychic-type Mythical Pokémon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.";
	}
	
	public String type() {
		return "PSYCHIC";
	}
	
	public String evolution() {
		return "   NONE  ";
	}
	
	public String baseExp() {
		return "64";
	}
	
}
