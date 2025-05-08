public class ex5 {
    public static void affiche(double[][] t) {
        for (double[] ligne : t) {
            for (double valeur : ligne) {
                System.out.print(valeur + " ");
            }
            System.out.println();
        }
    }
    public static boolean regulier(double[][] t) {
        if (t.length == 0) return true; // empty array is considered regular
        
        int referenceLength = t[0].length;
        for (double[] ligne : t) {
            if (ligne.length != referenceLength) {
                return false;
            }
        }
        return true;
    }
    public static double[] sommelignes(double[][] t) {
        double[] sommes = new double[t.length];
        
        for (int i = 0; i < t.length; i++) {
            double somme = 0.0;
            for (double valeur : t[i]) {
                somme += valeur;
            }
            sommes[i] = somme;
        }
        
        return sommes;
    }
    public static double[][] somme(double[][] t1, double[][] t2) {
        // Check if both arrays are regular and have same dimensions
        if (!regulier(t1) || !regulier(t2)) return null;
        if (t1.length != t2.length || t1.length == 0) return null;
        if (t1[0].length != t2[0].length) return null;
        
        double[][] resultat = new double[t1.length][t1[0].length];
        
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[0].length; j++) {
                resultat[i][j] = t1[i][j] + t2[i][j];
            }
        }
        
        return resultat;
    }
    public static void main(String[] args) {
        // Test data
        double[][] regularArray1 = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
        double[][] regularArray2 = {{0.5, 1.5, 2.5}, {3.5, 4.5, 5.5}};
        double[][] irregularArray = {{1.0, 2.0}, {3.0, 4.0, 5.0}};
        double[][] differentSizeArray = {{1.0, 2.0}, {3.0, 4.0}};

        // Test affiche method
        System.out.println("Affichage de regularArray1:");
        affiche(regularArray1);
        System.out.println();

        // Test regulier method
        System.out.println("regularArray1 est regulier: " + regulier(regularArray1));
        System.out.println("irregularArray est regulier: " + regulier(irregularArray));
        System.out.println();

        // Test sommelignes method
        System.out.println("Sommes des lignes de regularArray1:");
        double[] sommes = sommelignes(regularArray1);
        for (double s : sommes) {
            System.out.print(s + " ");
        }
        System.out.println("\n");
        System.out.println("Somme de regularArray1 et regularArray2:");
        double[][] sumArray = somme(regularArray1, regularArray2);
        if (sumArray != null) {
            affiche(sumArray);
        } else {
            System.out.println("Les tableaux ne sont pas compatibles pour l'addition.");
        }
        System.out.println();

        // Test somme method with incompatible arrays
        System.out.println("Somme de regularArray1 et irregularArray:");
        sumArray = somme(regularArray1, irregularArray);
        if (sumArray != null) {
            affiche(sumArray);
        } else {
            System.out.println("Les tableaux ne sont pas compatibles pour l'addition.");
        }
        System.out.println();

        // Test somme method with different size arrays
        System.out.println("Somme de regularArray1 et differentSizeArray:");
        sumArray = somme(regularArray1, differentSizeArray);
        if (sumArray != null) {
            affiche(sumArray);
        } else {
            System.out.println("Les tableaux ne sont pas compatibles pour l'addition.");
        }
    }
}

