package encap;

public class EncapSample {


    public static void main(String[] args) {


        Clothes onj = new Clothes();
        onj.name = "Puma Brand";
        onj.cost=4000;
        onj.type = "Mens Ware";
        onj.fabricType = "Cotton";


        Product sadsa = new Product();
        sadsa.setBarcode("");
        System.out.println(onj.name);
    }
}
