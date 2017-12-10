public class ExerciseNineFour {
    public static void main(String[] args) {
        int[][] array = new int[10][2];
        for (int i = 0; i < array.length; i++) {
            for (int u = 0; u < array[0].length; u++) {
                array[i][u] = (int) (Math.random() * 100);
                System.out.print(array[i][u] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            leastCommonMultiple(array[i][0], array[i][1]);
        }
        System.out.println();


    }

    public static void leastCommonMultiple(int firstNumber, int secondNumber) {
        int maxium = 0, minimum = 0, lcm = 0;
        if (firstNumber > secondNumber) {
            maxium = firstNumber;
            minimum = secondNumber;
        } else {
            maxium = secondNumber;
            minimum = firstNumber;
        }

        int variable;
        for (int i = 1; i <= minimum; i++) {
            variable = maxium * i;
            if (variable % minimum == 0) {
                lcm = variable;
                break;
            }
        }
        System.out.println("Najmniejsza wspólna wielokrotnosc dla l1: " + firstNumber + " i l2: " + secondNumber + " wynosi " + lcm);
    }
}

