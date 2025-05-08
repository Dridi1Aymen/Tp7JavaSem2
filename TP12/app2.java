import java.util.Scanner;

public class app2 {
    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("entrez un entier strictement positif");
            while (!sc.hasNextInt()) {
                System.out.println("Erreur: Veuillez entrer un entier valide");
                sc.next();
            }
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Erreur: L'entier doit etre strictement positif");
            }
        } while (n <= 0);
        return n;

    }

    public static int factoriel_rec(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factoriel_rec(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = lectureN();
        int f = factoriel_rec(n);
        System.out.println("la factorielle de " + n + " egale " + f);
    }
}
