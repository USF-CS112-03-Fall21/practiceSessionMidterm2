package solution;

public class VehicleDriver {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(4, 4);
        // Once you complete class Truck, uncomment the code below to test your class
        Vehicle v2 = new Truck(2, 2, true);
        Truck tr = new Truck(2, 2, false);
        v1.print();
        System.out.println();
        v2.print();
        tr.print();


    }
}
