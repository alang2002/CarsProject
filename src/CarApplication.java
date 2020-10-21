import java.util.Scanner;

public class CarApplication {
    public static void main(String[] args) {
        int optionSelected;
        Scanner userInput = new Scanner(System.in);

        System.out.println("1. Gas Car\n2. Electric Car");
        optionSelected = userInput.nextInt();
    }
}
