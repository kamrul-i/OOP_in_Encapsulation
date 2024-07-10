package oop_in_encapsulation;

public class Encapsulation {

    //instance variable -------------
    private String name;
    private int age;

    //it is method ----------------------------
    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
    /*
    variables গুলো private হিসেবে declare করার পর, অন্য class থেকে use করা যাবে না।।
    private variables গুলোকে public হিসেবে ব্যবহার করার জন্য ‍set & get method ব্যবহার করতে হবে।।
    Follow the next commit !!
    */
}
