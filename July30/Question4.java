package July30;
import java.util.Scanner;



public class Question4 {
    public static void avg(int a,int b,int c){
        int total_marks = a + b +c;
        int percentage = (total_marks)/ 3;
        System.out.println(percentage);
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
    
        avg(a,b,c);
    }
}
