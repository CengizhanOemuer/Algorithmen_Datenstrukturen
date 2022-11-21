package Java.Praktikum.Array;

public class TestArray {
    public static void main(String[] args) {
        // Stack mit Array:
        StackA s = new StackA(5);
        s.push(3);
        System.out.println("An oberster Stelle im Stack steht: " + s.top());
        s.push(1);
        System.out.println("An oberster Stelle im Stack steht: " + s.top());
        s.push(2);
        System.out.println("An oberster Stelle im Stack steht: " + s.top());
        s.push(110);
        System.out.println("An oberster Stelle im Stack steht: " + s.top());
        s.push(30);
        System.out.println("An oberster Stelle im Stack steht: " + s.top());
        // s.push(100);

        // Queue Array:
        QueueA q = new QueueA(5);
        q.enqueue(10);
        System.out.println("Das vorderste Element ist: " + q.front());
        q.enqueue(20);
        System.out.println("Das vorderste Element ist: " + q.front());
        q.enqueue(30);
        System.out.println("Das vorderste Element ist: " + q.front());
        q.enqueue(40);
        System.out.println("Das vorderste Element ist: " + q.front());
        q.enqueue(50);
        System.out.println("Das vorderste Element ist: " + q.front());
        //q.enqueue(0);
        q.dequeue();
        System.out.println("Das vorderste Element ist: " + q.front());
        q.dequeue();
        System.out.println("Das vorderste Element ist: " + q.front());
        q.dequeue();
        System.out.println("Das vorderste Element ist: " + q.front());
        q.dequeue();
        System.out.println("Das vorderste Element ist: " + q.front());
        q.dequeue();
        System.out.println("Das vorderste Element ist: " + q.front());

    }
}
