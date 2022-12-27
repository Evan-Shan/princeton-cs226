import java.util.Iterator;

public class Stack<T> implements Iterable<T>{
    private Node first = null;
    private class Node{
        private T item;
        private Node next;
    }

    private class StackIterator implements Iterator<T>{
        private Node curr = first;
        public boolean hasNext(){
            return curr != null;
        }

        public T next(){
            T item = curr.item;
            curr = curr.next;
            return item;
        }
    }

    public Iterator<T> iterator(){
        return new StackIterator();
    }

    public void push(T x){
        Node oldFirst = first;
        first = new Node();
        first.item = x;
        first.next = oldFirst;
    }

    public T pop(){
        T returnItem = first.item;
        first = first.next;
        return returnItem;
    }
}
