import java.util.*;

public class app5 {
    static String Lecture() {
        Scanner scanner = new Scanner(System.in);
        String ch;
        do {
            System.out.print("Entrez une chaîne de caractères (max 50): ");
            ch = scanner.nextLine();
            if (ch.length() > 50) {
                System.out.println("La chaîne est trop longue. Veuillez réessayer.");
            }
        } while (ch.length() > 50);
        return ch;
    }

    static int Nbr_Occ_rec(String mot, char Car) {
        if (mot.isEmpty()) {
            return 0;
        }
        int count = (mot.charAt(0) == Car) ? 1 : 0;
        return count + Nbr_Occ_rec(mot.substring(1), Car);
    }

    public static void main(String[] args) {
        String ch = Lecture();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un caractère à compter: ");
        char Car = scanner.next().charAt(0);
        int count = Nbr_Occ_rec(ch, Car);
        System.out.println("Le caractère '" + Car + "' apparaît " + count + " fois.");
    }

}
