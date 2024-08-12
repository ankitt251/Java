package Aug3Practice;

class E1 {
    private String name;
    private int age;

    public String getName() {
       return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        E1 en = new E1();
        en.setName("Ankit");
        en.setAge(22);
        System.out.println("Name: "+ en.getName() + "Age: "+ en.getAge());
    }
}
