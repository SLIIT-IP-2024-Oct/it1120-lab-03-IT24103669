import java.util.Scanner;

public class IT24103669Lab3Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the monthly salary: ");
        double monthlySalary = scanner.nextDouble();
        System.out.print("Enter the number of OT hours worked: ");
        double otHours = scanner.nextDouble();

        
        System.out.print("Enter the OT hourly rate: ");
        double otHourlyRate = scanner.nextDouble();
        double otAmount = otHours * otHourlyRate;


        double totalSalary = monthlySalary + otAmount;
        System.out.printf("Monthly Salary: Rs %.2f\n", monthlySalary);
        System.out.printf("OT Amount: Rs %.2f\n", otAmount);
        System.out.printf("Total Salary (including OT): Rs %.2f\n", totalSalary);


        scanner.close();
    }
}
