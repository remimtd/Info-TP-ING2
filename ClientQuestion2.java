// Classe Client (L'héritage)
public class Client extends Utilisateur {
    // Attributs spécifiques à la classe Client
    private String adresseLivraison;
    private String numeroTel;
    private int pointsFidelite;

    public Client() {}

    public Client(String nom, String email, String adresseLivraison, String numeroTel) {
        // Appel du constructeur de la superclasse (Utilisateur)
        super(nom, email);
        this.adresseLivraison = adresseLivraison;
        this.numeroTel = numeroTel;
        this.pointsFidelite = 0;
    }

    public void passerCommande() {}
    public void suivreCommande() {}
    public void ajouterAuPanier() {}
}
