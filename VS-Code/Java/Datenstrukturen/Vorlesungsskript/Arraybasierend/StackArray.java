package Java.Datenstrukturen.Vorlesungsskript.Arraybasierend;

public class StackArray {
    // Attribute des Stacks:
    private int[] arr;
    private int top;
    private int capacity;

    // Konstruktor:
    public StackArray(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Push-Methode: Fügt ein Element dem Stack hinzu!
    public void push(int x) {
        if(isFull()) {
            System.out.println("Der Stack ist voll\nProgramm beendet!");
            System.exit(0);
        }
        System.out.println(x + " wird dem Stack hinzugefügt!");
        arr[++top] = x;
    }

    // Peek-Methode: Gibt jeweils das oberste Element im Stack aus!
    public int peek() {
        if(!isEmpty()) {
            return arr[top];
        } else {
            System.exit(-1);
        }
        return -1;
    }

    // Pop-Methode: Gibt das oberste Element im Stack zurück!
    public int pop() {
        if(isEmpty()) {
            System.out.println("Keine Elemente zum entfernen gefunden!\nProgramm wird beendet!");
            System.exit(-1);
        }
        System.out.println("Entferne " + peek() + " aus dem Stack!");
        return arr[top--];
    }

    // Size-Methode: Gibt die größe des Stacks zurück!
    public int size() {
        return top + 1;
    }

    // isEmpty-Method: Gibt an ob der Stack leer ist!
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}
