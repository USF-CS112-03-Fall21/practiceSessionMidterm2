package solution;

/**
 * Consider classes Vehicle and Truck.
 * Fill in code in class Truck so that:

  - it is a child class of Vehicle,
  - calls constructor of the parent from its own constructor and
  - overrides the print method to print the number of doors, the number of seats and whether it's a pickup truck or not.

 You may use VehicleDriver class to test your code.
 */
public class Truck extends Vehicle {
    private boolean isPickup;

    public Truck(int doors, int seats, boolean isPickup) {
        super(doors, seats);
        this.isPickup = isPickup;
    }

    @Override
    public void print() {
        super.print();
        System.out.println( " " + isPickup);
    }


}
