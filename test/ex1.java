import java.util.Scanner;
public class ex1 {
    public static int lecture(){
        Scanner sc=new Scanner(System.in);
        int n ;
        do { 
            System.out.println("entre un entier n positif :");
            while(!sc.hasNextInt()){
                System.out.println("Erreur : veuillez entrer un entier valide.");
                sc.next();

            }
            n=sc.nextInt();
            if(n<=0){
                System.out.println("Erreur: entre un entier positif");
            }
        } while (n<=0);
        return n;
    }
    public static int compter(int n){
        if (n==0){
            return 1;
        }
        int nb=0;
        while (n!=0){
            n=n/10;
            nb++;
        }
        return nb;
    }
    public static void main(String[] args) {
        int nombre=lecture();
        int nb=compter(nombre);
        System.out.println("le nombre de chiffres de "+ nombre +" est :"+nb);
    }
}
