package Generic_Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class Serialize_treetoarray {

    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node(int data){
            this.data = data;
        }
    }

    public static Node construct(int[] arr){
        Node root = null;
        public
        return root;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        scn.close();
        Node root = construct(arr);
        ArrayList<Integer> arr = serialize(root);
        System.out.println(arr);
    }
}
