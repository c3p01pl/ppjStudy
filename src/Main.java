public class Main {

    public static void main(String[] args) {
        //1,2
//        double sqTwo = Math.sqrt(2);
//        double wynik = Math.pow(sqTwo, 2);
//        double wynik1 = wynik - 2;
//        System.out.println(wynik1);
//
//        if (wynik1 == 0) {
//            System.out.println("exoected");
//        }
//            else{
//                System.out.println("not expeceted");
//            }

        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        double wrt = in.nextDouble();
        System.out.println(wrt);
        int tmp = 3;

        /*
//        System.out.println(wrt & (1 << tmp--));
//        System.out.println(wrt & (1 << tmp--));
//        System.out.println(wrt & (1 << tmp--));
//        System.out.println(wrt & (1 << tmp--));
        System.out.println(wrt);
        //4
        String zb = (wrt < 0) ? "B" : ((wrt > 1) ? "A" :  "ABC");
        System.out.println("Liczba: "+wrt+" należy do: "+zb);
        //5
        */

        byte a = 40 , b = 50;
//        byte suma = (byte)a + b;
//        System.out.println(suma) ;

        //6
//        String sloik = "brzoskwinia";
//        switch (sloik) {
//            case "truskawkowy":
//                System.out.println("truskawaka"); break;
//            case "malinowy":
//                System.out.println("malina"); break;
//            case "brzoskwinia":
//                System.out.println("brzoskwinia"); break;
//            case "agrest":
//                System.out.println("agres"); break;
//
//        }


        int x = 4;
        long y = x*4-x++;
        System.out.println(y);
        if (y<12) System.out.println("Za mało"); // dodawne jest po operacjach
        else System.out.println("w sam raz");

        //7
//        boolean x = true, z = true;
//        int y = 20;
//        x = (y!= 10) ^ (z=false);
//        System.out.println(x+"," +y+ ","+z);
    }

        //3

}

