package July30;

public class Question7 {
    public static void main(String[] args) {
        int total_students = 90;
        int percentageA = 50;
        int boys = 45;
        int boysA = 20;
        int totalA = (percentageA * total_students) / 100;
        int girlA = totalA - boysA;
        System.out.println("Girls A: " + girlA);
    }
}   
