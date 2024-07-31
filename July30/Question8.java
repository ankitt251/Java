package July30;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int firstDigit = n / 10000;
        int secDigit = (n/10) % 10;

        int sum = firstDigit + secDigit;
        System.out.println("Sum: " + sum);
    }

}
