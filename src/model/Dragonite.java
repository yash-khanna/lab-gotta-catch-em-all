package model;

public class Dragonite extends Pokemon {
	int pokemonNumber = 149;

	public Dragonite(String pokemonName, int pokemonNumber) {
		super(pokemonName);
		this.pokemonNumber = pokemonNumber;
	}
	
	public String characteristics() {
		return "Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism.";
	}
	
	public String type() {
		return "DRAGON";
	}
	
	public String evolution() {
		return "DRATINI";
	}
	
	public String baseExp() {
		return "270";
	}
	
}
