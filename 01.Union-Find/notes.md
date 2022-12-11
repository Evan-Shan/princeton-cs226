## Dynamic Connectivity
1. Functionalities: Given a 'set' of N objects
    * Union command: connect two objects;
    * Connected query: check if there is a path between two objects;

2. Define terms:
    * 'is connected to': is an equivalence relation;
    * Connect components: Maximum set of objects that are mutually connected;

3. Union-find API: design an efficient data structure for union-find
    * unionFind(int N);
    * void union(T p, T q);
    * boolean connected(T p, T q);


## Quick-Find(eager approach)
1. Data Structure:
    * integer array id[] of size N;
    * p and q are connected iff they have same id;

2. Implementation:
    * Find: check if p and q have the same id;
    * Union: change all entries id[p] to id[q];
```java
public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N){
        id = new int[N];
        for (int i = 0; i < N; i ++) {
            id[i] = i;
        }
    }

    public boolean isConnected(int p, int q){
        return id[p] == id[q];
    }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i ++){
            if (id[i] == pid){
                id[i] = qid;
            }
        }
    }
}
```
3. Defects
    * Initialization: O(N) -> for loop n times;
    * Union: O(N);
    * isConnected: O(1);

## Quick-Find(lazy approach)
1. Data Structure
   * integer array id[] of size N;
   * p and q are connected iff they have same parent;

2. Implementation:
    * Find: check if p and q have the same root;
    * Union: change the id of p's root to the id q's root;
```java
public class QuickUnionUF {
    private int[] id;

    public QuickUnionUF(int N){
        id = new int[N];
        for (int i = 0; i < N; i ++){
            id[i] = i;
        }
    }

    private int root(int i){
        while (i != id[i]){
            i = id[i];
        }
        return i;
    }

    public boolean isConnected(int p, int q){
        return root(p) == root(q);
    }

    public void union(int p, int q){
        int pRoot = root(p);
        int qRoot = root(q);
        id[pRoot] = qRoot;
    }
}
```
3. Defects
   * Initialization: O(N) -> for loop n times;
   * Union: O(N) -> 1 vs the rest -> climb n - 1 steps;
   * isConnected: O(N) -> both climb up the whole tree;

## Quick-Find Improvement(Weighted Quick-Find):
1. Goal: Avoid tall tree to minimize the steps of finding root;
    * make sure always link the smaller tree to the tall one;
    * keep track of the size of each tree;

2. Implementation:
    * size[];
    * Find: check if p and q have the same root;
    * Union: change the id of p's root to the id q's root;
```java
public class WeightedQuickUnionUF {
    private int[] id;
    private int[] size;

    public WeightedQuickUnionUF(int N){
        id = new int[N];
        for (int i = 0; i < N; i ++){
            id[i] = i;
            size[i] = 1;
        }
    }

    private int root(int i){
        while (i != id[i]){
            i = id[i];
        }
        return i;
    }

    public boolean isConnected(int p, int q){
        return root(p) == root(q);
    }

    public void union(int p, int q){
        int pRoot = root(p);
        int qRoot = root(q);
        if (size[pRoot] >= size[qRoot]){
            id[qRoot] = pRoot;
            size[pRoot] += size[qRoot];
        }else {
            id[pRoot] = qRoot;
            size[qRoot] += size[pRoot];
        }
    }
}
```
3. 
   * Initialization: O(N) -> for loop n times;
   * Union: O(lg(N)) -> takes constant time;
   * isConnected: O(lg(N)) -> depth of any node is at most lg(N);
