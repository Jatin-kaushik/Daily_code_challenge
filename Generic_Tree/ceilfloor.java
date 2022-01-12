package Generic_Tree;

import java.util.*;


public class ceilfloor {
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

    public static class genericobject{
        int ceil = Integer.MAX_VALUE;
        int floor = Integer.MIN_VALUE;
    }

    public static void ceil_floor(Node root, int data, genericobject go){

        if (root.data > go.floor && root.data < data) go.floor = root.data;

        if (root.data < go.ceil && root.data > data) go.ceil = root.data;

        for(Node child : root.children){
            ceil_floor(child, data, go);
        }
    }

    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n ;i++){
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        scn.close();
        Node root = construct(arr);
        genericobject go = new genericobject();
        ceil_floor(root, data, go);
        System.out.println("CEIl = " + go.ceil);
        System.out.println("FLOOR = " + go.floor);
    }
}
