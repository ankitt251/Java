package Aug1.Exception;

class Custom extends Exception {
    private String errmsg;

    Custom(String er){
        this.errmsg = er;
    }

    @Override
    public String getMessage() {
        return errmsg;
    }
    
}

public class Que1n2 {
    public static void main(String[] args) {
        try{
            System.out.println("Starting try block");
            System.out.println("Ending Try Block");
            throw new Custom("Entering Catch Message");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
