public class Insertion {
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
    //exchange
    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    // Sort function
    private static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        Integer v[] = {52, 3, 6, 9, 3};
        Insertion.sort(v);

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

}
