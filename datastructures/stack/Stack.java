import java.util.EmptyStackException;

/**
 * A linked list implementation of a stack
 */

 public class Stack<T> implements Iterable<T> {
     private java.util.LinkedList<T> list = new java.util.LinkedList<T>();

     // Create an empty stack
     public Stack() {}

     // Create a stack with an initial element
     public Stack(T firstElement) {
         push(firstElement);
     }

     public int size() {
         return list.size();
     }

     public void push(T element) {
         list.addLast(element);
     }

     public T pop() {
         if (isEmpty()) {
             throw new java.util.EmptyStackException();
         }
         return list.removeLast();
     }

     public T peek() {
        if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        return list.peekLast();
     }

     public boolean isEmpty() {
         return list.isEmpty();
     }

     @Override
     public java.util.Iterator<T> iterator() {
         return list.iterator();
     }
 }