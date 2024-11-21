
public class PokemonFeu extends Pokemon{
	
	public PokemonFeu(String nom) {
		super(nom,TypePokemon.FEU);
	}
	
	@Override
    public void attaquer(Pokemon p) {
        log(this.getNom() + " attaque " + p.getNom());
        p.subir(this);
    }

    @Override
    public void subir(Pokemon p) {
        double facteur = 1.0;

        switch (p.getType()) {
            case EAU, FEU -> facteur = 0.5; 
            case PLANTE -> facteur = 2.0;        
        }

        int degats = (int) (p.getAtk() * facteur);
        this.hp -= degats;

        log(p.getNom() + " inflige " + degats + " dégâts à " + this.getNom());
        if (this.isKO()) {
            log(this.getNom() + " est KO !");
        }
    }

}
