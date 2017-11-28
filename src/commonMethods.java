import java.util.Scanner;

public class commonMethods {
    public static int inputNumber(String text) {

        Scanner in = new Scanner(System.in);
        System.out.print(text);
        int number = in.nextInt();
        return number;

    }
    public static void displayTable(int tab[][]) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void fillRow(int[][] tab, int row, int val) {
        for (int j = 0; j < tab[row].length; j++) {
            tab[row][j] = val;
        }
    }

    public static void fillColum(int[][] tab, int column, int val) {
        for (int[] tab1 : tab) {
            tab1[column] = val;
        }
    }

    public static void fillRowFromTo(int[][] tab, int row, int from, int to, int val) {
        for (int i = from; i < to + 1; i++) {
            tab[row][i] = val;
        }
    }

    public static void fillColumnFromTo(int[][] tab, int column, int from, int to, int val) {
        for (int i = from; i < to + 1; i++) {
            tab[i][column] = val;
        }
    }
}
