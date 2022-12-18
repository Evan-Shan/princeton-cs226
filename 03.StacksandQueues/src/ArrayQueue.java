public class ArrayQueue <T>{
    private T[] queue;
    private int head=0, tail = 0;

    public ArrayQueue(int capacity){
        queue = (T[]) new Object[capacity];
    }

    public boolean isEmpty(){
        return head == tail;
    }

    public void enqueue(T x){
        if (tail == queue.length){
            resize(2*tail);
        }
        queue[tail++] = x;
    }

    public void resize(int capacity){
        T[] copy = (T[]) new Object[capacity];
        for (int i = 0; i < tail; i ++){
            copy[i] = queue[i];
        }
        queue = copy;
    }

    public T dequeue(){
        T returnItem = queue[head++];
        return returnItem;
    }

}
