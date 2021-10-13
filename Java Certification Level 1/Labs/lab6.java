import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {
        // 100 is the special return code that ends the program.
        // This loop repeatedly calls the getHeight function until it return the special exit code: 100.
        while(getHeight() != 100){
            getHeight();
        }
    }

    public static int getHeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your height (inches): ");
        int height = scanner.nextInt();
        // 0 is an exception that exits the program.
        if (height == 0) {
            System.out.println("Goodbye!");
            return 100;
        }
        if (height < 60) {
            System.out.println("You are too short.");
            return 1;
        } else if (height > 78) {
            System.out.println("You are too tall.");
            return 2;
        } else {
            System.out.println("You can safely ride this roller coaster");
            return 0;
        }
    }
}
