package Java.Praktikum.Array;

public class StackA {
    // Attribute:
    private int[] arr;
    private int capacity;
    private int top;

    // Konstruktor:
    public StackA(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // push:
    public void push(int payload) {
        if(isFull()) {
            System.out.println("Der Stack ist voll und kann keine Elemente mehr aufnehmen\nProgram beendet!");
            System.exit(-1);
        } else {
            arr[++top] = payload;
        }
    }
    // pop:
    public int pop() {
        if(isEmpty()) {
            System.out.println("Das Array besitzt keine Elemente die man entfernen könnte!\nProgram beendet!");
            System.exit(-1);
        }
        return arr[top--];   
    }
    // top:
    public int top() {
        if(isEmpty()) {
            System.out.println("Das Array besitzt keine Elemente die man Anzeigen könnte!");
            System.exit(-1);
        }
        return arr[top];
    }
    // isEmpty:
    public boolean isEmpty() {
        return top == -1;
    }
    // isFull:
    public boolean isFull() {
        return top == capacity - 1;
    }

}
