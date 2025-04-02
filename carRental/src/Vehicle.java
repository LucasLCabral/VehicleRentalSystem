
public class Vehicle {
    String model;
    double dailyValue;

    public Vehicle(String model, double dailyValue ) {
        if (dailyValue < 0) {
            throw new IllegalArgumentException("The daily value can not be negative.");
        }
        this.model = model;
        this.dailyValue = dailyValue;
    }

    public double calculateCost(int days) {
        if (days < 0) {
            throw new IllegalArgumentException("The number of days can not be negative.");
        }
        if (days >= 7) {
            return (dailyValue * days) * 0.10;
        }
        return dailyValue * days;
    }

    public static void main(String[] args) {
        Vehicle car =  new Vehicle("Corolla", 150);
        System.out.println("Cost for 5 days: $" + car.calculateCost(5));
        System.out.println("Cost for 7 days: $" + car.calculateCost(7));
    }
}

