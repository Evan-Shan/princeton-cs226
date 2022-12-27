## Exception: 
* How to write an exception yourself: cause it to crash
```Java
if(sth happens){
    throw new IllegalArgumentException("Can not add null");
}
// we are throwing an actual 'object': you have to add 'new'
```

## ArraySet
```java
public class ArraySet<T> implements Iterable<T> {
  T[] set;
  int size;

  public ArraySet() {
    set = (T[]) new Object[100];
    size = 0;
  }

  public boolean contains(T x) {
    for (int i = 0; i < size; i++) {
      if (set[i].equals(x)) {
        return true;
      }
    }
    return false;
  }

  public void add(T x) {
    if (!this.contains(x)) {
      set[size] = x;
      size++;
    }
  }

  public void print() {
    for (int i = 0; i < size; i++) {
      System.out.println(set[i]);
    }
  }

  public int size() {
    return this.size;
  }

  public Iterator<T> iterator() {
    return new ArraySetIterator<>();
  }
}

```

## Iterable
* How to make sure that our own version of ArraySet can do iteration(for each):
    1. have a method return an "iterator" object
    2. the object should have two methods -> 'hasNext' and 'next'
```Java
// We want this following codes to work!
Iteratro<Integer> aseer = aSet.iterator();
while (aseer.hasNext()){
    int i =  aseer.next();
    System.out.println(i);
}
```
* Implementations:
1. Create a method that can return iterator;
```java
public iterator<T> iterator(){
    return new ArraySetIterator();
}
```

2. Create such class that implements the java iterator& has hasNext() and next() methods
```java
import java.util.Iterator;

public class ArraySetIterator<T> implements Iterator<T> {
    int wizPos;

    public ArraySetIterator() {
        wizPos = 0;
    }

    public boolean hasNext() {
        return wizPos < size;
    }

    public T next() {
        T returnItem = set[size];
        wizPos ++;
        return returnItem;
    }
}

```

3. for each will still not work, because java does not know ArraySet has iterator
```java
// make the mother class implements the iterable interface -> menaing it is iterable
// I have an iterator method;
public class ArraySet<T> implements Iterable<T>{
    ...;
}
```
## toString()
* every time you use println() -> it will call s.toString();
* (not so important)-skim

## This
* 'this' refers to the current object
* 'this' is not mandatory though
* however, if there is a naming conflict in local variables and instance variable -> use 'this'
```java
size = size; // this would not do anthing
this.size = size; // this works
```
