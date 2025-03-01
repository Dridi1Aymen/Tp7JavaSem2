import java.util.Scanner;
public class  app2{
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        StringBuffer ch;
        do { 
            System.out.println("Entrez la chaîne à coder (max 30 caractères) : ");
            ch=new StringBuffer(Scanner.nextLine());
        } while (ch.length()<=0 || ch.length()>=30);
        for (int i = 0; i<ch.length();i++) {
            
        }

    }
}