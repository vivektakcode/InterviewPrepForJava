package Classes;

public class StaticBlock {


    //Constructor Chaining
    private int x;
    private final int y;

    public static void main(String[] args) {

StaticBlock sb = new StaticBlock(15);
        int x1 = sb.x;
        System.out.println(x1);
    }

    public StaticBlock(){
    this(15);

    }
    public StaticBlock(int x){
        this(15, 0);
        this.x =x;
    }
public StaticBlock(int x, int y){
        this.x=x;
        this.y=y;
}

    static{


        int a = 10;
        System.out.println(a);
    };
}
