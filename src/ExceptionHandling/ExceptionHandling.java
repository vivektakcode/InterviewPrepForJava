package ExceptionHandling;

public class ExceptionHandling {

    public static void main(String[] args) {
        System.out.println("In main method");
        ExceptionHandling ex = new ExceptionHandling();
        ex.a();

    }

    public void a() {
        System.out.println("In a method");
        try{
            b();
        }
        catch(Exception e){
            System.out.println("Exception handled");
        }
    }
    public void b() {
        System.out.println("In b method");
        throw new RuntimeException();
    }
}
