public class Queue<T> {
    private Node first, last;

    private class Node{
        private T item;
        private Node next;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void enqueue(T x){
        Node oldLast = last;
        last = new Node();
        last.item = x;
        last.next = null;
        if (isEmpty()){
            first = last;
        }else{
            oldLast.next = last;
        }
    }

    public T dequeue(){
        T returnItem = first.item;
        first = first.next;
        if (isEmpty()){
            last = null;
        }
        return returnItem;
    }

}
