package July30;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a 3-digit number
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        // Check if the number is a 3-digit number
        if (number < 100 || number > 999) {
            System.out.println("Please enter a valid 3-digit number.");
            return;
        }

        // Reverse the number
        int reversedNumber = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit
            temp /= 10; // Remove the last digit
        }

        // Output the reversed number
        System.out.println("Reversed number: " + reversedNumber);
    }
}
