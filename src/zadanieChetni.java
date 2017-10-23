public class zadanieChetni {
    public static void main(String [] args){
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Podaj char b lub d lub h:");
        char typ = in.next().charAt(0);
        switch (typ) {
            case 'b':
                System.out.println("binary"); break;
            case 'd':
                System.out.println("decimal"); break;
            case 'h':
                System.out.println("hexadecimal"); break;
            default:
                System.out.println("ERROR"); break;
        }
        char rzad1,rzad0;
        System.out.print("Podaj rzad1, rzad0: ");
        rzad1 = in.next().charAt(0);
        rzad0 = in.next().charAt(0);
        char[] znaki = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','a','b','c','d','e','f'};
        System.out.println(znaki[15]);
        switch (typ){
            case 'b':
                if ( (rzad1 == '0' |  rzad1 == '1') & (rzad0 == '1') | (rzad0 == '0') ) {
                System.out.println("jest ok");
                }
                else { System.out.println("Wprowadzono zle dane"); }
                break;
            case 'd':
                for (int i=10; i<16; i++){
                    if (rzad1 == znaki[i] | rzad0 == znaki[i]){
                        System.out.println("Wprowadzono zle dane");
                    }
                }
                break;
            case 'h':
                boolean f0 = false;
                boolean f1 = false;
                for (int i=0; i<16; i++) {
                    if (rzad1 == znaki[i]) {
                        f0 = true;
                    }
                }
                if (f0){
                    for (int i=0; i<16; i++) {
                        if (rzad0 == znaki[i]) {
                            f1 = true;
                        }
                    }
                    if (f1 == false){
                        System.out.println("Wprowdzono zle dane r1");

                    }
                }
                    else { System.out.println("Wprowdzono zle dane r0"); }
                break;

        }
    }
}
