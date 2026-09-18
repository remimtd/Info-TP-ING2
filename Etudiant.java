public class Etudiant {
    private String nom;
    private int age;
    public Etudiant(String nom, int age){
         this.nom = nom;
         this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getNom() {
        return nom;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
