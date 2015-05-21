package de.postlab.alg;

import de.postlab.util.ArrayPrinter;
import org.testng.annotations.Test;

/**
 * Created by michel on 18.05.15.
 */

public class QuicksortTest {

    @Test()
    public void simpleQuicksortTest() {
        //int[] arr =  {1, 2, 3, 4, 5, 6, 7, 12, 9, 10};
        int[] arr =  {1, 4, 5, 2, 18, 6, 7, 12, 9, 8};
        //int[] arr =  {3, 3, 3, 3, 3, 3, 3, 3, 3, 3};

        Quicksort mouse = new Quicksort();
        mouse.quicksort(arr, 0, arr.length - 1);

        ArrayPrinter p = new ArrayPrinter();
        System.out.println(p.printArray(arr));

        System.out.println("partition ran "+ mouse.get_count() +" times");
    }
}
