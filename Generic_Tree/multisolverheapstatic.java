package Generic_Tree;

import java.util.*;


public class multisolverheapstatic {
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


    static int sum = 0;
    static int depth = -1;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int max2 = Integer.MIN_VALUE;

    public static void multisolver(Node root, int height){
        sum += root.data;

        if (height > depth) depth = height;

        if (root.data > max) {
            max2 = max;
            max = root.data;
        }
        if(root.data < min) min = root.data;

        for(Node child : root.children){
            multisolver(child, height+1);
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
        multisolver(root, 0);
        System.out.println("SUM of Generic tree is " + sum);
        System.out.println("Depth of Generic tree is " + depth);
        System.out.println("Max of Generic tree is " + max);
        System.out.println("Min of Generic tree is " + min);
        System.out.println("2nd largets element of Generic tree is " + max2);

    }
}
