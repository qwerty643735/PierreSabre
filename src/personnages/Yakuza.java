package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation;
	
	public Yakuza(String nom, String boisson, int money, String clan) {
        super(nom, clan, money);
        this.clan = clan;
        this.reputation = 0;
    }
	
	public void extorquer(Commercant victime) {
        int montantExtorque = victime.seFaireExtorquer();
        gagnerArgent(montantExtorque);
        reputation++;
        parler("J’ai piqué les " + montantExtorque + " sous de " + victime.getNom() + ", ce qui me fait " + getMoney() + " sous dans ma poche. Hi ! Hi !");
    }
}