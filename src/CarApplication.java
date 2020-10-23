import java.util.Scanner;

public class CarApplication {
    public static void main(String[] args) {
        int optionSelected;
        Scanner userInput = new Scanner(System.in);

        System.out.println("1. Gas Car\n2. Electric Car");
        optionSelected = userInput.nextInt();

        switch (optionSelected) {
            case 1:
                addGasCar();
                break;
            case 2:
                addElectricCar();
                break;
            default:
                System.out.println("Not a valid option. Exiting.");
        }
    }

    public static void addGasCar() {
        // Setting up variables for object
        String make, model, color, fuelType;
        int year, weight;
        double tankSize, pumpCost;
        Scanner userInput = new Scanner(System.in);

        // Set of do-whiles to prompt and validate for input
        do {
            System.out.println("Enter make of the car: ");
            make = userInput.nextLine();
        } while (make.isBlank());
        do {
            System.out.println("Enter model of the car: ");
            model = userInput.nextLine();
        } while (model.isBlank());
        do {
            System.out.println("Enter color of the car: ");
            color = userInput.nextLine();
        } while (color.isBlank());
        do {
            System.out.println("Enter fuel type of the car: ");
            fuelType = userInput.nextLine();
        } while (fuelType.isBlank());
        do {
            System.out.println("Enter year of car: ");
            year = userInput.nextInt();
        } while (year < 0);
        do {
            System.out.println("Enter weight of the car: ");
            weight = userInput.nextInt();
        } while (weight < 0);
        do {
            System.out.println("Enter tank size of the car: ");
            tankSize = userInput.nextDouble();
        } while (tankSize < 0);
        do {
            System.out.println("Enter pump cost to fill tank: ");
            pumpCost = userInput.nextDouble();
        } while (pumpCost < 0);

        // Adding all info into instantiated object of selected type
        GasCar car = new GasCar(make, model, color, year, weight, pumpCost, tankSize, fuelType);
        System.out.println(car.toString());

        userInput.close();
    }

    public static void addElectricCar() {
        String make, model, color, batteryType;
        int year, weight;
        double batterySize, pumpCost;
        Scanner userInput = new Scanner(System.in);

        do {
            System.out.println("Enter make of the car: ");
            make = userInput.nextLine();
        } while (make.isBlank());
        do {
            System.out.println("Enter model of the car: ");
            model = userInput.nextLine();
        } while (model.isBlank());
        do {
            System.out.println("Enter color of the car: ");
            color = userInput.nextLine();
        } while (color.isBlank());
        do {
            System.out.println("Enter battery type of the car: ");
            batteryType = userInput.nextLine();
        } while (batteryType.isBlank());
        do {
            System.out.println("Enter year of car: ");
            year = userInput.nextInt();
        } while (year < 0);
        do {
            System.out.println("Enter weight of the car: ");
            weight = userInput.nextInt();
        } while (weight < 0);
        do {
            System.out.println("Enter battery size of the car: ");
            batterySize = userInput.nextDouble();
        } while (batterySize < 0);
        do {
            System.out.println("Enter pump cost to fill tank: ");
            pumpCost = userInput.nextDouble();
        } while (pumpCost < 0);

        // Adding all info into instantiated object of selected type
        ElectricCar car = new ElectricCar(make, model, color, year, weight, pumpCost, batterySize, batteryType);
        System.out.println(car.toString());

        userInput.close();
    }
}
