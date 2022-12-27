package week4;

public class VengefulSLList<item> extends SLList<item> {
    SLList<item> deletedItems;

    public VengefulSLList(item x) {
        super(x);
        deletedItems = new SLList<item>(x);
    }

    @Override
    public item removeLast() {
        item x = super.removeLast();
        deletedItems.addLast(x);
        return x;
    }

    /** Prints deleted items. */
    public void printLostItems() {
        deletedItems.print();
    }

    public static void main(String[] args){
        VengefulSLList<Integer> L = new VengefulSLList<>(1);
        L.addLast(2);
        L.addLast(3);
        L.addLast(4);
        L.addLast(5);
        L.print();

        System.out.println("---------------------------");
        L.removeLast();
        L.removeLast();
        L.removeLast();
        L.printLostItems();

    }
}
