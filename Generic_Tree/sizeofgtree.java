package Generic_Tree;

import java.util.*;

public class sizeofgtree {


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
            if(val != -1){
                stack.push(new Node(val));
            }
            else{
                Node node = stack.pop();
                if(stack.size()>0){
                    stack.peek().children.add(node);
                }
                else{
                    root = node;
                }
            }
        }
        return root;
    }

    public static int sizeoftree(Node root){
        Queue<Node> queue = new ArrayDeque<>();
        int size = 0;
        // if (root.data != null){
            queue.add(root);
            size++;
        // }
        while(queue.size()>0){
            // r,p,ac
            Node temp = queue.remove();
            for(Node child: temp.children){
                queue.add(child);
                size++;
            }
        }
        
        return size;
    }

    public static void levelorder(Node root){
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while(queue.size() > 0){
            // rem, prin, addchild
            Node temp = queue.remove();
            System.out.print(temp.data + " ");
            for (Node child : temp.children){
                // System.out.println(child.data);
                queue.add(child);
            }
        }
        System.out.println(".");
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
        int size = sizeoftree(root);
        System.out.println(size);
        levelorder(root);
    }
}
