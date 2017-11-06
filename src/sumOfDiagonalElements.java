import java.util.Scanner;

public class sumOfDiagonalElements {
    public static void main(String[] args) {
        //9
        int rows = inputNumber("wierszy");
        int columns = inputNumber("kolumn");
        int tab[][] = new int[rows][columns];
        if (rows <= 1 || columns <= 1 || rows != columns) {
            System.out.println("Wykonanie operacji niemożliwe. Macierz nie posiada przekątnej głownej. Liczba wierszy(" + rows + ") rózna od liczby kolumn(" + columns + ").");
        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    tab[i][j] = (int) (Math.random() * 10);
                    System.out.print(tab[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("przekatna \\");

            int sameValuesExist = 0;
            for (int i = 0; i < rows; i++) {
                for (int a = i + 1; a < columns; a++) {
                    if (tab[i][i] == tab[a][a]) {
                        System.out.println("tab[" + i + "][" + i + "]= " + tab[i][i] + " tab[" + a + "][" + a + "]= " + tab[a][a]);
                        sameValuesExist++;
                    }
                }
            }
            if (sameValuesExist == 0) {
                System.out.println("brak takich samych wartości w przekatnej \\");
            }

            System.out.println();
            System.out.println("przekatna /");

            if (sameValuesExist != 0) {
                sameValuesExist = 0;
            }

            int lastElementIndex = rows - 1;

            for (int i = 0; i < rows; i++) {
                for (int a = i + 1; a < columns; a++) {
                    int j = lastElementIndex - i;
                    int b = lastElementIndex - a;
                    if (tab[i][j] == tab[a][b]) {
                        System.out.println("tab[" + i + "][" + (j) + "]= " + tab[i][j] + " tab[" + a + "][" + b + "]= " + tab[a][b]);
                        sameValuesExist++;
                    }
                }
            }

            if (sameValuesExist == 0) {
                System.out.println("brak takich samych wartości w przekatnej /");
            }
        }
    }

    public static int inputNumber(String text) {

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbe " + text + ": ");
        int number = in.nextInt();
        return number;
    }
}
