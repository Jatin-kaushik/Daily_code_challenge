package Generic_Tree;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class height_of_gtree {

    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node(int data){
            this.data = data;
        }
    }

    public static Node construct(int [] arr){
        Node root = null;
        Stack<Node> stack = new Stack<>();
        for(int val: arr){
            if (val != -1){
                stack.push(new Node(val));
            }
            else{
                Node node = stack.pop();
                if(stack.size()>0){
                    stack.peek().children.add(node);
                }
                else root = node;
            }
        }
        return root;
    }

    public static int height_tree(Node root){
        int res = -1;

        return res;
    }


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
