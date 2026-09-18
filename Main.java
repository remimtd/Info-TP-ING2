import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("Sacha",19);
        System.out.println("Nom de l'étudiant : "+ e1.getNom());
        System.out.println("Age : "+ e1.getAge());
        Scanner scanner = new Scanner(System.in);

        e1.setAge(30);
        System.out.println("Age : "+ e1.getAge());
    }
}