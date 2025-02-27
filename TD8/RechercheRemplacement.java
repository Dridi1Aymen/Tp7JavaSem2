import java.util.Scanner;
class RechercheRemplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L,P;
        String mot1,mot2;
        String texte,texte2;

        
        System.out.print("Saisir un texte : ");
        texte = scanner.nextLine();

        
        System.out.print("Donner mot 1 : ");
        mot1 = scanner.nextLine();

        System.out.print("Donner mot 2 : ");
        mot2 = scanner.nextLine();

        
        if (texte.indexOf(mot1)==-1) {
            System.out.println(mot1+"n'existe pas!");
        }
        else{
            L=mot1.length();
            
                P=texte.indexOf(mot1);
                texte2=texte.replace(mot1, mot2);
                System.out.println("le noveau texte est :"+ texte2);

            }
             
            }
           
        }
    
