package Q1;

public class Codebuster {
    /*1. Write a Java program to create a class called codebuster with a method called
    groupName(). Create a subclass called codebusterGroups() that overrides the
    groupName() method.*/
    public static void main(String[] args) {
        Codebuster c = new Codebuster();
        c.groupName();
    }

    public void groupName() {
        System.out.println("Method in codebuster class");
    }
}
