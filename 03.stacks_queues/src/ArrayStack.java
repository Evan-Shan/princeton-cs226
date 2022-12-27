public class ArrayStack <T>{
    private T[] stack;
    private int N = 0;

    public ArrayStack(int capacity){
        stack = (T[]) new Object[capacity];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public void push(T x){
        if (stack.length == N){
            resize(2*N);
        }
        stack[N++] = x;
        // index into the stack, then increment by 1;
    }

    public void resize(int capacity){
        T[] copy = (T[]) new Object[capacity];
        for (int i = 0; i < N; i ++){
            copy[i] = stack[i];
        }
        stack = copy;
    }

    public T pop(){
        // decrement N, then index into the stack;
        T returnItem = stack[--N];
        stack[N] = null;
        if (stack.length > 0 && stack.length == N/4){
            resize(N/2);
        }
        return returnItem;
    }
}
