package OOPS_JAVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LinkedList {

    public static class Node{
        int data;
        Node next;
    }

    public static class linkedlist{
        Node head;
        Node tail;
        int size;

        int size(){
            return size;
        }

        void display(){
            for (Node temp = this.head; temp != null ; temp = temp.next){
                System.out.print(temp.data + " --> ");
            }
            System.out.println();
        }
        void addLast(int val){ // last me add
            Node node = new Node(); // phle new node bnaoo
            node.data = val; // uske data me val daloo
            node.next = null; // uska next null pe kro bcz vo last hainn

            if (size == 0){ // agr ll empty h to head tail sbb vhi hoga
                head = tail = node;
            }
            else{ // tail ka next node pe kro(isse vo node add hoga)and tail ko node pe krke update krdo
                tail.next = node;
                tail = node;
            }
            size++;// size bdhaa do
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList list = new LinkedList();
    
        String str = br.readLine();
        while(str.equals("quit") == false){
          if(str.startsWith("addLast")){
            int val = Integer.parseInt(str.split(" ")[1]);
            list.addLast(val);
          } else if(str.startsWith("size")){
            System.out.println(list.size());
          } else if(str.startsWith("display")){
            list.display();
          }
          str = br.readLine();
        }
    }
}