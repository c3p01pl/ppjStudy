public class CheckDiagonals {
    public static void main(String[] args) {
        //9
        int tab[][] = new int[4][4];
        int tableLength = tab.length;
        if (tableLength != tab[1].length){
            System.out.println("Macie");
        }
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = (int) (Math.random() * 10);
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("przekatna \\");

        int sameValuesExist = 0;
        for (int i = 0; i < tableLength; i++) {
            for (int a = i + 1; a < tableLength; a++) {
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

        int lastElementIndex = tableLength - 1;

        for (int i = 0; i < tableLength; i++) {
            for (int a = i + 1; a < tableLength; a++) {
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
