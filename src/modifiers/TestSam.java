package modifiers;

import java.util.Scanner;

public class TestSam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day");
        String dag = scanner.next();
//        if (dag.equalsIgnoreCase("Monday")) {
//            System.out.println("Working ");
//        } else if (dag.equalsIgnoreCase("Tuesday")) {
//            System.out.println("Yoga");
//        } else if (dag.equalsIgnoreCase("Wednesday")) {
//            System.out.println("Gym");
//        } else if (dag.equalsIgnoreCase("Thursday")) {
//            System.out.println("Temple Zones");
//        } else if (dag.equalsIgnoreCase("Friday")) {
//            System.out.println("Night Club");
//        } else if (dag.equalsIgnoreCase("Saturday") || dag.equalsIgnoreCase("Sunday")) {
//            System.out.println("Weekend Starts");
//        } else {
//            System.out.println("Invalids Day");
//        }

        switch (dag) {
            case "Monday":
                System.out.println("Working ");
                break;
            case "Tuesday":
                System.out.println("Yoga");
                break;
            case "Wednesday":
                System.out.println("Gym");
                break;
            case "Thursday":
                System.out.println("Temple Zones");
                break;
            case "Friday":
                System.out.println("Night Club");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend Starts");
                break;
            default:
                System.out.println("Invalids Day");

        }

    }
}
