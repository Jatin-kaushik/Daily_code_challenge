package Generic_Tree;

import java.util.*;

public class mirror {

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

    public static void display(Node node){
        String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

public static void mirror(Node root){
    for(Node child : root.children){
        mirror(child);
    }
    Collections.reverse(root.children);
}

    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n ;i++){
            arr[i] = scn.nextInt();
        }
        scn.close();
        Node root = construct(arr);
        display(root);
        mirror(root);
        display(root);
    }
}
