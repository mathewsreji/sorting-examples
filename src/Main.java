import com.reji.sort.BubbleSorter;
import com.reji.sort.MergeSort;
import com.reji.sort.Sorter;

public class Main {
    public static void main(String[] args) {

        // unsorted data
        int[] data = {3,7,5,9,1,2,6,12,87,45,67,16};

        /*Sorter sorter = new MergeSort();
        int[] result = sorter.sort(data); */// invoke merge sort

        Sorter sorter = new BubbleSorter();
        int[] result = sorter.sort(data);

        // print result array
        for(int i=0;i<result.length;i++) {
            System.out.print(result[i] + ", ");
        }
    }
}
