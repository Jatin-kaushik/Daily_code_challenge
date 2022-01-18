package Binary_tree;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Stack;

public class size_sum_max_heightofbtree {

    public static class Node{
        int data;
        Node left;
        Node right;
    }
    public static class Pair{
        Node node;
        int state;
    }
    public static Node construct(Integer []){
        Node root = new Node();
        root.data = arr[0];
        Stack<Pair> stack = new Stack<>();
        Pair p = new Pair();
        p.node = root;
        p.state = 1;
        stack.push(p);
        while(stack.size()>0){
             
        }
        int idx  = 1;
        sta
        return root;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in);
        Integer n = Integer.parseInt(br.readLine());
        String[] values = br.readLine().split(" ");
        Integer[] arr = new Integer[n];
        for(int i =0; i<n; i++){
            if(values[i] != "n"){
                arr[i] = Integer.parseInt(values[i]);
            }
            else{
                arr[i] = null;
            }
        }
        Node root = construct(arr);
    }
}
