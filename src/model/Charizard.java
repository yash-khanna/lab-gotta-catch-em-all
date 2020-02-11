package model;

public class Charizard extends Pokemon {
	int pokemonNumber = 006;

	public Charizard(String pokemonName, int pokemonNumber) {
		super(pokemonName);
		this.pokemonNumber = pokemonNumber;
	}
	
	public String characteristics() {
		return "Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.";
	}
	
	public String type() {
		return "FIRE";
	}
	
	public String evolution() {
		return "CHARMELEON";
	}
	
	public String baseExp() {
		return "240";
	}

}
