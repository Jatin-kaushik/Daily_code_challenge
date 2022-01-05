package Generic_Tree;

import java.util.*;

public class Maximum_in_gtree {

    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node(int data){
            this.data= data;
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
                if (stack.size()>0){
                    stack.peek().children.add(node);
                }
                else root = node;
            }
        }
        return root;
    }

    public static int maxtree(Node root){
        int max_val = root.data;
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while(queue.size()>0){
            Node temp = queue.remove();
            if (temp.data > max_val){
                max_val = temp.data;
            }
            for(Node child : temp.children){
                queue.add(child);
            }
        }
        return max_val;
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
        int res = maxtree(root);
        System.out.println(res);

    }
}
