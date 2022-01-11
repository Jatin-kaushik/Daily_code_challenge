package Generic_Tree;

import java.util.*;


public class multisolverobjectheap {
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
        int sum = 0;
        int depth = -1;
        int max  = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
    }

    public static void multisolver2(Node root, int height, genericobject go){
        go.sum += root.data;

        if (height > go.depth) go.depth = height;

        if (root.data > go.max) {
            go.max2 = go.max;
            go.max = root.data;}

        if(root.data < go.min) go.min = root.data;

        for(Node child : root.children){
            multisolver2(child, height+1, go);
        }
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
        genericobject go = new genericobject();
        multisolver2(root, 0,  go);
        System.out.println("SUM of Generic tree is " + go.sum);
        System.out.println("Depth of Generic tree is " + go.depth);
        System.out.println("Max of Generic tree is " + go.max);
        System.out.println("Min of Generic tree is " + go.min);
        System.out.println("2nd largets element of Generic tree is " + go.max2);

    }
}
