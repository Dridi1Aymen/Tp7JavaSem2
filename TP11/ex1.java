import java.util.Scanner;
public class ex1 {
    //fonction somme qui fournit la somme des valeurs d'un tableau de reels de taille quelconque
    public static double somme(double[] tab) {
        double s = 0;
        for (int i = 0; i < tab.length; i++) {
            s =s + tab[i];
        }
        return s;
    }

    //fonction incremente d'une valeur donneé toutes les valeurs d'un tableau de reels
    public static void incremente(double[] tab, double x) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = tab[i] + x;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Methode.lectureN();
        double[] tab = new double[n];
        System.out.println("Entrez les valeurs du tableau :");
        for (int i = 0; i < n; i++) {
            tab[i] = sc.nextDouble();
        }
        System.out.println("Somme des valeurs du tableau : " + somme(tab));
        System.out.println("Entrez la valeur d'increment : ");
        double x = sc.nextDouble();
        incremente(tab, x);
        System.out.println("Tableau apres incrementation : ");
        for (int i = 0; i < n; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        

    }
}
