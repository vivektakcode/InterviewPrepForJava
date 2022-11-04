package CollectionsFramework;

import java.util.ArrayList;


//Code for implementing the custom ArrayList where duplicates are not allowed
public class CustomArrayList extends ArrayList {
    @Override
    public boolean add(Object o){
        if(this.contains(o)){
            return true;
        }else{
        return super.add(o);
    }
    }

    public static void main(String[] args) {
        CustomArrayList list= new CustomArrayList();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);

        int a =-10;
        a= a>>>1;

        System.out.println(a);

    }
}
