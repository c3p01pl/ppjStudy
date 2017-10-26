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

    public static int hexTodec(String number, String[] dopZnaki){

        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < dopZnaki.length; i++) {
            strBuilder.append(dopZnaki[i]);
        }
        String znakiString = strBuilder.toString();

        number = number.toUpperCase();
        int wartNew = 0;

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            int wart = znakiString.indexOf(c);
            wartNew = 16*wartNew + wart;
        }
        return wartNew;
    }

    public static String decTohex(int wartDec, String[] HexStr){
        String wartHex = "";
        while(wartDec>0)
        {
            int reszta=wartDec%16;
            wartHex=HexStr[reszta]+ wartHex;
            wartDec=wartDec/16;
        }
        return wartHex;
    }

    public static int binToDec(String bin) {
        int wartDz = 0;
        for (int i = 0; i < bin.length(); i++) {
            wartDz *= 2;
            wartDz += bin.charAt(i) - '0';
        }
        return wartDz;
    }

    public static String decTobin(int number){
        StringBuilder strBuilder = new StringBuilder();
        String znakiString;
        int tmp = 7;
        while (tmp >= 0){
            int war = (number & (1 << tmp--));
            if (war > 0){
                war = 1;
            }
            strBuilder.append(war);
        }
        znakiString = strBuilder.toString();
        return znakiString;

    }




    public static void main(String[] args){

        String[] znaki = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};

        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Podaj typ liczby (b - binarny, d - dziesietny, h - szesnastkowy): ");
        char typ = in.next().charAt(0);

        System.out.print("Podaj rzad1: ");
        char rzad1 = in.next().charAt(0);
        System.out.print("Podaj rzad0: ");
        char rzad0 = in.next().charAt(0);


        String LiczbaRzad1 = Character.toString(rzad1).toUpperCase();
        String LiczbaRzad0 = Character.toString(rzad0).toUpperCase();
        String liczbaString = LiczbaRzad1 + LiczbaRzad0;


        switch (typ) {
            case 'b':
                System.out.println("Wybrano System Binarny.");
                String [] znakiBin = Arrays.copyOfRange(znaki, 0, 2);
                checker(LiczbaRzad1,LiczbaRzad0,znakiBin);
                int wynik = binToDec(liczbaString);
                System.out.println("Twoja liczba w systemie binarnym to: " + liczbaString);
                System.out.println("Twoja liczba w systemie dziesiętnym to: " + wynik);
                System.out.println("Twoja liczba w systemie szesnastkowym to: " + wynik);
                break;
            case 'd':
                System.out.println("Wybrano System Dziesiętny.");
                String [] znakiDz = Arrays.copyOfRange(znaki, 0, 11);
                checker(LiczbaRzad1,LiczbaRzad0,znakiDz);
                int liczbaInt = Integer.parseInt(liczbaString);
                String wynikString = decTobin(liczbaInt);
                System.out.println("Twoja liczba w systemie binarnym to: " + wynikString);
                System.out.println("Twoja liczba w systemie dziesiętnym to: " + liczbaString);
                System.out.println("Twoja liczba w systemie szesnastkowym to: " + decTohex(liczbaInt,znaki));
                break;
            case 'h':
                System.out.println("Wybrano System szesnastkowy.");
                checker(LiczbaRzad1,LiczbaRzad0,znaki);
                wynik = hexTodec(liczbaString,znaki);
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
