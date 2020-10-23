import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectricCarTest {

    @Test
    void calcCostPerFillTest() {
        // instantiated ElectricCar object for testing
        ElectricCar electricCarTest = new ElectricCar("Nissan", "Leaf", "Dark Blue", 2020,
                2100, 1.67, 100, "Lithium-ion");

        // assert statement
        assertEquals(167, electricCarTest.CalcCostPerFill(electricCarTest.getPumpCost()));
    }
}