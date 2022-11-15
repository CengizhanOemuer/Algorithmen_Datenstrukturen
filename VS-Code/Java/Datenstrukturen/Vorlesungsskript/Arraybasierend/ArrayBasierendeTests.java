package Java.Datenstrukturen.Vorlesungsskript.Arraybasierend;

public class ArrayBasierendeTests {
    public static void main(String[] args) {
        // Ein Objekt der Klasse MyStack erzeugen:
        StackArray stack = new StackArray(10);
        // Methoden von MyStack testen:
        stack.push(10);
        stack.push(20);
        System.out.println("Das oberste Element im Stack ist: " + stack.peek());
        stack.pop();
        System.out.println("Das oberste Element im Stack ist: " + stack.peek());
        stack.pop();

        // Aufruf von Pop wenn keine Elemente im Stack sind:
        stack.pop();

        


    }
}
