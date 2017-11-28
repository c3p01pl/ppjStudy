public class exerciseSevenFive {

    public static void main(String[] args) {

        int matrixSize = commonMethods.inputNumber("Podaj liczbe N: ");
        int tab[][] = new int[matrixSize][matrixSize];

        for (int a = 0; a < matrixSize; a++) {
            for (int i = a; i < matrixSize; i++) {
                for (int j = a; j < matrixSize; j++) {
                    tab[i][j] = a;
                }
            }
            matrixSize--;
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }


    }
}
