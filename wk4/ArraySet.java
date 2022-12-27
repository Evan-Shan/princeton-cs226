package week4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
public class ArraySet<T> implements Iterable<T>{
    T[] set;
    int size;

    public ArraySet(){
        set = (T[]) new Object[100];
        size = 0;
    }

    public boolean contains(T x){
        for (int i = 0; i < size; i ++){
            if (set[i].equals(x)){
                return true;
            }
        }
        return false;
    }

    public void add(T x){
        if (!this.contains(x)){
            set[size] = x;
            size ++;
        }
    }
    public void print(){
        for (int i = 0; i < size; i ++){
            System.out.println(set[i]);
        }
    }

    public int size(){
        return this.size;
    }

    public Iterator<T> iterator(){
        return new ArraySetIterator<>();
    }


    public class ArraySetIterator<T> implements Iterator<T> {
        int wizPos;

        public ArraySetIterator() {
            wizPos = 0;
        }

        public boolean hasNext() {
            return wizPos < size;
        }

        public T next() {
            T returnItem = (T) set[wizPos];
            wizPos ++;
            return returnItem;
        }
    }

    public static void main(String[] args){
        ArraySet<Integer> aSet = new ArraySet<>();
        aSet.add(1);
        aSet.add(2);
        aSet.add(3);
        aSet.add(1);
        aSet.print();


        Set<Integer> javaSet = new HashSet<>();
        javaSet.add(1);
        javaSet.add(2);
        javaSet.add(3);
        javaSet.add(1);

        for (int i: javaSet) {
            System.out.println(i);
        }

        for (int j: aSet){
            System.out.println(j);
        }

        System.out.println(aSet);
    }


}
