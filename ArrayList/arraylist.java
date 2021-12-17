package ArrayList;

import java.util.ArrayList;

public class arraylist {
    public static void main(String [] args){
        ArrayList<Integer> al = new ArrayList<>();
        
        //add or append
        al.add(10);
        al.add(20);
        al.add(30);

        // delete
        al.remove(0);

        // get
        al.get(0);

        //sel
        al.set(1, 200);

        // insert
        al.add(0, 50);

        //size;
        al.size();

        //loop
        for(int i = 0; i <al.size(); i++){
            System.out.println(al.get(i));
        }

        for(int val : al){
            System.out.println(val);
        }
    }
}
