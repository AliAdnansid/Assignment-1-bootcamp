import java.util.Scanner;

public class Prob6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the base number (positive integer): ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent number (positive integer): ");
        int exponent = scanner.nextInt();

        
        double result = Math.pow(base, exponent);

        
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        
        scanner.close();
    }
}
