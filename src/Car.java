/**
 * Car class is to be used as parent/base class for other car classes (GasCar and ElectricCar).
 * Those classes will extend or inherit from the Car class.
 * Therefore the parent class is abstract so it can't be instantiated and only inherited.
 * Uses instance variables for basic info of objects, then there are specific values inside specific classes.
 * There are also constructors, both default and overloaded, as well as an overridden toString method.
 * Abstract method CalcCostPerFill that all classes must implement.
 */
public abstract class Car {
    // Instance variables
    protected String make, model, color;
    protected int year, weight;

    // Default constructor
    public Car() {

    }

    // Overloaded constructor
    public Car(String make, String model, String color, int year, int weight) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.weight = weight;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (!make.equals("")) {
            this.make = make;
        }
        else {
            this.make = "Default";
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (!model.equals("")) {
            this.model = model;
        }
        else {
            this.model = "Default";
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!color.equals("")) {
            this.color = color;
        }
        else {
            this.color = "Default";
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        }
        else {
            this.year = 1;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
        else {
            this.weight = 2000;
        }
    }
}
