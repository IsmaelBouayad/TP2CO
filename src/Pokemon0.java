import java.util.Random;
import java.util.random.*;

public class Pokemon0 {
	private String nom;
	private int niveau;
	private int hp;
	private int atk;
	
	public Pokemon0 (String nom) {
		this.nom = nom;
		this.niveau = new Random().nextInt(1, 11);
		this.hp = 2 * this.niveau;
		this.atk = (this.niveau / 2) + 1;
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
	
	public void attaquer(Pokemon0 p) {
		p.hp -= this.atk;
		System.out.println("Je suis "+this.nom+" et j'attaque "+p.getNom());
	}
	
	public String toString() {
		String msg =  "[Pokemon "+this.nom+"] :"+"Je m'appelle "+this.nom+ "! \n"+ "je suis de niveau "+this.niveau+"\n"+"j'ai "+this.hp+" points de vie\n"+"mon attaque de base est de "+this.atk;
		return msg;
	}
	
	public void log(String msg) {
		System.out.println(msg);
	}
}
