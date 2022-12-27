package week4;

public class SLList<item> {

    private List<item> first;
    private int size;

    public SLList(item x){
        first = new List<>(x, null);
        size = 1;
    }



    public void addFirst(item x){
        size ++;
        first = new List<>(x, first);
    }

    public item removeLast(){
        List<item> tmp = first;
       while (tmp.next != null){
           tmp = tmp.next;
       }
       return tmp.item;
    }

    public void print(){
        List<item> tmp = this.first;
        while (tmp != null){
            System.out.println(tmp.item);
            tmp = tmp.next;
        }
    }
    public item getFirst(){
        return first.item;
    }

    public void addLast(item x){
        size ++;
        List<item> tmp = first;

        while (tmp.next != null){
           tmp = tmp.next; 
        }
        tmp.next = new List<>(x , null);
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
