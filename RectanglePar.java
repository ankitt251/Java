public class RectanglePar {
    public static void area(int l,int w){
        int area = l * w;
        System.out.println(area);
    }
    public static void perimeter(int l,int w){
        int area = 2 * (l + w);
        System.out.println(area);
    }
    public static void main(String[] args){
        area(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        perimeter(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
    }
}
