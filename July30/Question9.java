package July30;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a 3-digit number: ");
        int n = scan.nextInt();
        
        // Check if the number is a 3-digit number
        if (n < 100 || n > 999) {
            System.out.println("Please enter a valid 3-digit number.");
            return;
        }
        
        int sum = 0;
        while (n > 0) {
            int digit = n % 10; // Extract the last digit
            sum += digit;      // Add the digit to the sum
            n /= 10;           // Remove the last digit
        }
        
        System.out.println("Sum of the digits: " + sum);
    }
}
