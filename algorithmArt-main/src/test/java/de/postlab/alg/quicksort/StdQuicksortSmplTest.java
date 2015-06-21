package de.postlab.alg.quicksort;

import de.postlab.util.ArrayPrinter;
import de.postlab.util.ArrayReader;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by michel on 18.05.15.
 */

public class StdQuicksortSmplTest {

    @Test()
    public void quicksort200_random() {

        // read input data
        ArrayReader reader = new ArrayReader();
        int[] arr = reader.readFileAsInt("/sort-data/int200_random.txt");
        int c = arr.length;

        StdQuicksortSmpl sorter = new StdQuicksortSmpl();
        sorter.quicksort(arr, 0, arr.length - 1);

        ArrayPrinter p = new ArrayPrinter();
        System.out.println(p.printArray(arr));

        for (int i=1; i<c; i++) {
            Assert.assertTrue(arr[i-1] <= arr[i]);
        }

        System.out.println("***************************************");
        System.out.println("*********** END OF TEST ***************");
        System.out.println("***************************************");
        System.out.println("sorted list of "+ c +" - partition ran " + sorter.getHelper().getP_count() + " times, max depth " + sorter.getHelper().getMax_depth());
        System.out.println();
    }

    @Test()
    public void quicksort2000_random() {

        // read input data
        ArrayReader reader = new ArrayReader();
        int[] arr = reader.readFileAsInt("/sort-data/int2000_random.txt");
        int c = arr.length;

        StdQuicksortSmpl sorter = new StdQuicksortSmpl();
        sorter.quicksort(arr, 0, arr.length - 1);

        ArrayPrinter p = new ArrayPrinter();
        System.out.println(p.printArray(arr));

        for (int i=1; i<c; i++) {
            Assert.assertTrue(arr[i-1] <= arr[i]);
        }

        System.out.println("***************************************");
        System.out.println("*********** END OF TEST ***************");
        System.out.println("***************************************");
        System.out.println("sorted list of "+ c +" - partition ran " + sorter.getHelper().getP_count() + " times, max depth " + sorter.getHelper().getMax_depth());
        System.out.println();
    }

    @Test()
    public void quicksort200_equal() {

        // read input data
        ArrayReader reader = new ArrayReader();
        int[] arr = reader.readFileAsInt("/sort-data/int200_equal.txt");
        int c = arr.length;

        StdQuicksortSmpl sorter = new StdQuicksortSmpl();
        sorter.quicksort(arr, 0, arr.length - 1);

        ArrayPrinter p = new ArrayPrinter();
        System.out.println(p.printArray(arr));

        for (int i=1; i<c; i++) {
            Assert.assertTrue(arr[i-1] <= arr[i]);
        }

        System.out.println("***************************************");
        System.out.println("*********** END OF TEST ***************");
        System.out.println("***************************************");
        System.out.println("sorted list of "+ c +" - partition ran " + sorter.getHelper().getP_count() + " times, max depth " + sorter.getHelper().getMax_depth());
        System.out.println();
    }

    @Test()
    public void quicksort200_sorted() {

        // read input data
        ArrayReader reader = new ArrayReader();
        int[] arr = reader.readFileAsInt("/sort-data/int200_sorted.txt");
        int c = arr.length;

        StdQuicksortSmpl sorter = new StdQuicksortSmpl();
        sorter.quicksort(arr, 0, arr.length - 1);

        ArrayPrinter p = new ArrayPrinter();
        System.out.println(p.printArray(arr));

        for (int i=1; i<c; i++) {
            Assert.assertTrue(arr[i-1] <= arr[i]);
        }

        System.out.println("***************************************");
        System.out.println("*********** END OF TEST ***************");
        System.out.println("***************************************");
        System.out.println("sorted list of "+ c +" - partition ran " + sorter.getHelper().getP_count() + " times, max depth " + sorter.getHelper().getMax_depth());
        System.out.println();
    }
}
