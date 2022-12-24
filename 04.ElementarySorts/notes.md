# Selection Sort
* Runtime Analysis:
    * Comparisons: (N-1) + (N-2) + ... + 1 + 0 = ~ N^2/2;
    * Exchanges = N;
* Defects: 
    * Even if the input is sorted, this will still take quadratic time;
* Implementations:
```java
public static void sort(Comparable[] a){
        for (int i = 0; i < a.length; i ++){
            int min = i;
            for (int j = i + 1; j < a.length; j ++){
                if (less(a[j], a[min])){
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }
```

# Insertion Sort
* Runtime Analysis:
  * Comparisons: Worst case: ~N^2/2; Best case: already sorted: N-1;
  * Exchanges: Worst case: ~N^2/2; Best case: already sorted: 0;
* Defects:
  * If the input is sorted, this will perform much better;
  * element only moves 1 position at a time;
* Implementations:
```java
public static void sort(Comparable[] a){
        int N = a.length;
        for (int i = 0; i < N; i ++){
            for (int j = i; j > 0; j --){
                if (less(j, j-1)){
                    exch(a, j, j-1);
                }
                // we have already ensured the former part is sorted
                else{
                    break;
                }
            }
        }
```

# Shell Sort
