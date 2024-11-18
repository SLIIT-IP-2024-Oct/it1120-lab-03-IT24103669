import java.util.Scanner;

public class RicePriceCalculatorWithDiscount {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();
        
        System.out.print("Enter the number of kilograms of rice you want to buy: ");
        double kilograms = scanner.nextDouble();
        
        double totalAmount = pricePerKg * kilograms;
        
        
        double discount = totalAmount * 0.10;  // 10% discount
        double amountAfterDiscount = totalAmount - discount;
        
      
        System.out.printf("Total amount before discount: Rs %.2f\n", totalAmount);
        System.out.printf("Discount (10%%): Rs %.2f\n", discount);
        System.out.printf("The total amount to pay after discount: Rs %.2f\n", amountAfterDiscount);
        

        scanner.close();
    }
}
