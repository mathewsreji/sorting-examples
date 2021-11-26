import com.reji.sort.BubbleSorter;
import com.reji.sort.MergeSort;
import com.reji.sort.SelectionSorter;
import com.reji.sort.Sorter;

public class Main {
    public static void main(String[] args) {

        // unsorted data
        int[] data = {3,7,5,9,1,2,6,87,67,16,4,77,34,12,76,45,37};

        Sorter sorter = new BubbleSorter();
        int[] result = sorter.sort(data); // invoke merge sort
        Main.print(result, sorter);

        sorter = new MergeSort();
        result = sorter.sort(data); // invoke merge sort
        Main.print(result, sorter);

        sorter = new SelectionSorter();
        result = sorter.sort(data);
        Main.print(result, sorter);
    }

    /**
     * prints sorted array with its implementation classname
     * @param result
     * @param s
     */
    private static void print(int[] result, Sorter s) {
        System.out.print("\nSorted by " +  s.getClass().getName());
        for(int i=0;i<result.length;i++) {
            System.out.print(" "+ result[i]);
        }
    }
}
