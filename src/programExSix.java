public class programExSix {
    public static void main(String[] args){
        //1
        int tab[] = new int[10];
        System.out.println(tab.length);
        for(int i=0; i<tab.length; i++){
            tab[i] = (int)Math.round(Math.random());
            System.out.println(tab[i]);
        }
        //2
        int jeden = 0;
        int zero = 0;
        for (int i=0; i<tab.length; i++){
            if (tab[i] == 1){
                jeden++;
            }
            else {zero++;}
        }
        System.out.println("Ilość jedynek: " + jeden +" Ilość zer: " + zero);

        //3

        int tab1[] = new int[(int)(Math.random()*100)];
        System.out.println("Dlugosc tablic wynosi: " + tab1.length);

        //4
        double tab2[] = new double[10];
        for (int i = 0; i < tab2.length; i++){
            tab2[i] = Math.random()*100;
            System.out.println("wartość tab["+i+"]: " + tab2[i]);
        }
        for (int i = 0; i < tab2.length; i++) {
            if (i % 2 == 0) {
                System.out.println("tab2[" + i + "]:" + tab2[i]);
            }
        }
        for (int i = 0; i < tab2.length; i++) {
            if ((int)tab2[i] % 2 > 0) {
                System.out.println("tab2[" + i + "]:" + (int)tab2[i]);
            }
        }
        //5
        int tab3[] = {1,0,0,0,2,0,0,0,3};
        for (int i = 0; i < 3; i++){
            System.out.print( tab3[i]+" ");}
        System.out.println();
        for (int i = 3; i < 6; i++){
            System.out.print( tab3[i]+" ");}
        System.out.println();
        for (int i = 6; i < 9; i++){
            System.out.print( tab3[i]+" ");}

        System.out.println();
        System.out.println();

        for (int i = 6; i < 9; i++){
            System.out.print( tab3[i]+" ");}
        System.out.println();
        for (int i = 3; i < 6; i++){
            System.out.print( tab3[i]+" ");}
        System.out.println();
        for (int i = 0; i < 3; i++){
            System.out.print( tab3[i]+" ");}

        System.out.println();
        System.out.println();

        for (int i = 8; i >= 6; i--){
            System.out.print( tab3[i]+" ");}
        System.out.println();
        for (int i = 5; i >= 3; i--){
            System.out.print( tab3[i]+" ");}
        System.out.println();
        for (int i = 2; i >= 0; i--){
            System.out.print( tab3[i]+" ");}

        System.out.println();
        System.out.println();

        //6
        /*zmienna nie została zaincjalizowana*/
        //7
        //Wyjda same zera
        //8
        int tabD[][] = {{1,0,0},{0,1,0},{0,0,1}};
        int len = tabD.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++)
            {
                System.out.print(tabD[i][j]+" ");
            }
            System.out.println();
        }

        int p=0;
        int q=0;

        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++) {
                if(i!=j && tabD[i][j]!=0) {
                    p=1;
                    break;
                }
                if(i==j && tabD[i][j]==0){
                    q++;
                }
            }
        }

        if(p==0 && q<3){
            System.out.println("Diagonalna");
        }
        else{
            System.out.println("Nie jest diagonalna.");
        }

        System.out.println();

        //9
        int tab4[][] = new int[5][5];
        for (int i = 0; i < tab4.length; i++){
            for (int j = 0; j < tab4.length; j++){
                tab4[i][j]=(int)(Math.random()*10);
                System.out.print(tab4[i][j] + " ");
            }
            System.out.println();
        }

    }
}
