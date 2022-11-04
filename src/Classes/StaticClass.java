package Classes;

public class StaticClass {


    private static String str ="Static variable check";

    public static class DemoStatic{
        public void showStatic(){

           str=str.substring(1, 4);
            System.out.println(str);
        }

    }

    public static void main(String[] args) {
        StaticClass.DemoStatic sc = new StaticClass.DemoStatic();
        sc.showStatic();
    }

}
