import java.util.Random;

public abstract class Pokemon {
	private String nom;
	private int niveau;
	protected int hp;
	private int atk;
	private TypePokemon type;
	private static int niveauMax = 10;
	
	public Pokemon (String nom, TypePokemon type) {
		this.nom = nom;
		this.niveau = new Random().nextInt(1, 11);
		this.hp = 2 * this.niveau;
		this.atk = (this.niveau / 2) + 1;
		//this.typePokemon = TypePokemon.EAU;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getNiveau() {
		return this.niveau;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public int getAtk() {
		return this.atk;
	}
	
	public Boolean isKO() {
		if(this.hp == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void soigner() {
		this.hp = 2 * this.niveau;
	}
	
	public abstract void attaquer(Pokemon0 p);
	
	public String toString() {
		String msg =  "[Pokemon "+this.nom+"] :"+"Je m'appelle "+this.nom+ "! \n"+ "je suis de niveau "+this.niveau+"\n"+"j'ai "+this.hp+" points de vie\n"+"mon attaque de base est de "+this.atk;
		return msg;
	}
	
	public void log(String msg) {
		System.out.println(msg);
	}
	
	public abstract void subir(Pokemon0 p);
	
	public TypePokemon getType() {
		return this.type;
	}

}

