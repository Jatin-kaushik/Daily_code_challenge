package Generic_Tree;

import java.util.*;

public class generic_treepep {
    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
        Node(int data){
            this.data = data;
        }
    }

    public static Node construct(int[] arr){
        Stack<Node> stack = new Stack<>();
        Node root = null;
        for(int val: arr){
            if(val!=-1){
                stack.add(new Node(val));
            }
            else{
                Node node = stack.pop();
                if (stack.size()!=0){
                    stack.peek().children.add(node);
                }
                else root = node;
            }
        }
        return root;
    }

    public static void levelorder(Node root){
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while(queue.size() > 0){
            // rem, prin, addchild
            Node temp = queue.remove();
            System.out.print(temp.data + " ");
            for (Node child : temp.children){
                queue.add(child);
            }
            break;
        }
        System.out.println(".");
    }
    
    public static void main(String [] args){
        int [] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Node root = construct(arr);
        levelorder(root);
     }
}
