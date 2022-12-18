# Hash Function:
* Goal: Compute an array index from key;
    * must be efficiently computable;
    * each index is equally likely for each key;

* Hashcode: all java classes inherit a method hashCode(), which returns 32bits;
    * if x.equals(y) - > x.hashCode() == y.hashCode();
    * if !x.equals(y) - > x.hashCode() != y.hashCode();

* Hash function: an int between 0 and M-1(for use as array index)
    * key.hashCode() % M;


# Separate Chaining:
* Goal: using linked-list structure to avoid 'collision'
  1. Hash: map key to an integer i ~ [0, M-1];
  2. insert: put at the front of ith chain;
  3. search: go to search only the ith chain;

* Complexity Analysis:
  * the number of keys in a list is within a constant factor of N/M is very close to 1;
  * number of probes for search/insert is proportional to N/M; M times faster than sequential search!

# Linear Probing:
* Goal: using array structure to avoid 'collision'
  1. Hash: map key to an integer i ~ [0, M-1];
  2. insert/search: search table i; if occupied but n match, try i+1, i+2;
