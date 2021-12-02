package OOPS_JAVA;

public class oops1 {

    private static class Person{
        String name;
        int age;
        
        void sayhi(){
            if(this.age<30){
                System.out.println("Hi, I'm " + this.name);
            }
            else{
                System.out.println("Hello, I'm " + this.name);
            }
        }
    }
    public static void main(String [] args){
        Person p1; // p1 is reference to an Object
        p1 = new Person(); // new person() --> Instance of a class or object
        // p1 is referring address of object person
        p1.age = 34;
        p1.name = "Anuj";
        p1.sayhi();


        Person p2;
        p2 = new Person();
        p2.age = 21;
        p2.name = "Jatin";
        p2.sayhi();
    }
    
}
