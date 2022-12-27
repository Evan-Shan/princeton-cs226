package week3;

public class Alist<k> implements List<k>{
    private k[] items;
    private int size;

    public Alist(){
        items = (k[]) new Object[100];
        size = 0;
    }

    public void addLast(k x){
        if (size >= items.length){
            resizeArray();
        }
        items[size] = x;
        size++;
    }

    public void resizeArray(){
        k[] a = (k[]) new Object[size * 2];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    public k getLast(){
        return items[size - 1];
    }

    public k get(int x){
        return items[x];
    }

    public int size(){
        return size;
    }

    public k removeLast(){
        k returnItem = items[size - 1];
        size --;
        return returnItem;
    }


    // public void print(){
    //     should write in linked list instead, since array list is already very efficient;
    // }

    public static void main(String[] args){
        List<String> a = new Alist<String>();
        a.addLast("c");
        a.addLast("b");
        a.addLast("a");
        a.print();
    }
}