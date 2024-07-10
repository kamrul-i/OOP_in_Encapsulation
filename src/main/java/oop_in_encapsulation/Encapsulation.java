package oop_in_encapsulation;

public class Encapsulation {

    //instance variable -------------
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //it is method ----------------------------
    void display() {
        System.out.println("Name : " + getName());
        System.out.println("Age  : " + getAge());
    }
    /*
    set & get method এর আলোচনা:
    every variable must be create setter & getter, but not necessary.
    you could create setter & getter automaticaly.
    follow the steps -> 
    open your java class -> click the right side of the mouse -> select "insert code" -> select "getter & setter"
     */
}
