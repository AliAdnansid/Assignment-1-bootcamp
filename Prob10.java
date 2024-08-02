import java.util.Scanner;

public class Prob10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the total selling price of 15 items: ");
        double totalSellingPrice = scanner.nextDouble();

        
        double totalCostPrice = totalSellingPrice / 1.2;

        
        double costPricePerItem = totalCostPrice / 15;

        
        System.out.println("The cost price of one item is: " + costPricePerItem);

        
        scanner.close();
    }
}
