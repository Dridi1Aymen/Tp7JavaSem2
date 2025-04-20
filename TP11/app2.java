import java.util.Scanner;
public class app2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n=Methode.lectureN2();
        int[] tableau = new int[n];
        Methode.RemplirTab(tableau, sc);
        double moyenne=Methode.calcul_Moyenne(tableau);
        System.out.println("La moyenne est : " + moyenne);
        int nb=Methode.NombreNote(tableau, n);
        System.out.println("Le nombre de notes supérieures à la moyenne est : " + nb);
    }
    
}
