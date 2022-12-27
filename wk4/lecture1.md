## Extends:
1. Also a 'is a' relationship; The difference with implements is that you don't need to write out andy code for inheritant methods
2. The extends keyword lets us keep the original functionality of the mother class, while enabling us to make modifications and add additional functionality.
3. subclasses inherit all members of the parent class (no private though)
   * All instance and static variables
   * All methods
   * All nested classes

## Extends with Overriding
* we wanna collect those deleted item when calling removeLast// we need to do some changes
* since removelast calls some private stuff -> we use super instead
```java
@Override
public Item removeLast() {
    Item x = super.removeLast();
    deletedItems.addLast(x);
    return x;
}
    
```

## 
* Suppose we had a one-argument constructor that took in an item. If we had relied on an implicit call to the superclass's no-argument constructor, super(), the item passed in as an argument wouldn't be placed anywhere!
```java
public VengefulSLList(Item x) {
        super(x);
        deletedItems = new SLList<Item>();
        }
```

## The Object Class
* As long as you are a class, you are automatically a subclass of 'Object' class
```Java
public class whatever extends Object{
//    though we will usually ignore the Object//it extends it implicitly
//   many methods in Object class we can use directly: check on documentary
   
}
```
* Please keep in mind: extends = "is a" relationship not "has a"

## Type Checking and Casting
* Compiler only allows methods call based on "static type" of the variable:
```Java
SLList<Integer> svl = new vengefulList<>(); 
// static type: SLLits; dynamic type: vengefulList;
svl.printLostItems(); // This will give us "error"
// printLostItems() is not "overriden method": meaning it is exclusive to vengefulList(你妈都没有的method);
```
* If it is an "overriden method": use "dynamic type"'s method
```Java


```
* Assignment: whenever you see "new" -> it declares the "static type" of the RHS, but if you reassign it to the left: it will check whether "staic type(RHS)"
is a "static type(LHS)"; If so; the compiler will allow the assignment;
```Java


```
* Casting: telling the compiler not to do its type-checking duties
```java
Poodle frank = new Poodle("Frank", 5);
        Malamute frankSr = new Malamute("Frank Sr.", 100);

Poodle largerPoodle = (Poodle) maxDog(frank, frankSr); // runtime exception! This will return frankSr which is a Malamute;

```