import java.util.Scanner;
public class Calculator{

	public static void calc(int a,int b,String op) {
		switch(op) {
		case "+": 
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a-b);
			break;
		case "/":
			System.out.println(a-b);
			break;
		default:
			System.out.println("Invalid Input");
			break;
	}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String op = scan.next();
		int b = scan.nextInt();
		
		calc(a,b,op);

}
}