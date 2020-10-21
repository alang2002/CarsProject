public class GasCar extends Car{
    // Instance variables
    protected double tankSize;
    protected String fuelType;

    // Default constructor using default parent constructor
    public GasCar() {
        super();
        setTankSize(0);
        setFuelType("");
    }

    // Overloaded constructor
    public GasCar(String make, String model, String color, int year, int weight, double tankSize, String fuelType) {
        super(make, model, color, year, weight);
        setTankSize(tankSize);
        setFuelType(fuelType);
    }

    public double getTankSize() {
        return tankSize;
    }

    public void setTankSize(double tankSize) {
        if (tankSize > 0) {
            this.tankSize = tankSize;
        }
        else {
            this.tankSize = 4.0;
        }
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        if (!fuelType.equals("")) {
            this.fuelType = fuelType;
        }
        else {
            this.fuelType = "Unleaded";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nTank Size: " + getTankSize() + "\nFuel Type: " + getFuelType();
    }

    @Override
    public double CalcCostPerFill(double pumpCost) {
        return tankSize * pumpCost;
    }
}
