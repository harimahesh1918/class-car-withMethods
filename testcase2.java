public class Car {
    // Attributes
    String model;
    String color;

    // Constructor
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // Method to start the car
    public void start() {
        System.out.println("Car started");
    }

    // Method to stop the car
    public void stop() {
        System.out.println("Car stopped");
    }

    public static void main(String[] args) {
        // Test Cases

        // TC1
        Car car1 = new Car("Tesla", "Red");
        car1.start(); // Output: Car started

        // TC2
        Car car2 = new Car("BMW", "Black");
        car2.start(); // Output: Car started

        // TC3
        Car car3 = new Car("", "Blue");
        car3.start(); // Output: Car started (model empty)

        // TC4
        Car car4 = new Car("Audi", "White");
        // No start() called → No output

        // TC5
        Car car5 = new Car("Honda", "Grey");
        car5.stop(); // Output: Car stopped
    }
}
