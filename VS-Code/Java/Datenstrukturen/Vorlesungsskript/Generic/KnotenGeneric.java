package Java.Datenstrukturen.Vorlesungsskript.Generic;

public class KnotenGeneric<T> {
    // Attribute:
    private T object;                       // Nimmt ein Objekt vom Datentyp "T" entgegen!
    private KnotenGeneric<T> next;          // Verweist auf das nächste Element in der Datenstruktur!

    // Konstruktor:
    public KnotenGeneric(T object, KnotenGeneric<T> next) {
        this.object = object;
        this.next = next;
    }

    // Methoden:

    // Setzt den Verweis auf den nächsten Knoten:
    public void setNext(KnotenGeneric<T> next) {
        this.next = next;
    }

    // Gibt das Knotenelement zurück:
    public T getElement() {
        return object;
    }

    // Gibt das nächste Knotenelement zurück:
    public KnotenGeneric<T> getNext() {
        return next;
    }

}
