package week2;

public class selection {
    /** Sorting Procedure:
     * 1. select the samllest item in N arrays
     * 2. swap it with the front
     * 3. slection sort the remaining N-1 items
    */

    public static void sort(String[] s){
        sort(s, 0);
    }

    // step3: recursively selection sort the remaining of N-1
    private static void sort(String[] s, int curr){
        if (curr == s.length){
            return;
        }
        int smalllestPos = findSmallest(s, curr);
        swap(s, curr, smalllestPos);
        sort(s, curr++);
    }

    // step1: find the index of the smallest item in array
    private static int findSmallest(String[] s, int start){
        int smallestIndex = start;
        for (int i = smallestIndex; i < s.length; i ++){
            int cmp = s[i].compareTo(s[smallestIndex]);
            if(cmp < 0){
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    // step2: swap two items
    private static void swap(String[] s, int x, int y){
        String tmp = s[x];
        s[x] = s[y];
        s[y] = tmp;
    }

}
