package week2;


public class SLList {

    private List first;
    private int size;

    public SLList(int x){
        first = new List(x, null);
        size = 1;
    }
    

    public void addFirst(int x){
        size ++;
        first = new List(x, first);
    }

    public int getFirst(){
        return first.item;
    }

    public void addLast(int x){
        size ++;
        List tmp = first;

        while (first.next != null){
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
