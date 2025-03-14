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
            scanner.close();
        }while(n <= 0);
        return n;
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
}