package de.postlab.alg.comparisonsort.quicksort;

import de.postlab.alg.util.ArrayPrinter;
import de.postlab.alg.util.ArrayReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

/**
 * AlgorithmArt - A collection of algorithm implementations,
 * tests and profiling programs to research the algorithms.
 * <p>
 * (c) Copyright 2015 by Michael Krämer
 * See https://github.com/mkraemerx/algorithm-art
 * <p>
 * This file is part of AlgorithmArt.
 * <p>
 * AlgorithmArt is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * Foobar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with Foobar. If not, see <http://www.gnu.org/licenses/>.
 * <p>
 * Initially created by michel on 18.05.15.
 */
public class StdQuicksortSmplTest {

    private StdQuicksortSmpl createSorter() {
        return new StdQuicksortSmpl();
    }

    @Test()
    public void quicksort100_really_random() {

        // read input data
        Random generator = new Random(1234L);
        int c = 100;
        int[] arr = new int[c];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generator.nextInt(10000);
        }

        StdQuicksortSmpl sorter = createSorter();
        sorter.sort(arr);

        for (int i = 1; i < c; i++) {
            Assert.assertTrue(arr[i - 1] <= arr[i]);
        }

        debug_print(sorter, arr);
    }

    @Test()
    public void quicksort200_random() {

        // read input data
        ArrayReader reader = new ArrayReader();
        int[] arr = reader.readFileAsInt("/sort-data/int200_random.txt");
        int c = arr.length;

        StdQuicksortSmpl sorter = createSorter();
        sorter.sort(arr);

        for (int i = 1; i < c; i++) {
            Assert.assertTrue(arr[i - 1] <= arr[i]);
        }

        debug_print(sorter, arr);
    }

    @Test()
    public void quicksort2000_random() {

        // read input data
        ArrayReader reader = new ArrayReader();
        int[] arr = reader.readFileAsInt("/sort-data/int2000_random.txt");
        int c = arr.length;

        StdQuicksortSmpl sorter = createSorter();
        sorter.sort(arr);

        for (int i = 1; i < c; i++) {
            Assert.assertTrue(arr[i - 1] <= arr[i]);
        }

        debug_print(sorter, arr);
    }

    @Test()
    public void quicksort200_equal() {

        // read input data
        ArrayReader reader = new ArrayReader();
        int[] arr = reader.readFileAsInt("/sort-data/int200_equal.txt");
        int c = arr.length;

        StdQuicksortSmpl sorter = createSorter();
        sorter.sort(arr);

        for (int i = 1; i < c; i++) {
            Assert.assertTrue(arr[i - 1] <= arr[i]);
        }

        debug_print(sorter, arr);
    }

    @Test()
    public void quicksort200_sorted() {

        // read input data
        ArrayReader reader = new ArrayReader();
        int[] arr = reader.readFileAsInt("/sort-data/int200_sorted.txt");
        int c = arr.length;

        StdQuicksortSmpl sorter = createSorter();
        sorter.sort(arr);

        for (int i = 1; i < c; i++) {
            Assert.assertTrue(arr[i - 1] <= arr[i]);
        }

        debug_print(sorter, arr);
    }

    private void debug_print(StdQuicksortSmpl sorter, int[] arr) {
        System.out.println("***************************************");
        System.out.println("*********** END OF TEST ***************");
        System.out.println("***************************************");

        ArrayPrinter p = new ArrayPrinter();
        System.out.println(p.printArray(arr));

        System.out.println("sorted list of " + arr.length + " - partition ran " + sorter.getHelper().getP_count() + " times, "+ sorter.getHelper().comparisons +" comparisons used, max depth " + sorter.getHelper().getMax_depth());
        System.out.println();
    }
}
