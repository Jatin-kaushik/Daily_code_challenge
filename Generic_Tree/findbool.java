package Generic_Tree;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class findbool {

    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
        
        public Node(int data){
            this.data = data;
        }
    }

    public static Node construct(int[] arr){
        Node root = null;
        Stack<Node> stack = new Stack<>();
        for(int val : arr){
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

    public static Boolean findintree(Node root,  int data){
        if (root.data == data){
            return true;
        }
        for(Node child : root.children){
            boolean fic = findintree(child, data);
            if (fic == true){
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i <n; i++){
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        scn.close();
        Node root = construct(arr);
        Boolean res = findintree(root, data);
        System.out.println(res);
    }
}
