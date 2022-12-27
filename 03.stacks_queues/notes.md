# Stacks:
* Definition: LIFO - 'Last in first out'
* Implementation:
    * Linked-List stack:
        * Every operation takes constant time in the worst case.
        * Null pointer issue can happen.
    * Resizing Array-based stack:
        * Underflow: throw exception if pop from an empty stack.
        * Overflow: use resizing array for array implementation.
