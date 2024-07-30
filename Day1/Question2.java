package Day1;
public class Question2 {

    public static void perimeter(int a,int b,int c){
        int perimeter = a + b+ c;
        System.out.println("Perimeter is: "+perimeter);
    }
    public static void main(String args[]){
        perimeter(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
    }
}
