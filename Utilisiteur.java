package modele;

import java.util.Scanner;

public class Utilisateur {
    //instances
    protected String email;
    protected String motdepasse;
    protected String nom;

    //constructeur pour initialiser
    public Utilisateur(String email, String motdepasse, String nom){
        this.email = email;
        this.motdepasse = motdepasse;
        this.nom = nom;
    }

    public void seConnecter() {
        Scanner scanner = new Scanner(System.in);
        boolean connecte = false;

        while (!connecte) {
            System.out.print("Entrez votre email : ");
            String mailSaisi = scanner.nextLine();
            System.out.print("Entrez votre mot de passe : ");
            String mdpSaisi = scanner.nextLine();

            if (this.email.equals(mailSaisi) && this.motdepasse.equals(mdpSaisi)) {
                System.out.println("Connexion réussie. Bienvenue " + this.nom + " !");
                connecte = true;
            } else {
                System.out.println("Identifiants incorrects, réessayez.\n");
            }
        }
    }

    public void seDeconnecter() {
        System.out.println(this.nom + " est déconnecté");
    }

    //permet de changer le profil de l'utilisateur (nouveau mdp ou nouveau nom)
    public void modifierProfil(String nouveauNom, String nouveauMdp){
        this.nom = nouveauNom;
        this.motdepasse = nouveauMdp;
        System.out.println("Nouveau nom :" +this.nom); //affichage du nom, pas du mdp
    }

    //getter poour avoir le nom de la personne (car instance privée)
    public String getNom(){
        return this.nom;
    }
}
