package Java.Praktikum.Generic;

public class StackGeneric<T> {
    // Attribute:
    private KnotenGeneric<T> topKnoten = null;

    // push:
    public StackGeneric<T> push(T payload) {
        topKnoten = new KnotenGeneric<T>(payload, topKnoten);
        return this;
    }
    // pop:
    public StackGeneric<T> pop() {
        if(isEmpty()) {
            throw new java.lang.IllegalStateException();
        } else {
            topKnoten = topKnoten.getNext();
        }
        return this;
    }
    // top:
    public T top() {
        if(isEmpty()) {
            throw new java.lang.IllegalStateException();
        } else {
            return topKnoten.getPayload();
        }
    }

    // isEmpty:
    public boolean isEmpty() {
        return topKnoten == null;
    }
}
