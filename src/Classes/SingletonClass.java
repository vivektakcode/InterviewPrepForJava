package Classes;

public class SingletonClass {
    /*
    * Create a singleton class.
    * Declare a private variable
    * Declare a static instance variable of a class
    *
    * Declare a private constructor which throws exception
    * Declare getters and setters for the static instance variable and try if the instance is null then create new instance using the constructor
    * return the instance variable if it's not null
    *
    * create getters and setters for the private variable
    *
    * */


    private int object;
    private static SingletonClass instance = null;
    private SingletonClass() throws Exception{
        this.object = object;
    }

    public static SingletonClass getInstance(){
        if(instance==null){
            try{
                instance = new SingletonClass();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return instance;
    }

    public int getObject() {
        return object;
    }

    public void setObject(int object) {
        this.object = object;
    }
}
