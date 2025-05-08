
import java.util.Scanner;

public class app4 {
    static String Lecture() {
        Scanner sc = new Scanner(System.in);
        String ch;
        do {
            System.out.print("Entrez une chaîne (max 30 caractères): ");
            ch = sc.nextLine();
        } while (ch.length() > 30);
        return ch;
    }

    static boolean Palindrome_rec(String ch, int debut, int fin) {
        if (debut >= fin) {
            return true;
        }
        if (ch.charAt(debut) != ch.charAt(fin)) {
            return false;
        }
        return Palindrome_rec(ch, debut + 1, fin - 1);
    }

    public static void main(String[] args) {
        String ch = Lecture();
        boolean estPalindrome = Palindrome_rec(ch, 0, ch.length() - 1);
        System.out.println("'" + ch + "' est un palindrome? " + estPalindrome);
    }

}
