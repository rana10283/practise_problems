public class Car {

    private String owner;
    private String brand;
    private String serialNumber;
    private double fuel; 
    private boolean isRunning;

    public Car(String owner, String brand, String serialNumber, double fuel) {
        this.owner = owner;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuel = fuel;
        this.isRunning = false;
    }

    public void start() {
        if (fuel > 0) {
            isRunning = true;
            System.out.println("Car started.");
        } else {
            System.out.println("Cannot start. No fuel.");
        }
    }

    public void stop() {
        isRunning = false;
        System.out.println("Car stopped.");
    }

    public void checkFuel() {
        System.out.println("Fuel available: " + fuel + " liters");
    }

    public void drive(double distance) {
        if (isRunning) {
            double fuelNeeded = distance * 0.1;

            if (fuel >= fuelNeeded) {
                fuel -= fuelNeeded;
                System.out.println("Car drove " + distance + " km.");
            } else {
                System.out.println("Not enough fuel to drive.");
            }
        } else {
            System.out.println("Start the car first.");
        }
    }

    public void displayInfo() {
        System.out.println("Owner: " + owner);
        System.out.println("Brand: " + brand);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Fuel: " + fuel);
        System.out.println("Running: " + isRunning);
    }

    public static void main(String[] args) {

        Car car1 = new Car("Rana", "Toyota", "SN12345", 20);

        car1.displayInfo();
        car1.start();
        car1.drive(50);
        car1.checkFuel();
        car1.stop();
    }
}