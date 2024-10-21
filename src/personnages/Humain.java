package personnages;

public class Humain {
    private String nom;
    private String boisson;
    private int money;

    public Humain(String nom, String boisson, int money) {
        this.nom = nom;
        this.boisson = boisson;
        this.money = money;
    }

	public String getNom() {
		return nom;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void parler(String texte) {
        System.out.println("(" + nom + ") - " + texte);
    }

    public void direBonjour() {
        parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boisson + ".");
    }
	
	public void  boire() {
		parler("Mmmm, un bon verre de" + boisson + "! GLOUPS !");
	}
	
	public void gagnerArgent(int gain) {
		money += gain;
    }

    public void perdreArgent(int perte) {
    	money -= perte;
    }
	
	public void acheter(String product, int prix) {
        if (money >= prix) {
            parler("J'ai " + money + " sous en poche. Je vais pouvoir m'offrir un " + product + " à " + prix + " sous.");
            money -= prix;
        } else {
            parler("Je n'ai plus que " + money + " sous en poche. Je ne peux même pas m'offrir un " + product + " à " + prix + " sous.");
        }
    }
}

