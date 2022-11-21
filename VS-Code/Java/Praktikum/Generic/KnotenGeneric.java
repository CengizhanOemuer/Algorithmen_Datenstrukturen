package Java.Praktikum.Generic;

public class KnotenGeneric<T> {
    // Attribute:
    private T payload;
    private KnotenGeneric<T> next;

    // Konstruktor:
    public KnotenGeneric(T payload, KnotenGeneric<T> next) {
        this.payload = payload;
        this.next = next;
    }

    // setNext:
    public void setNext(KnotenGeneric<T> next) {
        this.next = next;
    }

    // getPayload:
    public T getPayload() {
        return payload;
    }

    // getNext:
    public KnotenGeneric<T> getNext() {
        return next;
    }
}
