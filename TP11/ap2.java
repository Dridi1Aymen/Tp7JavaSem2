import java.util.Scanner;

public class app2 {

    // Méthode pour lire un entier strictement positif >= 10
    public static int lectureN() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donner le nombre d'étudiants (>= 10) : ");
            n = scanner.nextInt();
            if (n < 10) {
                System.out.println("Erreur : le nombre doit être supérieur ou égal à 10.");
            }
        } while (n < 10);
        return n;
    }

    // Méthode pour remplir le tableau avec des notes valides entre 0 et 20
    public static void remplirTab(double[] T) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < T.length; i++) {
            double note;
            do {
                System.out.print("Donner la note de l'étudiant " + (i + 1) + " (entre 0 et 20) : ");
                note = scanner.nextDouble();
                if (note < 0 || note > 20) {
                    System.out.println("Erreur : la note doit être entre 0 et 20.");
                }
            } while (note < 0 || note > 20);
            T[i] = note;
        }
    }

    // Méthode pour calculer la moyenne des notes
    public static double calculMoy(double[] T) {
        double somme = 0;
        for (double note : T) {
            somme += note;
        }
        return somme / T.length;
    }

    // Méthode pour compter les notes supérieures à la moyenne
    public static int nombreNoteSupMoy(double[] T, double moyenne) {
        int compteur = 0;
        for (double note : T) {
            if (note > moyenne) {
                compteur++;
            }
        }
        return compteur;
    }

    // Programme principal
    public static void main(String[] args) {
        int n = lectureN();
        double[] T = new double[n];
        remplirTab(T);
        double moyenne = calculMoy(T);
        int nbSup = nombreNoteSupMoy(T, moyenne);

        System.out.printf("\nLa moyenne de la classe est : %.2f\n", moyenne);
        System.out.println("Nombre de notes supérieures à la moyenne : " + nbSup);
    }
}
