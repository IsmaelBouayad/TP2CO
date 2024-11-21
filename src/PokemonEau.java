public class PokemonEau extends Pokemon {

    public PokemonEau(String nom) {
        super(nom, TypePokemon.EAU);
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
            case EAU, PLANTE -> facteur = 0.5; 
            case FEU -> facteur = 2.0;        
        }

        int degats = (int) (p.getAtk() * facteur);
        this.hp -= degats;

        log(p.getNom() + " inflige " + degats + " dégâts à " + this.getNom());
        if (this.isKO()) {
            log(this.getNom() + " est KO !");
        }
    }
}
