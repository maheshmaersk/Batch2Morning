package abstrac;

public class GroundNutsMore extends ProductLocal {
    @Override
    void name() {
        System.out.println("Ground Nut More Shopping mall");
    }

    @Override
    int sellingPrice() {
        return 50;
    }

    public static void main(String[] args) {
        GroundNutsMore asdsa = new GroundNutsMore();

        asdsa.name();
        int sad = asdsa.sellingPrice();
        System.out.println(sad);

    }
}
