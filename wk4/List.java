package week4;

public class List<item>{
    item item;
    List<item> next;

    public List(item f, List<item> n){
        item = f;
        next = n;
    }

    private int recursiveSize(){
        if (next == null){
            return 1;
        }
        return 1 + this.next.recursiveSize();
    }

    private int iterativeSize(){
        List<item> tmp = this;
        int size = 0;
        while (tmp != null){
            tmp = tmp.next;
            size ++;
        }
        return size;
    }

    private item recursiveGet(int i){
        if (i == 0){
            return this.item;
        }
        return this.next.recursiveGet(i - 1);
    }

    public static void main(String[] args){
        List<Integer> L = new List<>(2, null);
        L = new List<>(1, L);
        L = new List<>(0, L);
        System.out.println(L.recursiveSize());
        System.out.println(L.iterativeSize());
        System.out.println(L.recursiveGet(1));
    }
    
}
