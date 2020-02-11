package model;

public class Bulbasaur extends Pokemon {
	int pokemonNumber = 001;

	public Bulbasaur(String pokemonName, int pokemonNumber) {
		super(pokemonName);
		this.pokemonNumber = pokemonNumber;
	}
	
	public String characteristics() {
		return "Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.";
	}
	
	public String type() {
		return "POISON";
	}
	
	public String evolution() {
		return "IVYSAUR";
	}
	
	public String baseExp() {
		return "64";
	}

}
