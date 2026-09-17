// Classe Commande (L'association et l'agrégation)
import java.util.ArrayList;
import java.util.List;

public class Commande {
    private int idCommande;
    private float prixTotal;
    private String statut;

    // Relation d'association (1 Commande est passée par 1 Client)
    private Client client;

    // Relation d'agrégation (1 Commande contient une liste de Plats : multiplicité 1..*)
    private List<Plat> listePlats;

    public Commande() {}

    public Commande(Client client) {
        this.client = client;
        this.listePlats = new ArrayList<>(); // Initialisation de la collection
        this.statut = "En préparation";
    }

    // Méthode permettant d'ajouter un élément à l'agrégation
    public void ajouterPlat(Plat plat) {
        this.listePlats.add(plat);
        System.out.println(plat.afficherDetails() + " ajouté à la commande.");
    }

    public float calculerTotal() { return prixTotal; }
    public void validerCommande() {}
    public void annulerCommande() {}
}
