## Lecture1:

### DLList
1. SLList is slow as its addLast and getLast have to iterate through the whole List*O(n)
2. Solution1: Add last pointer: but it will be complicated if we want to removeLast
3. Solution2: doubly linked list: bug: sometimes last and sentinel points to the same thing
4. Solution2.1: dllist(double sentinel): one sentinel points to first, and the other points to last
5. Solution2.2: dllist(circular sentinel): the last element's next points to the first node

### Generic
1. generics will allow you to create data structures that hold any reference type.
2. Right after the name of the class in your class declaration, use an arbitrary placeholder inside angle brackets: <>
3. you don't even need to specify the type in the instantiation side -> SLList<String> s = new SLList<>("Hi")
4. If you need to instantiate a generic over a primitive type, use Integer, Double, Character, Boolean, Long, Short, Byte, or Float instead of their primitive equivalents.

### Arrays basics
1. Arrays are a type of object that consists of a numbered sequence of memory boxes, whereas class instances have named memory boxes.
2. A fixed integer length, N
3. A sequence of N memory boxes where all boxes are of the same type

### Arrays Syntax
1. Instantiation: (Almost) always start with 'new'  
```java
x = new int[3];  
y = new int[]{1, 2, 3};  
int[] z = {4, 5, 6};
```
2. x, y, and z are just 64bits memory box to store the starting position of array

### 2D Arrays
1. similar to 1D(skip)

### Arrays Vs Classes
1. Array boxes are numbered and accessed using [] notation, and class boxes are named and accessed using dot notation.  
2. Array boxes are the same type. Class boxes can be different types.
3. Array can be accessed at run time, whereas class can not  
* int indexOfInterest = askUserForInteger(); int k = x[indexOfInterest]; (It works!)  
* String fieldOfInterest = "mass"; double mass = p.fieldOfInterest; (Doesn't Work!)  
* The java compiler will not treat either side of dot as an expression, so it is not evaluated.

## Lecture2:

### Why Array List?
1. Linked List is so slow as it has to traverse through the list to get an item
2. Array List take constant time to get item(independent of array size)

### The Naive Array based list
Invariants:  
1. The position of the next item to be inserted (using addLast) is always size.
2. The number of items in the AList is always size.
3. The position of the last item in the list is always size - 1.

### removeLast
1. We only need to change the size, not need to change items& items[i]

### Limitation: list size can not reach more than 100
1. Solution1: resize the array(size + const)
2. Solution2: geometric resizing(size * n)

### Generic ArrayList
1. Java does not allow us to create an array of generic objects  
* (won't work) Glorp[] items = new Glorp[8];  
* (casting works) Glorp[] items = (Glorp []) new Object[8];  
2. We need to null out any items that we "delete/removeLast" to avoid loitering(performance reason) . 
* items[size - 1] = null;

## Lecture3:

### Interface
1. Step1: Define a interface for the general list hypernym -- we will choose the name List61B.  
* Do not include the constructor  
* Include every public method/don't provide any implementation for those methods 
2. Step2: Specify that SLList and AList are hyponyms of that type.
```java  
public class AList<Item> implements List61B<Item>  
```

### Overriding
1. If we implement the required functions in the subclass, include the @Override tag right on top of the method signature.(you don't have to include though)  
* Spell check for typos  
* the tag acts as a safeguard by alerting the compiler that you intend to override this method

### Inheritance1: Interface Inheritance
1. It refers to a relationship in which a subclass inherits all the methods/behaviors of the superclass.
2. a = b , we copy the bits with the requirement that b is the same type as a. Since x is a superclass of y, then the memory box for x may contain y. 
```java 
List61B<String> someList = new SLList<String>();
(this will work!)
```

### Inheritance2: Implementation Inheritance
1. write methods in interface that can work for all subclasses 
* must add default in the front: default public void print()
* call other methods in interface to achieve the functionality of that method 
2. if we don't like the default method * overwrite it!  
* must include @override tag in the front& use the same name  
* mo matter you declare the item using class or interface name, it will use the override method

### Dynamic Method Selection(Overriding)
1. Every variable has a 'static type' and 'dynamic type'  
* static type: specified in the 'declaration', will never change  
* dynamic type: specified in the 'instantiation', (using new), will change when you reassign the pointer
2. Dynamic Method Selection: when you have static type - X & dynamic type - Y, if Y's method overrides, use it instead

### Dynamic Method Selection(Do not occure in Overloading)
1. skim - just don't use it

### Summary
1. Interface Imheritance: a.k.a what
2. Implementation Inheritance: a.k.a how



