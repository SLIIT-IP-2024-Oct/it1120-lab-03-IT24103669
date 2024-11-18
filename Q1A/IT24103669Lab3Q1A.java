import java.util.Scanner;

public class IT24103669Lab3Q1A {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();
        
        
        System.out.print("Enter the number of kilograms of rice you want to buy: ");
        double kilograms = scanner.nextDouble();
        
        
        double totalAmount = pricePerKg * kilograms;
        
        
        System.out.printf("The total amount to pay for %.2f kilograms of rice is: Rs %.2f\n", kilograms, totalAmount);
        
        
        scanner.close();
    }
}
