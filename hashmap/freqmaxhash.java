package hashmap;

import java.util.*;

public class freqmaxhash {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i =0; i< str.length(); i++){
            char ch = str.charAt(i);
            if (hmap.containsKey(ch) == false){
                hmap.put(ch, 1);
            } else{
                int of = hmap.get(ch);
                int nf = of+1;
                hmap.put(ch, nf);
            }
        }
        char mfch = str.charAt(0);
        // for (int i = 1; i< str.length(); i++){ //o(n) + o(n)
        //     if (hmap.get(mfch) < hmap.get(str.charAt(i))){
        //         mfch = str.charAt(i);

        //     }
        // }
        Set<Character> hset = hmap.keySet();
        for (char ch : hset){
            if (hmap.get(ch) > hmap.get(mfch)){
                mfch = ch;}
        }
        System.out.println(mfch);
    }
}
