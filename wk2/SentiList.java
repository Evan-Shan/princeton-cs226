package week2;


public class SentiList {

    private List sentinel;
    private int size;

    public SentiList(int x){
        sentinel = new List(63, null);
        sentinel.next = new List(x, null);
        size = 1;
    }
    

    public void addFirst(int x){
        size ++;
        sentinel.next = new List(x, sentinel.next);
    }

    public int getFirst(){
        return sentinel.next.item;
    }

    public void addLast(int x){
        size ++;
        List tmp = sentinel;

        while (tmp.next != null){
           tmp = tmp.next; 
        }
        tmp.next = new List(x , null);
    }

    // public int size(){
    //     return size(first);
    // }

    // private static int size(List l){
    //     if (l.next == null){
    //         return 1;
    //     }
    //     return 1 + size(l.next);
    // }

    public int size(){
        return size;
    }

}
