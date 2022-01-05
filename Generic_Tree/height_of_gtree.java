package Generic_Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class height_of_gtree {

    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node(int data){
            this.data = data;
        }
    }

    public static construct


    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        scn.close();
        Node root = construct(arr);
        int res = height_tree(root);
        System.out.println(res);
    }
}
