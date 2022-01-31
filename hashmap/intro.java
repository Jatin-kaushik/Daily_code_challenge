package hashmap;

import java.util.*;

public class intro {

    public static void main(String[] args){
        HashMap<String, Integer> pmap = new HashMap<>(); // initialize

        // add element
        pmap.put("India", 130);
        pmap.put("China", 150);
        pmap.put("Pakistan", 30);
        pmap.put("America", 50);
        System.out.println(pmap);

        // update
        pmap.put("India", 131);
        System.out.println(pmap);

        Integer ipop = pmap.get("India");
        System.out.println("india population :" + ipop);

        System.out.println("Contain keys : " + pmap.containsKey("India"));

        Set<String> keys = pmap.keySet();
        for(String key : keys){
            System.out.println(key);
            System.out.println(pmap.get(key));
        }

    }



}
