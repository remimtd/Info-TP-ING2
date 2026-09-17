// Classe Utilisateur (La classe mère)
public class Utilisateur {
    // Visibilité protected pour permettre l'accès direct par les classes filles
    protected int idUtilisateur;
    protected String nom;
    protected String email;

    // Constructeur par défaut
    public Utilisateur() {}

    // Constructeur avec paramètres
    public Utilisateur(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }

    // Méthode propre à la classe parente
    public void seConnecter() {
        System.out.println(this.nom + " s'est connecté au système.");
    }

    public void seDeconnecter() {}
    public void modifierProfil() {}
}
