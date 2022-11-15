package Java.Datenstrukturen.Vorlesungsskript.Generic;

public class StackGeneric<T> {
    // Attribute:
    private KnotenGeneric<T> topKnoten = null;

    // Pop_Methode fügt ein Knotenelement dem Stack hinzu:
    public StackGeneric<T> push(T element) {
        topKnoten = new KnotenGeneric(element, topKnoten);
        return this;
    }

    // Top_Methode gibt das oberste Element im Stack wieder, ohne dieses zu entfernen:
    public T top() {
        if(isEmpty()) {
            throw new java.lang.IllegalStateException();
        } else {
            return topKnoten.getElement();
        }
    }

    // Pop_Methode gibt das oberste Element zurück und entfernt es:
    public StackGeneric<T> pop() {
        if(isEmpty()) {
            throw new java.lang.IllegalStateException();
        } else {
            topKnoten = topKnoten.getNext();
            return this;
        }
    }



    // Prüft ob der Stack leer ist:
    private boolean isEmpty() {
        return topKnoten == null;
    }
}
