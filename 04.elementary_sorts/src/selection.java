public class selection {
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

    public static boolean less(Comparable x, Comparable y){
        return x.compareTo(y) < 0;
    }

    public static void exch(Comparable[] a, int i, int j){
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args){

    }
}
