package Aug1.Exception;

public class Que3 {
public static void main(String[] args) {
    
    try {
        System.out.println("Starting try block");
        System.out.println("Ending Try Block");
        throw new ArrayIndexOutOfBoundsException("Starting catch block");
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e.getMessage());
    }
}
}
