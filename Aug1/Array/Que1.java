package Aug1.Array;

import java.util.Scanner;

public class Que1 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Array: "+ arr[i]);
        }
    }
}
