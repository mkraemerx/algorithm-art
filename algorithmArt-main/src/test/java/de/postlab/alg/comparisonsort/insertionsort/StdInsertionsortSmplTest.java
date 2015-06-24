package de.postlab.alg.comparisonsort.insertionsort;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import de.postlab.alg.util.ArrayPrinter;
import de.postlab.alg.util.ArrayReader;

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
public class StdInsertionsortSmplTest {

    private StdInsertionsortSmpl createSorter() {
        return new StdInsertionsortSmpl();
    }

    @Test()
    public void insertionsort100_really_random() {

        // read input data
        Random generator = new Random(1234L);
        int c = 100;
        int[] arr = new int[c];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generator.nextInt(10000);
        }

        StdInsertionsortSmpl sorter = createSorter();
        sorter.sort(arr);

        for (int i = 1; i < c; i++) {
            Assert.assertTrue(arr[i - 1] <= arr[i]);
        }

        debug_print(sorter, arr);
    }

    @Test()
    public void insertionsort200_random() {

        // read input data
        ArrayReader reader = new ArrayReader();
        int[] arr = reader.readFileAsInt("/sort-data/int200_random.txt");
        int c = arr.length;

        StdInsertionsortSmpl sorter = createSorter();
        sorter.sort(arr);

        for (int i = 1; i < c; i++) {
            Assert.assertTrue(arr[i - 1] <= arr[i]);
        }

        debug_print(sorter, arr);
    }

    @Test()
    public void insertionsort2000_random() {

        // read input data
        ArrayReader reader = new ArrayReader();
        int[] arr = reader.readFileAsInt("/sort-data/int2000_random.txt");
        int c = arr.length;

        StdInsertionsortSmpl sorter = createSorter();
        sorter.sort(arr);

        for (int i = 1; i < c; i++) {
            Assert.assertTrue(arr[i - 1] <= arr[i]);
        }

        debug_print(sorter, arr);
    }

    @Test()
    public void insertionsort200_equal() {

        // read input data
        ArrayReader reader = new ArrayReader();
        int[] arr = reader.readFileAsInt("/sort-data/int200_equal.txt");
        int c = arr.length;

        StdInsertionsortSmpl sorter = createSorter();
        sorter.sort(arr);

        for (int i = 1; i < c; i++) {
            Assert.assertTrue(arr[i - 1] <= arr[i]);
        }

        debug_print(sorter, arr);
    }

    @Test()
    public void insertionsort200_sorted() {

        // read input data
        ArrayReader reader = new ArrayReader();
        int[] arr = reader.readFileAsInt("/sort-data/int200_sorted.txt");
        int c = arr.length;

        StdInsertionsortSmpl sorter = createSorter();
        sorter.sort(arr);

        for (int i = 1; i < c; i++) {
            Assert.assertTrue(arr[i - 1] <= arr[i]);
        }

        debug_print(sorter, arr);
    }

    private void debug_print(StdInsertionsortSmpl sorter, int[] arr) {
        System.out.println("***************************************");
        System.out.println("*********** END OF TEST ***************");
        System.out.println("***************************************");

        ArrayPrinter p = new ArrayPrinter();
        System.out.println(p.printArray(arr));

        System.out.println("sorted list of " + arr.length + " - "+ sorter.getHelper().comparisons +" comparisons used");
        System.out.println();
    }
}
