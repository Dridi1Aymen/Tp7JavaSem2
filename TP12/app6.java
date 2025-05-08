
import java.util.Scanner;

public class app6 {
    static int Lecture() {
        Scanner sc = new Scanner(System.in);
        int n ;
        do {
            System.out.println("entrez un entier strictement positif  :");
            while (!sc.hasNextInt()) {
                System.out.println("Erreur : veuillez entrer un entier valide.");
                sc.next();
            }
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Erreur : L'entier doit etre strictement positif .");
            }
        } while (n <= 0);
        return n;
    }

    static void RemplirTab(int[] tab, int n, int i) {
        Scanner sc = new Scanner(System.in);
        if (i <= n) {
            System.out.println("entrer tab[" + i + "] : ");
            tab[i] = sc.nextInt();
            RemplirTab(tab, n, i + 1);
        }

    }

    static int SommeTab_rec(int[] tab, int n) {
        if (n == 0) {
            return tab[0];
        }
        return tab[n] + SommeTab_rec(tab, n - 1);

    }

    public static void main(String[] args) {
        int n = Lecture();
        int[] tab = new int[1000];
        int i = 1;
        RemplirTab(tab, n, i);
        int sum = SommeTab_rec(tab, n);
        System.out.println("La somme des éléments du tableau est: " + sum);

    }

}
