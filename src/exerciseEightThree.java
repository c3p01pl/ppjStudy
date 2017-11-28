public class exerciseEightThree {
    public static void main(String[] args) {
        int size = commonMethods.inputNumber("Podaj N: ");

        int arrayToFill[][] = new int[size][size];

        int distance = 2;
        int tmpSize = arrayToFill.length - 1;
        int countFromZero = 0;
        int countFromDistance = distance;
        int fillBy = 6;

        commonMethods.fillColum(arrayToFill, 0, fillBy);
        for (int i = 1; i < size; i++) {
            commonMethods.fillRowFromTo(arrayToFill, tmpSize, countFromZero, tmpSize, fillBy);  //bottomRow
            commonMethods.fillColumnFromTo(arrayToFill, tmpSize, countFromZero, tmpSize, fillBy); //rightColumn
            commonMethods.fillRowFromTo(arrayToFill, countFromZero, countFromDistance, tmpSize, fillBy); //topRow
            tmpSize = tmpSize - distance;
            countFromZero = countFromZero + distance;
            countFromDistance = countFromDistance + distance;
            commonMethods.fillColumnFromTo(arrayToFill, countFromZero, i, tmpSize, fillBy);   //leftColumn
            i += (distance - 1);
        }
        commonMethods.displayTable(arrayToFill);
    }
}