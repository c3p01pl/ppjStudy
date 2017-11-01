import java.util.Scanner;

public class exerciseX{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj typ liczby (b - binarny, d - dziesietny, h - szesnastkowy): ");
        char typ = in.next().charAt(0);



        switch (typ) {
            case 'b':
                System.out.println("Wybrano System Binarny.");
                char rzad1 = inputCharToProram("rzad1");
                char rzad0 = inputCharToProram("rzad0");

                if (checkIfCharsBelongToNumericalSystem(rzad1,rzad0,'1')){

                    int wynikDz = convertToDecimal(rzad1,rzad0,2);

                    System.out.println("Twoja liczba w systemie binarnym to: " + rzad1 + rzad0);
                    System.out.println("Twoja liczba w systemie dziesiętnym to: " + wynikDz);
                    System.out.println("Twoja liczba w systemie szesnastkowym to: " + wynikDz);
                }
                break;
            case 'd':
                System.out.println("Wybrano System Dziesiętny.");
                rzad1 = inputCharToProram("rzad1");
                rzad0 = inputCharToProram("rzad0");

                if (checkIfCharsBelongToNumericalSystem(rzad1,rzad0,'9')){

                    String liczbaString = Character.toString(rzad1) + Character.toString(rzad0);
                    int wartDec = Integer.parseInt(liczbaString);

                    String wynikBin = convertDecimalToHexOrBin(wartDec,2);
                    String wynikHex = convertDecimalToHexOrBin(wartDec,16);

                    System.out.println("Twoja liczba w systemie binarnym to: " + wynikBin);
                    System.out.println("Twoja liczba w systemie dziesiętnym to: " + rzad1 + rzad0);
                    System.out.println("Twoja liczba w systemie szesnastkowym to: " + wynikHex);
                }
                break;
            case 'h':
                System.out.println("Wybrano System szesnastkowy.");
                rzad1 = inputCharToProram("rzad1");
                rzad0 = inputCharToProram("rzad0");

                if (checkIfCharsBelongToNumericalSystem(rzad1,rzad0,'F')){

                    int wynikDz = convertToDecimal(rzad1,rzad0,16);
                    String wynikBin = convertDecimalToHexOrBin(wynikDz,2);

                    System.out.println("Twoja liczba w systemie binarnym to: " + wynikBin);
                    System.out.println("Twoja liczba w systemie dziesiętnym to: " + wynikDz);
                    System.out.println("Twoja liczba w systemie szesnastkowym to: " + rzad1 + rzad0);
                }
                break;
            default:
                System.out.println("ERROR");
                System.exit(1);


        }
    }


    public static boolean checkIfCharsBelongToNumericalSystem(char rz1, char rz0, char lastChar){

            boolean ok = false;

            if (!(rz1 > lastChar | rz0 > lastChar)) {
                ok = true;
            }
            else {System.out.println("Wprowadzono złe dane.");}

            return ok;
    }

    public static int convertToDecimal(char rzad1, char rzad0, int system){
        String strliczba1 = Character.toString(rzad1);
        String strliczba0 = Character.toString(rzad0);
        int liczba0;
        int liczba1;

        if (system == 16){
            String digits = "0123456789ABCDEF";
            liczba0  = digits.indexOf(strliczba0);
            liczba1  = digits.indexOf(strliczba1);
        }
        else{
            liczba1 = Integer.parseInt(strliczba1);
            liczba0 = Integer.parseInt(strliczba0);
        }
        int wynik = liczba0+system*liczba1;
        return wynik;
    }

    public static String convertDecimalToHexOrBin(int wartDec, int system){
        String wartHex = "";
        String[] HexStr = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        while(wartDec>0)
        {
            int reszta=wartDec%system;
            wartHex=HexStr[reszta]+ wartHex;
            wartDec=wartDec/system;
        }
        return wartHex;
    }

    public static char inputCharToProram(String s){

        Scanner in = new Scanner(System.in);

        System.out.print("Podaj " + s + " :");
        char rzad = in.next().charAt(0);
        rzad = Character.toUpperCase(rzad);

        return rzad;

    }
}
