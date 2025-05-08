import java.util.Scanner;
public class ex3 {
    // fonction remplir tableau
    public static void remplir(int[] t) {
        Scanner sc = new Scanner(System.in);
        System.out.println("donner les valeurs du tableau: ");
        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }
    }
    // fonction tri
    public static int [] tri(int[] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i] > t[j]) {
                    int aux = t[i];
                    t[i] = t[j];
                    t[j] = aux;
                }
            }
        }
        return t;
    }
    // fonction afficher tableau
    public static void afficher(int[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("donner un entier: ");
        int n= sc.nextInt();
        int[] t = new int[n];
        System.out.println("tableau initial: ");
        afficher(t);
        System.out.println("");
        tri(t);
        System.out.println("tableau initial: ");
        afficher(t);
        
        
    }
}
