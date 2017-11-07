public class checkIfAnySumRowEqualsAnySumColumn extends sumOfDiagonalElements {
    public static void main(String[] args) {
        int rows = inputNumber("Podaj liczbe wierszy: ");
        int columns = inputNumber("Podaj liczbe kolumn: ");
        int matrix[][] = new int[rows][columns];

        System.out.println();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[] rowsSum = new int[rows];
        int[] columnsSum = new int[columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rowsSum[i] += matrix[i][j];
                columnsSum[j] += matrix[i][j];
            }
        }

        System.out.println();

        for (int g = 0; g < rowsSum.length; g++) {
            System.out.println("Suma wiesza " + g + " = " + rowsSum[g]);
        }
        System.out.println();
        for (int k = 0; k < columnsSum.length; k++) {
            System.out.println("Suma kolumny " + k + " = " + columnsSum[k]);
        }
        System.out.println();
        int counter = 0;
        for (int i = 0; i < rowsSum.length; i++) {
            for (int j = 0; j < columnsSum.length; j++) {
                if (rowsSum[i] == columnsSum[j]) {
                    System.out.println("Suma w wierszu " + i + " jest równa z suma kolumny " + j + " i wynosi " + rowsSum[i] + ".");
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("Nie wystepuja kolumny i wiersze z taka sama wartościa.");
        }
    }
}
