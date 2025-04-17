import java.util.Scanner;
public class ex3 {
    public static String groupe(String verbe) {
        String[] troisiemeGroupe = {
            "aller", "venir", "tenir", "mourir", "voir", "pouvoir", "vouloir",
            "savoir", "valoir", "recevoir", "devoir", "prendre", "mettre",
            "lire", "dire", "faire", "boire", "croire", "vivre", "suivre"
        };

        for (String v : troisiemeGroupe) {
            if (verbe.equals(v)) {
                return "3ème groupe";
            }
        }

        if (verbe.endsWith("er")) {
            return "1er groupe";
        } else if (verbe.endsWith("ir")) {
            if (estDeuxiemeGroupe(verbe)) {
                return "2ème groupe";
            } else {
                return "3ème groupe";
            }
        } else if (verbe.endsWith("re") || verbe.endsWith("oir")) {
            return "3ème groupe";
        } else {
            return "Verbe inconnu";
        }
    }

    public static boolean estDeuxiemeGroupe(String verbe) {
        String[] verbesDeuxieme = {
            "finir", "choisir", "grandir", "grossir", "rougir", "réussir",
            "applaudir", "bâtir", "établir", "agir", "unir"
        };

        for (String v : verbesDeuxieme) {
            if (verbe.equals(v)) {
                return true;
            }
        }

        return false;
    }

    public static boolean estInfinitif(String verbe) {
        return verbe.endsWith("er") || verbe.endsWith("ir") || verbe.endsWith("re") || verbe.endsWith("oir") || verbe.equals("aller");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String verbe;

        do {
            System.out.print("Entrez un verbe à l'infinitif : ");
            verbe = scanner.nextLine().toLowerCase().trim();
        } while (!estInfinitif(verbe));

        String groupe = groupe(verbe);
        System.out.println("Le verbe \"" + verbe + "\" appartient au " + groupe + ".");
    }
}
    


