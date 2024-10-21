package personnages;

public class Commercant extends Humain {
    
    public Commercant(String nom, int moeny) {
        super(nom, "thé", moeny);
    }

    public int seFaireExtorquer() {
        int montantExtorque = getMoney();
        perdreArgent(montantExtorque);
        parler("J’ai tout perdu! Le monde est trop injuste...");
        return montantExtorque;
    }

    public void recevoir(int money) {
        gagnerArgent(money);
        parler(money + " sous ! Je te remercie généreux donateur!");
    }
}