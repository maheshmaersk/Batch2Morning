public class UmaSample {

    public static void main(String[] args) {
        System.out.println("Harsha");
        UmaSample obj = new UmaSample();
        obj.add(34, 53, 44);
        obj.div(34, 53);
        int abc = obj.ssedas(55,34);
        int asds= obj.mul(34, 53);
        System.out.println("Hello your balance is "+asds*abc);
    }


    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void div(int a, int b) {
        System.out.println(a / b);
    }


    int mul (int a, int b) {
       return  a*b;
    }

    int ssedas (int a, int b) {
       return  a-b;
    }
}
