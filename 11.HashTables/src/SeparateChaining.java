public class SeparateChaining<Key, Value> {
    private int M = 100; // number of chains
    private Node[] chain = new Node[M]; // array of chains

    private static class Node{
        private Object key;
        private Object val; // cast them later
        private Node next;

    }

    private int hash(Key key){
        return (key.hashCode() & 0x7fffffff) % M;
    }

    private Value get(Key key){
        int i = hash(key);
        for (Node x = chain[i]; x != null; x = x.next){
            if (key.equals(x.key)){
                return (Value) x.val;
            }
        }
        return null;
    }

    private void insert(Key key, Value val){

    }


}
