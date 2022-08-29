package abstrac;

public class SampleClass extends ProductLocal {
    public static void main(String[] args) {

        SampleClass asds = new SampleClass();
        asds.colorProduct();
    }

    @Override
    void name() {
        System.out.println("Shampoo");
    }

    @Override
    int sellingPrice() {
        return 250;
    }


    private void colorProduct() {
        System.out.println("Red Colour");
    }
}
