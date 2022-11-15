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

        // Generic-Queue Test:
        QueueGeneric<Integer> myQueue = new QueueGeneric<>();
        myQueue.enqueue(1);
        System.out.println("Das vorderste Element ist: " + myQueue.front());
        myQueue.enqueue(3);
        System.out.println("Das vorderste Element ist: " + myQueue.front());
        myQueue.dequeue();
        System.out.println("Das vorderste Element ist: " + myQueue.front());
        myQueue.dequeue();
        System.out.println("Das vorderste Element ist: " + myQueue.front());
    }
}
