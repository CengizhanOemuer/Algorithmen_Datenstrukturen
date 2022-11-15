package Java.Datenstrukturen.Vorlesungsskript.NonGeneric;

public class Knoten {
    // Attribute:
    private Object object;          // Nimmt ein Objekt vom Datentyp object entgegen!
    private Knoten next;            // Verweist auf das nächste Knotenelement!

    // Konstruktor:
    public Knoten(Object object, Knoten next) {
        this.object = object;
        this.next = next;
    }

    // Methoden:

    // Setzt den Verweis auf das nächste Knotenelement:
    public void setNext(Knoten next) {
        this.next = next;
    }

    // Gibt den Knoten zurück:
    public Object getKnoten() {
        return object;
    }

    // Gibt den nächsten Knoten zurück:
    public Knoten getNext() {
        return next;
    }
}
