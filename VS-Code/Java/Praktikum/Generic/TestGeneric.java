package Java.Praktikum.Generic;

public class TestGeneric {
    public static void main(String[] args) {
        // Generic Queue:
        QueueGeneric<Integer> myQueue = new QueueGeneric<>();
        myQueue.enqueue(30);    // 30, null
        System.out.println("Das erste Element in der Queue ist: " + myQueue.front());
        myQueue.enqueue(20);    // 30, 20, null
        System.out.println("Das erste Element in der Queue ist: " + myQueue.front());
        myQueue.dequeue();  // 20, null
        System.out.println("Das erste Element in der Queue ist: " + myQueue.front());
        myQueue.dequeue();  // null
        // System.out.println("Das erste Element in der Queue ist: " + myQueue.front());

        // Generic Stack:
        StackGeneric<Integer> myStack = new StackGeneric<>();
        myStack.push(100); // 100, null
        System.out.println("Das oberste Element im Stack ist: " + myStack.top());
        myStack.push(1010); // 100, 1010, null
        System.out.println("Das oberste Element im Stack ist: " + myStack.top());
        myStack.pop();  // 100, null
        System.out.println("Das oberste Element im Stack ist: " + myStack.top());
        myStack.pop();  // null
        // System.out.println("Das oberste Element im Stack ist: " + myStack.top());

    }
}
