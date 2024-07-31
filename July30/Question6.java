package July30;

import java.util.Scanner;

public class Question6 {
    public static void ToCelc(double temp){
        double Cel = (temp - 32) * 5/9;
        System.out.println("Temp: "+ Cel);

    }
    public static void main(String[] args) {
        double temp;
        Scanner scan = new Scanner(System.in);
        temp = scan.nextInt();
        ToCelc(temp);
    }
}
