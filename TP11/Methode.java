import java.util.Scanner;
public class Methode {
    //methode lectureN
    public static int lectureN(){
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.println("entrez un entier strictement positif  :");
            while(!scanner.hasNextInt()){
                System.out.println("Erreur : veuillez entrer un entier valide.");
                scanner.next();
            }
            n= scanner.nextInt();
            if(n <= 0){
                System.out.println("Erreur : L'entier doit etre strictement positif .");
            }
            
        }while(n <= 0);
        return n;
    }
    // Méthode pour lire un entier strictement positif >= 10
    public static int lectureN2() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donner le nombre d'étudiants (>= 10) : ");
            n = scanner.nextInt();
            if (n < 10) {
                System.out.println("Erreur : le nombre doit être supérieur ou égal à 10.");
            }
        } while (n < 10);
        return n;
    }
    // Méthode pour remplir le tableau avec des notes valides entre 0 et 20
    public static void remplirTab2(double[] T) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < T.length; i++) {
            double note;
            do {
                System.out.print("Donner la note de l'étudiant " + (i + 1) + " (entre 0 et 20) : ");
                note = scanner.nextDouble();
                if (note < 0 || note > 20) {
                    System.out.println("Erreur : la note doit être entre 0 et 20.");
                }
            } while (note < 0 || note > 20);
            T[i] = note;
        }
    }
    //methode EstPair
    public static boolean EstPair(int n){
        return n % 2 == 0;
    }
    //methode nombreshifre
    public static int nombreshifre(int n){
        //return String.valueOf(n).length();
        int i = 0;
        while(n != 0){
            n = n/10;
            i++;
        }
        return i;
    }
    // methode calculerSomme n premiers carrés
    public static int calculerSomme(int n){
        int s = 0;
        for(int i = 1; i <= n; i++){
            s = s + i*i;
        }
        return s;
    }
    //methode estAmstrong
    public static boolean estAmstrong(int n){
        int s = 0;
        int aux = n;
        while(n != 0){
            int r = n % 10;
            s = s + r*r*r;
            n = n/10;
        }
        return aux == s;
        
    }
    //methode remplirTab
    public static void RemplirTab(int[] tab, Scanner sc) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            tab[i] = sc.nextInt();
        }
    }
    // fonction remplacer l'occurence de x1 par x2
    public static void Remplacer(int[] tab, int x1, int x2) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == x1) {
                tab[i] = x2;
            }
        }
    }
    // fonction afficher le tableau
    public static void Afficher(int tab[]) {
        System.out.print("Contenu du tableau : ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
    //lecture de x1
    public static int lecturex1(){
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.println("entrez un entier  x1 :");
            while(!scanner.hasNextInt()){
                System.out.println("Erreur : veuillez entrer un entier valide.");
                scanner.next();
            }
            n= scanner.nextInt();
            
        }while(n <= 0);
        return n;
    }
    //lecture de x2
    public static int lecturex2(){
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.println("entrez un entier  x2 :");
            while(!scanner.hasNextInt()){
                System.out.println("Erreur : veuillez entrer un entier valide.");
                scanner.next();
            }
            n= scanner.nextInt();
            
        }while(n <= 0);
        return n;
    }
    
    //fonction calcul_Moyenne
    public static double  calcul_Moyenne(int[] tab) {
        int s = 0;
        for (int i = 0; i < tab.length; i++) {
            s += tab[i];
        }
        return (double) s / tab.length;
        
    }
    // Méthode pour compter les notes supérieures à la moyenne
    public static int nombreNoteSupMoy(double[] T, double moyenne) {
        int compteur = 0;
        for (double note : T) {
            if (note > moyenne) {
                compteur++;
            }
        }
        return compteur;
    }
    //fonction retourner le nombre de notes supérieures à la moyenne de la classe
    public static int  NombreNote(int[] tab, double moyenne) {
        int nb = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > moyenne) {
                nb++;
            }
        }return nb;
        
    }

}