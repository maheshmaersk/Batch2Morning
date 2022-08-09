import java.util.Scanner;

public class FindEvenOrOdd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean isEnabled = true;
        while (isEnabled) {
            System.out.println("Enter the Number");

            int sdf = scan.nextInt();
            if (sdf % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }
            System.out.println("Do you want to continue y/yes n/no");
            String sdd = scan.next();
            if (sdd.equalsIgnoreCase("y")) {
                System.out.println("Will Continue");
            }else if (sdd.equalsIgnoreCase("n")) {
               isEnabled= false;
                System.out.println("Exiting");
            } else {
                System.out.println("Retry");
            }
        }


//        for (int i = 0; i < 10; i++) {
//            System.out.println("Hello "+i);
//        }
//        for (int i = 0; i < 30; i++) {
//            if (i % 2 != 0) {
//                System.out.println("Hello " + i);
//            }
//        }
//
//        for (int i = 10; i > 0; i--) {
//            System.out.println("World " + i);
//        }

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

    }
}
