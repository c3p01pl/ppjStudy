import java.util.Scanner;

public class exerciseSevenFive {

    public static void main(String[] args) {

        int matrixSize = inputNumber("Podaj liczbe N: ");
        int tab[][] = new int[matrixSize][matrixSize];
        int tempSize = matrixSize;

        for (int a = 0; a < tempSize; a++) {
            for (int i = a; i < tempSize; i++) {
                for (int j = a; j < tempSize; j++) {
                    tab[i][j] = a;
                }
            }
            tempSize = tempSize - 1;
        }

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static int inputNumber(String text) {

        Scanner in = new Scanner(System.in);
        System.out.print(text);
        int number = in.nextInt();
        return number;
    }
}
