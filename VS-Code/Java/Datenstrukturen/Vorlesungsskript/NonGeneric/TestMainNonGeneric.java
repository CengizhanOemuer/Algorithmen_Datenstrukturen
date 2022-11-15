package Java.Datenstrukturen.Vorlesungsskript.NonGeneric;

public class TestMainNonGeneric {
    public static void main(String[] args) {
        // StackNonGeneric:
        StackNonGeneric myStack = new StackNonGeneric();
        myStack.push(1);
        System.out.println("Das oberste Element ist: " + myStack.top());
        myStack.push("Du hond!");
        System.out.println("Das oberste Element ist: " + myStack.top());
        myStack.pop();
        System.out.println("Das oberste Element ist: " + myStack.top());
        myStack.pop();
        System.out.println("Das oberste Element ist: " + myStack.top());
    }
}
