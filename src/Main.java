import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String nyMvm = "sad";

        System.out.println(nyMvm);

       final int num = 23;
        System.out.println(num);

         String word = "alena";
        System.out.println(word);

        System.out.println();

        System.out.println(word + " " + num);
        System.out.println(nyMvm + " " + num + " " + word);

        if (num < 0  ) {
            System.out.println(num  + "null");
        }
        if (num > 0 ) {
            System.out.println(num + " " + "gou 22 flow");

            Scanner sc = new Scanner(System.in);
            System.out.println("Vedite vawe imya");
            String ph1 = sc.nextLine();

            String ph2 = sc.nextLine();
            String sva = sc.nextLine();
            System.out.println(ph1 + " " + ph2 + " " + sva);

        }


    }


}
