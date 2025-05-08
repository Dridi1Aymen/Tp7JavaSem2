public class ex4 {
    public static void main(String[] args) {
        int [] [] t= new int[3][];
        for (int i = 0; i < 3; i++) {
            t[i] = new int[i+1];
            for (int j=0; j<t[i].length; j++){
                t[i][j]=i+j;
            }
        }
        for(int i=0;i<3;i++){
            System.err.println("tableau numero "+i+" : ");
            for (int j=0;j<t[i].length;j++){
                System.err.print(t[i][j]+" ");
                System.err.println();
            }
        }
    }
}
