package com.reji.sort;

import java.util.Arrays;

public class MergeSort implements Sorter{
    /**
     * merge sort
     * @param data
     * @return
     */
    @Override
    public int[] sort(int[] data) {
        if(data.length == 0) {
            return data;
        }
        if(data.length == 1) {
            return data;
        } else {
            int pivot = data.length/2;
            int[] sorted1 = sort(Arrays.copyOfRange(data, 0, pivot));
            int[] sorted2 = sort(Arrays.copyOfRange(data, pivot, data.length));
            return merge(sorted1, sorted2);
        }
    }

    private int[] merge(int[] a, int[] b){
        int[] result = new int[a.length + b.length];
        int i, j, k = 0;
        for(i = 0, j = 0; k < a.length + b.length; k++) {

            if(i == a.length) {  // case when array a[] has been completely merged
                result[k] = b[j];
                j++;
                continue;
            } else if (j == b.length) { // case when array b[] has been completely merged
                result[k] = a[i];
                i++;
                continue;
            } else {       // normal case
                if (a[i] < b[j]) {
                    result[k] = a[i];
                    i++;
                } else {
                    result[k] = b[j];
                    j++;
                }
            }
        }
        return result;
    }

}
