package Java.Praktikum.Generic;

import java.util.NoSuchElementException;

public class QueueGeneric<T> {
    // Attribute:
    private KnotenGeneric<T> head = null;
    private KnotenGeneric<T> tail = null;

    // enqueue:
    public QueueGeneric<T> enqueue(T payload) {
        KnotenGeneric<T> oldtail = tail;
        tail = new KnotenGeneric<T>(payload, null);
        if(!isEmpty()) {
            oldtail.setNext(tail);
        } else {
            head = tail;
        }
        return this;
    }
    // dequeue:
    public QueueGeneric<T> dequeue() {
        if(!isEmpty()) {
            head = head.getNext();
        } else {
            throw new NoSuchElementException();
        }
        return this;
    }
    // front:
    public T front() {
        if(!isEmpty()) {
            return head.getPayload();
        } else {
            throw new NoSuchElementException();
        }
    }

    // isEmpty:
    private boolean isEmpty() {
        return head == null;
    }
    
}
