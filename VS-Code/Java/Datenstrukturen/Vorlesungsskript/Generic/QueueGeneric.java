package Java.Datenstrukturen.Vorlesungsskript.Generic;

import java.util.NoSuchElementException;

public class QueueGeneric<T> {
    // Attribute:
    private KnotenGeneric<T> tail = null;
    private KnotenGeneric<T> head = null;

    // Enqueue_Method fügt ein Element am Ende der Queue hinzu:
    public QueueGeneric<T> enqueue(T element) {
        KnotenGeneric<T> oldTail = tail;
        tail = new KnotenGeneric<T>(element, null);
        if(head != null) {
            oldTail.setNext(tail);
        } else {
            head = tail;
        }
        return this;
    }

    // Dequeue_Method entfernt das vorderste Element in der Queue:
    public QueueGeneric<T> dequeue() {
        if(!isEmpty()) {
            head = head.getNext();
        } else {
            throw new NoSuchElementException();
        }
        return this;
    }

    // Front_Method gibt das vorderste Element zurück ohne dieses zu entfernen:
    public T front() {
        if(!isEmpty()) {
            return head.getElement();
        } else {
            throw new NoSuchElementException();
        }
    }

    // IsEmpty_Method guckt ob die Queue leer ist:
    private boolean isEmpty() {
        return head == null;
    }
}
