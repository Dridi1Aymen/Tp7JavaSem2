import java.util.Scanner;
public class app1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n=Methode.lectureN();
        int[] tableau = new int[n];
        Methode.RemplirTab(tableau, sc);
        int x1=Methode.lecturex1();
        int x2=Methode.lecturex2();
        Methode.Remplacer(tableau, x1, x2);
        Methode.Afficher(tableau);

    }
}

