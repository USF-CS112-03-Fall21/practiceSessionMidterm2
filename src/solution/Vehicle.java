package solution;

/**
 * Super class of class Truck.
 */
public class Vehicle 		{
    private int doors;
    private int seats;

    public Vehicle(int doors, int seats) {
        this.doors = doors;
        this.seats = seats;
    }

    public void print() {
        System.out.print(doors + " " + seats);
    }

}

