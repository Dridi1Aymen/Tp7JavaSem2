import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un mot : ");
        String mot = scanner.nextLine().toLowerCase();

        int[] voy = new int[6]; 

        for (int i = 0; i < mot.length(); i++) {
            char lettre = mot.charAt(i);
            if (lettre == 'a') {
                voy[0]++;
            } else if (lettre == 'i') {
                voy[1]++;
            } else if (lettre == 'o') {
                voy[2]++;
            } else if (lettre == 'u') {
                voy[3]++;
            } else if (lettre == 'e') {
                voy[4]++;
            } else if (lettre == 'y') {
                voy[5]++;
            }
        }

        // Affichage des résultats
        char[] voyelles = {'a', 'i', 'o', 'u', 'e', 'y'};
        for (int i = 0; i < voy.length; i++) {
            System.out.println(voy[i] + " fois la lettre " + voyelles[i]);
        }

        scanner.close();
    }
}
