import static org.junit.jupiter.api.Assertions.*;

class GasCarTest {

    @org.junit.jupiter.api.Test
    void calcCostPerFillTest() {
        // instantiated GasCar object to test with
        GasCar gasCarTest = new GasCar("Toyota", "Cambry", "Blue", 2005, 2100, 2.95, 12, "Unleaded");

        // assert statement
        assertEquals(35.400000000000006, gasCarTest.CalcCostPerFill(gasCarTest.getPumpCost()));
    }
}