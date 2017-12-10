public class ExerciseNineThree {
    public static void main(String[] args) {
        int rows = 10;
        int columns = 10;
        int[][] arraySecond = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arraySecond[i][j] = (int) (Math.random() * 10);
                System.out.print(arraySecond[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(jestJednostkowa(arraySecond));
    }

    public static boolean jestJednostkowa(int[][] array) {
        int rows = array.length;
        int columns = array[0].length;
        boolean firstCondition = false;
        boolean secondCondition = false;
        boolean thirdConditions = false;

        if (rows == columns) {
            firstCondition = true;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (array[i][j] == 0) {
                    secondCondition = true;
                }
            }
        }

        for (int k = 0; k < rows; k++) {
            if (array[k][k] == 1) {
                thirdConditions = true;
            }
        }
        boolean isOk = false;
        if (firstCondition && secondCondition && thirdConditions) {
            isOk = true;

        }

        return isOk;

    }
}
