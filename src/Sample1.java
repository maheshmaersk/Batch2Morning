import java.util.Scanner;

public class Sample1 {
    public static void main(String[] args) {

        Scanner abs = new Scanner(System.in);
        System.out.println("Enter the Principle Amount");
        double pa = abs.nextDouble();
        System.out.println("Enter the Time in Months");
        int masd = abs.nextInt();
        System.out.println("Enter the Interest Rate");
        float asdsa = abs.nextFloat();

        Sample1 obj = new Sample1();
        obj.calculateROI(pa, masd, asdsa);
    }

    void calculateROI(double pa, int timeInMonths, float interestRate) {
        int opValue = (int) ((pa * timeInMonths * interestRate) / 100);
        System.out.println("Rate of Interst is " + opValue);
    }

}
