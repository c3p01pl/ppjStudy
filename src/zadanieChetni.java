import java.util.Arrays;


public class wilingEx {
    /*
     * Checking if chars are proper according to chosen numeral system.
     */
    public static void checker(String rz1, String rz0, String[] znakiDop){


        boolean flag1 = Arrays.asList(znakiDop).contains(rz1);
        boolean flag0 = Arrays.asList(znakiDop).contains(rz0);

        if (!(flag1 & flag0)){
            System.out.println("Wprowadzono złe dane.");
            System.exit(1);
        }
    }

    public static void main(String[] args){

//        char[] znaki = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','a','b','c','d','e','f'};
        String[] znaki = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","a","b","c","d","e","f"};


        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Podaj typ liczby (b - binarny, d - dziesietny, h - szesnastkowy): ");
        char typ = in.next().charAt(0);

        System.out.print("Podaj rzad1: ");
        char rzad1 = in.next().charAt(0);
        System.out.print("Podaj rzad0: ");
        char rzad0 = in.next().charAt(0);
        String LiczbaRzad1 = Character.toString(rzad1);
        String LiczbaRzad0 = Character.toString(rzad0);
        String liczbaString = LiczbaRzad1 + LiczbaRzad0;

        switch (typ) {
            case 'b':
                System.out.println("Wybrano System Binarny.");
                znaki = Arrays.copyOfRange(znaki, 0, 2);
                checker(LiczbaRzad1,LiczbaRzad0,znaki);
                int wynik = Integer.parseInt(liczbaString,2);
                System.out.println("Twoja liczba w systemie binarnym to: " + liczbaString);
                System.out.println("Twoja liczba w systemie dziesiętnym to: " + wynik);
                System.out.println("Twoja liczba w systemie szesnastkowym to: " + wynik);
                break;
            case 'd':
                System.out.println("Wybrano System Dziesiętny.");
                znaki = Arrays.copyOfRange(znaki, 0, 11);
                checker(LiczbaRzad1,LiczbaRzad0,znaki);
                wynik = Integer.parseInt(liczbaString);
                System.out.println("Twoja liczba w systemie binarnym to: " + Integer.toBinaryString(wynik));
                System.out.println("Twoja liczba w systemie dziesiętnym to: " + wynik);
                System.out.println("Twoja liczba w systemie szesnastkowym to: " + Integer.toHexString(wynik).toUpperCase());
                break;
            case 'h':
                System.out.println("Wybrano System szesnastkowy.");
                checker(LiczbaRzad1,LiczbaRzad0,znaki);
                wynik = Integer.parseInt(liczbaString,16);
                System.out.println("Twoja liczba w systemie binarnym to: " + Integer.toBinaryString(wynik));
                System.out.println("Twoja liczba w systemie dziesiętnym to: " + wynik);
                System.out.println("Twoja liczba w systemie szesnastkowym to: " + liczbaString);
                break;
            default:
                System.out.println("ERROR");
                System.exit(1);
        }
    }
}
