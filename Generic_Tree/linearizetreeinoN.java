package Generic_Tree;


import java.util.*;


public class linearizetreeinoN {
    
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

public static void mirrortree(Node root){
    for(Node child : root.children){
        mirrortree(child);
    }
    Collections.reverse(root.children);
}

    public static void removeleaf(Node root){
        ArrayList<Node> al = root.children;
        for(int i = al.size()-1; i>=0; i--){// Loop ulta islie chala rhe h bcz value na miss hojaye andr ki
            if(al.get(i).children.size() == 0){
                al.remove(i);
            }
        }

        for(Node child:root.children){
            removeleaf(child);
        }
    }

    public static Node tailoftree(Node root){
        while(root.children.size() >0){
            root= root.children.get(0);
        }
        return root;
    }

    public static void linearize(Node root){
        for(Node child: root.children){
            linearize(child);
        }
        while(root.children.size()>1){
            Node lastfc = root.children.remove(root.children.size()-1);// remove bcz parent ke bchhe bhi htaane h
            Node secodlastfc = root.children.get(root.children.size()-1);
            Node tailofSC = tailoftree(secodlastfc);
            tailofSC.children.add(lastfc);
        }
        
    }
    public static void linearizeinOn(Node root){

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
        linearizeinOn(root);
        display(root);
    }
}
