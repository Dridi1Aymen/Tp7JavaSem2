import java.util.Scanner;
public class app1 {
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
    // fonction Somme recursive
    public static int Somme_rec(int n){
        if (n==0){
            return 0;
        }
        else {
            return n + Somme_rec(n-1);
        }
    }
    public static void main(String[] args) {
        int n = lectureN();
        int somme = Somme_rec(n);
        System.out.println("La somme  de 1 à " + n + " est : " + somme);
        
    }
}