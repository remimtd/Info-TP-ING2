import java.util.Scanner;

class Client {
    private String nom;
    private String adresse;
    private String choix;
    Scanner scanner =  new Scanner(System.in);
    //Le client entre ses infos, son nom, ses choix et son adresse
    public void infos(){
        System.out.println("Entrez votre nom :");
        nom = scanner.nextLine();
        System.out.println("Entrez vos choix :");
        choix = scanner.nextLine();
        System.out.println("Entrez votre adresse");
        adresse = scanner.nextLine();
    }
}


class Payement{
    //Banque du client
    private double banque;
    public int prix;
    public String payement;
    public String choix;
    public void payer(){
        System.out.println("Montant total : "+ prix);
        System.out.println("Payez par carte ");
        while(payement == "Refusé" || choix == "Abandonner"){
            System.out.println("Paiyement refusé veuillez réassayer");
        }
        if(payement == "Accepté"){
            banque = banque - prix;
            System.out.println("Paiyement accepté et commande livrée");
        }
    }
}

class Livreur {
    public String commande;
    public String livreur;
    public void chercher(){
        while(livreur!="Found"){
            System.out.println("A la recherche d'un livreur");
        }
        if(livreur=="Found"){
            System.out.println("Livreur trouvé");
        }
    }
}

class Choix{
    public String infos;
    public String choix;
    public void choisir(){
        System.out.println("Choisissez votre commande");
        System.out.println("Infos de la commande : "+ infos);
        if(choix=="Validé"){
            System.out.println("La commande est livrée");
        }
    }
}