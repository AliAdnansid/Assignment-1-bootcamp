import java.util.Scanner;
public class Prob9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the amount to be withdrawn (in hundreds): ");
        int amount = scanner.nextInt();

       
        int notesOf100 = amount / 100;
        amount = amount % 100;

        int notesOf50 = amount / 50;
        amount = amount % 50;

        int notesOf10 = amount / 10;
        amount = amount % 10;

        
        System.out.println("The cashier will give:");
        System.out.println("100 notes: " + notesOf100);
        System.out.println("50 notes: " + notesOf50);
        System.out.println("10 notes: " + notesOf10);

        
        scanner.close();
    }
}
