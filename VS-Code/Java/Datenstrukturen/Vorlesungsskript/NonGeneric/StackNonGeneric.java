package Java.Datenstrukturen.Vorlesungsskript.NonGeneric;

public class StackNonGeneric {
    // Attribute:
    private Knoten topKnoten = null;

    // Push_Methode fügt an oberster Stelle ein Element hinzu:
    public StackNonGeneric push(Object element) {
        topKnoten = new Knoten(element, topKnoten);
        return this;
    }

    // Top_Methode gibt das oberste Element wieder:
    public Object top() {
        if(isEmpty()) {
            throw new java.lang.IllegalStateException();
        } else {
            return topKnoten.getElement();
        }
    }

    // Pop_Methode gibt das oberste Element zurück und entfernt es aus dem Stack:
    public StackNonGeneric pop() {
        if(isEmpty()) {
            throw new java.lang.IllegalStateException();
        } else {
            topKnoten = topKnoten.getNext();
            return this;
        }
    }

    // IsEmpty_Methode gibt an ob der Stack leer ist:
    private boolean isEmpty() {
        return topKnoten == null;
    }
}
