public class diagonalsCheck {
    public static void main(String[] args){
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
        System.out.println("kolumna /");
        int dl = len1-1;
        for (int i=0; i<tab4.length; i++){
            for(int j=dl;j>0;j--){
                if (i < dl){
                    if (tab4[i][j] == tab4[i+1][j-1]) {
                        System.out.println("ok");
                    }
                }

            }
//            System.out.println(tab4[i][j]);
//            System.out.println(j);
        }
    }
}
