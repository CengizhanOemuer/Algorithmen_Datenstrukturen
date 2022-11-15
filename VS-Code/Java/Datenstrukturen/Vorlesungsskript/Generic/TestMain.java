package Java.Datenstrukturen.Vorlesungsskript.Generic;

public class TestMain {
    public static void main(String[] args) {
        // Generic-Stack Test:
        StackGeneric<Integer> myStack = new StackGeneric<>();
        myStack.push(1);
        System.out.println("Das oberste Element ist: " + myStack.top());
        myStack.push(3);
        System.out.println("Das oberste Element ist: " + myStack.top());
        myStack.pop();
        System.out.println("Das oberste Element ist: " + myStack.top());
        myStack.pop();
    }
}
