package com.reji.sort;

public class BubbleSorter implements Sorter{
    @Override
    public int[] sort(int[] a) {
        if(a.length == 0) {
            return a;
        }

        int j = 0;

        for(int i = 0; i < (a.length-1) - j ; i++) {
            if(a[i] > a[i+1]) {
                swap(a, i, i+1);
            }

            if(i == (a.length - j) - 2) {
                i = -1;
                j++;
            }
        }

        return a;
    }

    /**
     * swap elements at index location i and j
     * @param a
     * @param i
     * @param j
     */
    private void swap(int[] a, int i, int j) {
        a[i] = a[i] + a[j];
        a[j] = a[i] - a[j];
        a[i] = a[i] - a[j];
        return;
    }
}
