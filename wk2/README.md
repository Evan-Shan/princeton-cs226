# Week2 - Advanced Java Review

## Lecture1:
### 1. ad-hoc testing Vs JUnit testing
1. import org.junit  
2. Using JUnit library to write standard tests 
3. 3 ways of writing(skim)

### 2. == Vs .equals
1. The == operator compares the literal bits in the memory boxes 
2. .equals checks the value

### 3. selection sort algorithms
1. select the samllest item in N arrays 
2. swap it with the front 
3. slection sort the remaining N-1 items 
4. takeaway: divide problems into several smaller parts(using helper methods)

## Lecture2:
### 1. Primitive Vs Reference Type
1. Primitive Type: byte, short, int, long, float, double, boolean, char 
* bits represent the 'information' of the primitive item
2. Reference Type: Everything else, including arrays, is reference type 
* bits (64 bits) only represent the 'memory address' of the reference type

### 2. The Golden Rule of Equals (GRoE)
1. when you said '=', it means copies the bits from the other, but bits have different meanings by pri&ref 
2. primitive: = copies the exact 'information' of another primitive type 
3. reference; = copies the exact 'meomory address' of another reference type

### 3. Arrays: reference type
1. Declaration: int[] a -> it creates a 64 bits memory box 
2. Instantiation: new int[]{1, 2, 3, 4} -> always starts with 'new'  
3. Together: int[] a = int[]{1, 2, 3, 4} -> assigns that object to the memory box

### 4. List
1. why List?: array is fixed sized, whereas list is not.  
2. getSize: try using recursive and iterative ways to getSize.  
3. getItem: try using recursive and iterative ways to getItem. 

## Lecture3:
### 1. Improvement1: Creating SLList 
1. Its constructor built upon the List -> first = new List(int, null) . 
2. getFirst(): -> return first.item 
3. addFirst(int x): -> first = new List(x, first)  

### 1. Improvement2: Naked Recursion(List) Vs SLList
1. SLList Version:(This is an node pointing to a recursive data structure!) 
```java
SLList L = new SLList(15);  
L.addFirst(10);  
L.addFirst(5);  
int x = L.getFirst();  
```
* Here we have a 'first' node to point to the actual first node of the list

2. List Version:(This is a recursive data structure!)
```java
List L2 = new List(15, null);  
L1 = new IntList(10, L);   
L = new IntList(5, L1);  
int x = L.first;
```
* There is a potentially undesireable possibility for the List user to have variables that point to the middle of the List

### 3. Improvement3:Public Vs Private
1. Private: Private variables and methods can only be accessed by code inside the same .java file
2. Nested Class: if one class is obviously a subclass of another, let it be nested.  

### 4. Improvement4: addLast & size()
1. addLast is easy(skim)
2. size(): since size() takes no input/cant do recursive update(aka n-1), we need a helper method -> size(List l) 

### 5. Improvement5: Caching
* size(): take too long to finish
improvement: add a cache to constructor, let it updates when addLast and addFirst were called

### 6. Improvement6: Making empty node
1. Basic idea: first --> empty(null): many method won't work if it can't access first.next/null pointer exception;
2. Improvement(Sentinel Node): first --> sentinel Node --> empty(null): change frist to sentinel/sentinel will never be null/so sentinel.next won't cause null pointer exception;

### 7. invariants
1. An invariant is a fact about a data structure that is guaranteed to be true (assuming there are no bugs in your code).

* The sentinel reference always points to a sentinel node.  
* The front item (if it exists), is always at sentinel.next.item.  
* The size variable is always the total number of items that have been added.


