public class CheckDiagonals {
    public static void main(String[] args) {
        //9
        int tab4[][] = new int[5][5];
        int len1 = tab4.length;
        for (int i = 0; i < tab4.length; i++) {
            for (int j = 0; j < tab4.length; j++) {
                tab4[i][j] = (int) (Math.random() * 10);
                System.out.print(tab4[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("kolumna \\");

        int g = 0;
        for (int i = 0; i < len1; i++) {
            for (int a = i + 1; a < len1; a++) {
                if (tab4[i][i] == tab4[a][a]) {
                    System.out.println("tab[" + i + "][" + i + "]= " + tab4[i][i] + " tab[" + a + "][" + a + "]= " + tab4[a][a]);
                    g++;
                    break;
                }
            }
        }
        if (g == 0) {
            System.out.println("brak takich samych wartości w kolumnie \\");
        }

        System.out.println();
        System.out.println("kolumna /");

        int v = 0;
        int dlugosc = len1 - 1;
        for (int i = 0; i < len1; i++) {
            for (int j = dlugosc; j >= 0; j--) {
                if (i + j == dlugosc) {
                    for (int a = i + 1; a < len1; a++) {
                        for (int b = j - 1; b >= 0; b--) {
                            if (a + b == dlugosc && tab4[i][j] == tab4[a][b]) {
                                System.out.println("tab[" + i + "][" + j + "]= " + tab4[i][j] + " tab[" + a + "][" + b + "]= " + tab4[a][b]);
                                v++;
                                break;
                            }
                        }
                    }
                }
            }
        }


        if (v == 0) {
            System.out.println("brak takich samych wartości w kolumnie /");
        }
    }
}
