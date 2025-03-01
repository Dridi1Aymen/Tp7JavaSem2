import java.util.Scanner;
class recherBuffer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L,P;
        StringBuffer texte;
        String mot1,mot2;

        System.out.print("Saisir un texte : ");
        texte = new StringBuffer( scanner.nextLine());

        System.out.println("saisir mot 1 : ");
        mot1 = scanner.nextLine();

        System.out.println("saisir mot 2 : ");
        mot2 =scanner.nextLine();

        if (texte.indexOf(mot1.toString())==-1) {
            System.out.println(mot1+"n'existe pas!");
        }
        else{
            L=mot1.length();
            while((P=texte.indexOf(mot1.toString()))!=-1){
                texte.replace(P,P+L,mot2.toString());

            }
            System.out.println("le noveau texte est :"+ texte);

            }
             
            }
    
}
