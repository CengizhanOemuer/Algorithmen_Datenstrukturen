package Java.Praktikum.Array;

public class QueueA {
    // Attribute:
    private int[] arr;
    private int frontIndex;
    private int backIndex;
    private int capacity;
    private int size;

    // Konstruktor:
    public QueueA(int size) {
        arr = new int[size];
        frontIndex = 0;
        backIndex = 0;
        capacity = size;
    }

    // enqueue:
    public void enqueue(int payload) {
        if(isFull()) {
            System.out.println("Die Queue ist voll!\nProgram beendet!");
            System.exit(-1);
        }
        arr[backIndex++] = payload;
        size++;
    }
    // dequeue:
    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Keine Elemente zum entfernen gefunden!\nProgram beendet!");
        }
        frontIndex++;
        size--;
    }
    // front:
    public int front() {
        if(isEmpty()) {
            System.out.println("Die Queue ist leer!\nProgram beendet!");
            System.exit(-1);
        }
        return arr[frontIndex];
    }

    // isEmpty:
    public boolean isEmpty() {
        return size == 0;
    }
    // isFull:
    public boolean isFull() {
        return size == capacity;
    }
}
