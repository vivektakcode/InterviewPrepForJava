package OOPS.poly;

public class Polymorphism {


    //Static polymorphism- compile time/early binding


    public void run(int kms){
        System.out.println("Running..."+kms);
    }

    public void run(){
        System.out.println("Running..");
    }




}

class DynamicPolymorphism extends Polymorphism{
    @Override
    public void run() {

        System.out.println("Running is good for health");
    }
}
