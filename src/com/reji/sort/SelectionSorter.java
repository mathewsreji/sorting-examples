package com.reji.sort;

public class SelectionSorter implements Sorter{
    @Override
    public int[] sort(int[] a) {

        if(a.length == 0) {
            //empty array
            return a;
        }

        int minPos = 0;
        for(int i = 0; i < a.length -1 ; i ++) {
            minPos = findMinPos(a, i);
            if(i != minPos) {
                swap(a, i, minPos);
            }
        }
        return a;
    }

    /**
     * swaps integers at index location i and minPos
     * @param a
     * @param i
     * @param j
     */
    private void swap(int[] a, int i, int j) {
        int temp;
        temp = a[j];
        a[j] = a[i];
        a[i] =  temp;
    }

    /**
     * find the index position of the smallest element
     * @param a
     * @param begPos
     * @return
     */
    private int findMinPos(int[] a, int begPos) {
        int minPos = begPos;

        for(int i = begPos; i < a.length; i++) {
            if(a[i] < a[minPos]) {
                minPos = i;
            }
        }
        return minPos;
    }
}
