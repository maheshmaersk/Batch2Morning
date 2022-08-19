package inherit;

public class Car extends Vehicle {

    public static void main(String[] args) {
        Vehicle ons = new Car();
//        Vehicle ons = new Vehicle();
        ons.tyres();
//        ons.staring();
        ons.engine();
        String sds = ons.honk();
        System.out.println("Car honk is " + sds);

    }


    void staring() {
        System.out.println("Car Staring");
    }

    void gears() {
        System.out.println("Gears");
    }

    void honk(int a) {
        System.out.println("medium Nosie");
    }


    public void engine() {
        System.out.println("Car Engine");
    }
}
