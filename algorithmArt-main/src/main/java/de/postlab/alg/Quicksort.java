package de.postlab.alg;

import de.postlab.util.ArrayPrinter;

/**
 * Created by michel on 17.05.15.
 */
public class Quicksort {

    private boolean DEBUG = true;
    private int p_count = 0;

    public Quicksort() {

    }

    public Quicksort(boolean debug) {
        DEBUG = debug;
    }

    public void quicksort(int[] arr, int lo, int hi) {
        if (DEBUG) System.out.println("quicksort "+ lo +" - "+ hi );
        if (lo < hi) {
            int mid = partition(arr, lo, hi);
            quicksort(arr, lo, mid-1);
            quicksort(arr, mid+1, hi);
        }
    }

    private int partition(int[] arr, int lo, int hi) {
        ++p_count;

        int j=lo;
        int swap = 0;
        int x = arr[hi];
        for (int i=lo; i<hi; ++i) {
            if (DEBUG) {
                print_debug_stuff(arr, lo, hi, i, j);
            }
            if (arr[i] <= x) {
                swap = arr[j];
                arr[j++] = arr[i];
                arr[i] = swap;
            }
        }
        if (DEBUG) {
            print_debug_stuff(arr, lo, hi, hi, j);
        }
        arr[hi] = arr[j];
        arr[j] = x;
        if (DEBUG) {
            print_debug_stuff(arr, lo, hi, hi, j);
        }
        return j;
    }

    private static void print_debug_stuff(int[] arr, int lo, int hi, int i_or_end, int j) {
        System.out.println();
        StringBuffer sb = new StringBuffer(" ");
        int k;
        for (k=0; k<j; ++k) {
            sb.append("     ");
        }
        if (i_or_end == j) {
            sb.append("i j  ");
        } else {
            sb.append("j    ");
        }
        ++k;
        for (; k<i_or_end; ++k) {
            sb.append("     ");
        }
        if (i_or_end == k) {
            sb.append("i");
        }
        System.out.println(sb.toString());
        ArrayPrinter p = new ArrayPrinter();
        System.out.println(p.printArray(arr));
    }

    public int get_count() {
        return p_count;
    }

}
