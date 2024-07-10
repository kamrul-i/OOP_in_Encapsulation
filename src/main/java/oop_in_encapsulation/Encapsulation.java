package oop_in_encapsulation;

public class Encapsulation {

    //these are instance variable -------------
    String name;
    int age;

    //it is method ----------------------------
    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    /*
    object oriented programming_OOP:
    object oriented programming প্রধানত ৪ প্রকার, 
        Encapsulation
        Inheritance
        Polymorphism
        Abstraction
    
    java-তে কাজ করার জন্য এই Access modifier গুলোর প্রয়োজন পড়ে,
    There are four types of access modifier in java:
        private
        default
        protected
        public
    Access modifier গুলো কোন variable / method এর আগে বসানো হয়।।
    
    Encapsulation এর আলোচনা:
        1.variables and methods একটি class এর মধ্যে Packaging হিসেবে থাকবে।।
        2.Variables গুলোকে private হিসেবে declare করতে হবে।। এই process কে data hiding বলে।।
        3.private variables গুলোকে public হিসেবে ব্যবহার করার জন্য ‍set & get method ব্যবহার করতে হবে।।
        4."return" যুক্ত method-এ void থাকবে না।। void যুক্ত method ফলাফল return করে না, run করতে চাইলে crush করে।।

     */
}
