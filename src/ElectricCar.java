public class ElectricCar extends Car{
    // Instance variables
    protected double batterySize;
    protected String batteryType;

    // Default constructor, calls parent default constructor
    public ElectricCar() {
        super();
        setBatterySize(0);
        setBatteryType("");
    }

    // Overloaded constructor
    public ElectricCar(String make, String model, String color, int year, int weight, double batterySize, String batteryType) {
        super(make, model, color, year, weight);
        setBatterySize(batterySize);
        setBatteryType(batteryType);
    }

    public double getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(double batterySize) {
        if (batterySize > 0) {
            this.batterySize = batterySize;
        }
        else {
            this.batterySize = 4.0;
        }
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        if (!batteryType.equals("")) {
            this.batteryType = batteryType;
        }
        else {
            this.batteryType = "Lithium-ion";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nBattery Size: " + getBatterySize() + "\nBattery Type: " + getBatteryType();
    }

    @Override
    public double CalcCostPerFill(double pumpCost) {
        return batterySize * pumpCost;
    }
}
