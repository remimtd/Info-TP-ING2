// Classe Plat
public class Plat {
    private int idPlat;
    private String nomPlat;
    private float prix;

    public Plat() {}

    public Plat(String nomPlat, float prix) {
        this.nomPlat = nomPlat;
        this.prix = prix;
    }

    public void modifierPrix(float nouveauPrix) {}
    public void changerDisponibilite() {}

    // Formate les informations du plat pour l'affichage
    public String afficherDetails() {
        return nomPlat + " - " + prix + "€";
    }
}
