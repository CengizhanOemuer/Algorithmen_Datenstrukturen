package Java.Praktikum.Array;

public class BoundedQueue<T> {
	private Object[] array;
	private int inIndex, outIndex, size;
	
	public BoundedQueue(int capacity) {
		array = new Object[capacity];
	}
	
	public void enqueue(T value) {
		if(size == array.length) {
			System.out.println("enqueue returned weil voll");
			return;
		}
		array[inIndex] = value;
		size++;
		inIndex = (inIndex + 1) % array.length;
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("dequeue returned weil leer");
			return;
		}
		outIndex = (outIndex+1) % array.length;	
		size--;
	}
	
	public T front() {
		if(isEmpty()) {
			System.out.println("fron returned weil leer");
			return null;
		}
		return (T) array[outIndex];
	}
	
	public Boolean isEmpty() {
		return size==0;
	}
}