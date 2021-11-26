import com.reji.sort.MergeSort;

public class Main {
    public static void main(String[] args) {

        // unsorted data
        int[] data = {3,7,5,9,1,2,6,12,87,45,67,16};

        MergeSort sort = new MergeSort();
        int[] result = sort.sort(data); // invoke merge sort

        // print result array
        for(int i=0;i<result.length;i++) {
            System.out.print(result[i] + ", ");
        }
    }
}
