
public enum TypePokemon {
	EAU("Eau"),
	FEU("Feu"),
	PLANTE("Plante");
	
	private String name;
	
	private TypePokemon(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
}
