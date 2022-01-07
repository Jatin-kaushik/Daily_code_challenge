package Generic_Tree;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class pre_post_gtree {

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
                if(stack.size() > 0){
                    stack.peek().children.add(node);
                }
                else root = node;
            }
        }
        return root;
    }

    public static void pre_post_display(Node root){
        System.out.println("Node Pre " + root.data);

        for(Node child: root.children){
            System.out.println("Edge Pre " + root.data + "--" + child.data);
            pre_post_display(child);
            System.out.println("Edge Post " + root.data + "--" + child.data);
        }

        System.out.println("Node Post " + root.data);
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
        pre_post_display(root);
    }
}
