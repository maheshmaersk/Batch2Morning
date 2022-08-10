import java.util.Scanner;

public class Calcul {
    public static void main(String[] args) {

        Scanner dsdfs = new Scanner(System.in);
        System.out.println("Which operation you want to perform a for addition,m for mul, d for div,s for sub");

        String asdsa = dsdfs.next();

        if(asdsa.equalsIgnoreCase("A")){
            System.out.println("Selected is Addition");
        }else if(asdsa.equalsIgnoreCase("d")){
            System.out.println("Selected is Division");
        }else if(asdsa.equalsIgnoreCase("m")){
            System.out.println("Selected is Multiplication");
        }else if(asdsa.equalsIgnoreCase("s")){
            System.out.println("Selected is Substraction");
        }else{
            System.out.println("Invalid Selection");
        }

//        Calcul ond = new Calcul();
//        ond.addTwoNumbers(39, 44);
//        ond.addTwoNumbers(44, 77);
//
//        int op1 = ond.subTwoNumbers(44,22);
//        float op13 = ond.mulTwoNumbers(op1,22);
//        double asa = ond.divTwoNumbers(op1,op13);
//        System.out.println("Subtracted Value is "+ op1);
//        System.out.println("Multiply Value is "+ op13);
//        System.out.println("Divi Value is "+ asa);

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

    }

    private void addTwoNumbers(int n1, int n2) {
        System.out.println("Added Values are " + (n1 + n2));
    }

    private int subTwoNumbers(int n1, int n2) {
        return n1-n2;
    }

    private float mulTwoNumbers(int n1, int n2) {

        return n1*n2;
    }

    private double divTwoNumbers(int n1, float n2) {
        return n1/n2;
    }


}
