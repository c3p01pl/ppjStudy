import java.util.Arrays;

public class wilingEx {

    public static void checker(char rz1, char rz0, char[] znakiDop){
        boolean flag = false;
        for (char c : znakiDop) {
            if (c == rz1) {
                for (char d : znakiDop){
                    if (d == rz0){
                        flag = true;
                    }
                }
            }
        }

        if (!flag){
            System.out.println("Wprowadzono złe dane.");
            System.exit(1);
        }
    }

    public static void main(String[] args){

        char typ, rzad1, rzad0;
        char[] znaki = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','a','b','c','d','e','f'};
        int wynik;


        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Podaj typ liczby (b - binarny, d - dziesietny, h - szesnastkowy): ");
        typ = in.next().charAt(0);

        System.out.print("Podaj rzad1: ");
        rzad1 = in.next().charAt(0);
        System.out.print("Podaj rzad0: ");
        rzad0 = in.next().charAt(0);
        String liczbaString = new StringBuilder().append(rzad1).append(rzad0).toString();

        switch (typ) {
            case 'b':
                System.out.println("Wybrano System Binarny.");
                znaki = Arrays.copyOfRange(znaki, 0, 2);
                checker(rzad1,rzad0,znaki);
                wynik = Integer.parseInt(liczbaString,2);
                System.out.println("Twoja liczba w systemie binarnym to: " + liczbaString);
                System.out.println("Twoja liczba w systemie dziesiętnym to: " + wynik);
                System.out.println("Twoja liczba w systemie szesnastkowym to: " + wynik);
                break;
            case 'd':
                System.out.println("Wybrano System Dziesiętny.");
                znaki = Arrays.copyOfRange(znaki, 0, 11);
                checker(rzad1,rzad0,znaki);
                wynik = Integer.parseInt(liczbaString);
                System.out.println("Twoja liczba w systemie binarnym to: " + Integer.toBinaryString(wynik));
                System.out.println("Twoja liczba w systemie dziesiętnym to: " + wynik);
                System.out.println("Twoja liczba w systemie szesnastkowym to: " + Integer.toHexString(wynik).toUpperCase());
                break;
            case 'h':
                System.out.println("Wybrano System szesnastkowy.");
                checker(rzad1,rzad0,znaki);
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
