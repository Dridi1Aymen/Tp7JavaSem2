import java.util.Scanner;
public class ex2 {
    public static int Addition(int a , int b){
        return a+b;
    }
    public static int Soustraction(int a, int b){
         return a-b;
    }
    public static int Multiplication(int a , int b){
        return a*b;
    }
    public static int Division(int a , int b){
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entrez le premier entier :");
        int a=sc.nextInt();
        System.out.println("donner le deuxieme entier :");
        int b=sc.nextInt();
        System.out.println("choisie l'operation ");
        System.out.println("1: addition");
        System.out.println("2: soustraction");
        System.out.println("3: multiplication");
        System.out.println("4: division");
        int choix = sc.nextInt();
        if (choix==1){
            System.out.println("le resultat de l'addition est : "+Addition(a,b));
        }else if (choix==2){
            System.out.println("le resultat de la soustraction est : "+Soustraction(a,b));
        }else if (choix==3){
            System.out.println("le resultat de la multiplication est : "+Multiplication(a,b));
        }else if (choix==4){
            if (a==0 || b==0){
                System.out.println("Erreur: division par zero");
            }else{
                System.out.println("le resultat de la division est : "+Division(a,b));
            }
            
        }
        
        //System.out.println("le resultat de l'addition est : "+Addition(a,b));
        //System.out.println("le resultat de la soustraction est : "+Soustraction(a,b));
        //System.out.println("le resultat de la multiplication est : "+Multiplication(a,b));
        //System.out.println("le resultat de la division est : "+Division(a,b));
    }
}
