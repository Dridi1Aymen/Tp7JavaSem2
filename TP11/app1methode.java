
import java.util.Scanner;
public class app1methode {
        
    
    
        // Méthode pour lire un entier strictement positif
        public static int lectureN(Scanner sc) {
            int n;
            do {
                System.out.print("Entrez un entier strictement positif : ");
                n = sc.nextInt();
            } while (n <= 0);
            return n;
        }
    
        // Méthode pour remplir le tableau
        public static void RemplirTab(int[] tab, Scanner sc) {
            for (int i = 0; i < tab.length; i++) {
                System.out.print("Entrez l'élément " + (i + 1) + " : ");
                tab[i] = sc.nextInt();
            }
        }
    
        // Méthode pour remplacer toutes les occurrences de X1 par X2
        public static void Remplacer(int[] tab, int x1, int x2) {
            for (int i = 0; i < tab.length; i++) {
                if (tab[i] == x1) {
                    tab[i] = x2;
                }
            }
        }
    
        // Méthode pour afficher le tableau
        public static void AfficheTab(int[] tab) {
            System.out.print("Contenu du tableau : ");
            for (int val : tab) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    
        // Programme principal
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            // Lecture de la taille du tableau
            int n = lectureN(sc);
    
            // Déclaration et remplissage du tableau
            int[] tableau = new int[n];
            RemplirTab(tableau, sc);
    
            // Lecture de X1 et X2
            System.out.print("Entrez l'entier à remplacer (X1) : ");
            int x1 = sc.nextInt();
            System.out.print("Entrez l'entier de remplacement (X2) : ");
            int x2 = sc.nextInt();
    
            // Remplacement et affichage
            Remplacer(tableau, x1, x2);
            AfficheTab(tableau);
    
            sc.close();
        }
    }
    
        
        
