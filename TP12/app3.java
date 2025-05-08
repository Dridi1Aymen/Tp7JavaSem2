import java.util.Scanner;

public class app3 {
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

    public static boolean estPremier_rec(int n, int div) {
        if (n < 2)
            return false;
        if (div * div > n)
            return true;
        if (n % div == 0)
            return false;
        return estPremier_rec(n, div + 1);
    }

    public static void main(String[] args) {
        int n = lectureN();
        if (estPremier_rec(n, 2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("Nombres premiers inférieurs à " + n + " :");
        for (int i = 2; i < n; i++) {
            if (estPremier_rec(i, 2)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}