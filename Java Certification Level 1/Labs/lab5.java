import java.util.Scanner;

public class lab5 {
    public static void main(String[] args){
        get_info();
        get_info();
    }
    public static void get_info(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine();

        System.out.println("What is the quantity of your item?");
        int quantity = scanner.nextInt();

        System.out.println("What's the value of your item?");
        float value = scanner.nextFloat();

        System.out.println("What is the tax rate in your area?");
        float tax = scanner.nextFloat();

        print_info(name, quantity, value, tax);
    }

    public static void print_info(String name, int quantity, float value, float taxRate){
        System.out.println("-------------------------------");
        System.out.println("Name: " + name);
        System.out.println("-------------------------------");

        float subtotal = quantity * value;
        System.out.println("Item price: " + value);
        System.out.println("Quantity: " + quantity);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("-------------------------------");

        float grandTotal = subtotal * taxRate;
        System.out.println("Tax rate: " + taxRate);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Grand total: " + grandTotal);
        System.out.println("-------------------------------");

    }
}
