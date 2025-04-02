import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestVehicle {
    @Test
    void testCalculationCostWithoutDiscount(){
        Vehicle vehicle = new Vehicle("BYD", 200.0);
        assertEquals(600, vehicle.calculateCost(3), 0.01);
    }
    @Test
    void testCalculationCostWithDiscount(){
        Vehicle vehicle = new Vehicle("BYD", 200.0);
        assertEquals(140, vehicle.calculateCost(7), 0.01);
    }
    @Test
    void testCalculateCostZeroDays(){
        Vehicle vehicle = new Vehicle("BYD", 200.0);
        assertEquals(0.0, vehicle.calculateCost(0), 0.01);
    }

    @Test
    void testNegativeDailyValue(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Vehicle("BYD", -150.0);
        });
        assertEquals("The daily value can not be negative.", exception.getMessage());
    }

    @Test
    void testNegativeDays(){
        Vehicle vehicle = new Vehicle("SUV", 200.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            vehicle.calculateCost(-1);
        });
        assertEquals("The number of days can not be negative.", exception.getMessage());
    }
}
