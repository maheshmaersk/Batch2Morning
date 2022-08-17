package modifiers;

import java.util.Scanner;

public class FindDay {
    public static void main(String[] args) {
        Scanner dss = new Scanner(System.in);
        boolean isFsd = true;
        while (isFsd) {
            System.out.println("Enter the Number");
            int num = dss.nextInt();

            FindDay obj = new FindDay();
            String day = obj.getDay(num);
            System.out.println("Entered day is " + day);
            System.out.println("Do you want to Continue y/n");
            String asdsa = dss.next();
            if(asdsa.equalsIgnoreCase("Y")){

            } else if (asdsa.equalsIgnoreCase("n")) {
                isFsd = false;
            }else{

            }
        }

    }


    String getDay(int dayOfMonth) {
        return switch (dayOfMonth) {
            case 1, 8, 15, 22, 29 -> "Monday";
            case 2, 9, 16, 23, 30 -> "Tuesday";
            case 3, 10, 17, 24, 31 -> "Wednesday";
            case 4, 11, 18, 25 -> "Thursday";
            case 5, 12, 19, 26 -> "Friday";
            case 6, 13, 20, 27 -> "Saturday";
            case 7, 14, 21, 28 -> "Sunday";
            default -> "Invalid Day";
        };
    }
}
