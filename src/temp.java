public class temp {
    public static void main (String[] args){
        int bitCheck = 5;

        int tmp = 3;

        System.out.println(bitCheck & (1 << tmp--));
        System.out.println(bitCheck & (1 << tmp--));
        System.out.println(bitCheck & (1 << tmp--));
        System.out.println(bitCheck & (1 << tmp--));


        java.util.Scanner scane = new java.util.Scanner(System.in);
//        int wrt = scan.nextInt();
//        System.out.println("wrt: "+wrt);
//        while (wrt > 0){
//            wrt = scan.nextInt();
//            System.out.println("wrt: "+wrt);
        int wrt;
        while((wrt = scane.nextInt()) > 0){
            System.out.println("wrt: "+wrt);
        }

    }
}
