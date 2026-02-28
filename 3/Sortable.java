abstract class Sortable {
    public abstract int compare(Sortable b);

    public static void shell_sort(Sortable[] a) {
        for (int gap = a.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < a.length; i++) {
                Sortable temp = a[i];
                int j = i;
                while (j >= gap && a[j - gap].compare(temp) > 0) {
                    a[j] = a[j - gap];
                    j -= gap;
                } 
                a[j] = temp;
            }
        }
    }
}
