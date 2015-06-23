package de.postlab.alg.orderstatistics;

import de.postlab.alg.comparisonsort.quicksort.StdQuicksortSmpl;
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
public class StdMinMaxComputionSmplTest {

    private StdMinMaxComputionSmpl createProcessor() {
        return new StdMinMaxComputionSmpl();
    }

    @Test()
    public void order100_really_random() {
        String name = "order100_really_random";

        // read input data
        Random generator = new Random(1234L);
        int c = 100;
        int[] arr = new int[c];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generator.nextInt(10000);
        }

        StdMinMaxComputionSmpl processor = createProcessor();
        int[] result = processor.process(arr);

        for (int i = 0; i < c; i++) {
            Assert.assertTrue(arr[i] >= result[0]);
            Assert.assertTrue(arr[i] <= result[1]);
        }

        debug_print(processor, name, result, arr);
    }

    @Test()
    public void order200_random() {
        String name = "order200_random";

        // read input data
        ArrayReader reader = new ArrayReader();
        int[] arr = reader.readFileAsInt("/sort-data/int200_random.txt");
        int c = arr.length;

        StdMinMaxComputionSmpl processor = createProcessor();
        int[] result = processor.process(arr);

        for (int i = 0; i < c; i++) {
            Assert.assertTrue(arr[i] >= result[0]);
            Assert.assertTrue(arr[i] <= result[1]);
        }

        debug_print(processor, name, result, arr);
    }

    @Test()
    public void order2000_random() {
        String name = "order2000_random";

        // read input data
        ArrayReader reader = new ArrayReader();
        int[] arr = reader.readFileAsInt("/sort-data/int2000_random.txt");
        int c = arr.length;

        StdMinMaxComputionSmpl processor = createProcessor();
        int[] result = processor.process(arr);

        for (int i = 0; i < c; i++) {
            Assert.assertTrue(arr[i] >= result[0]);
            Assert.assertTrue(arr[i] <= result[1]);
        }

        debug_print(processor, name, result, arr);
    }

    @Test()
    public void order200_equal() {
        String name = "order200_equal";

        // read input data
        ArrayReader reader = new ArrayReader();
        int[] arr = reader.readFileAsInt("/sort-data/int200_equal.txt");
        int c = arr.length;

        StdMinMaxComputionSmpl processor = createProcessor();
        int[] result = processor.process(arr);

        for (int i = 0; i < c; i++) {
            Assert.assertTrue(arr[i] >= result[0]);
            Assert.assertTrue(arr[i] <= result[1]);
        }

        debug_print(processor, name, result, arr);
    }

    @Test()
    public void order200_sorted() {
        String name = "order200_sorted";

        // read input data
        ArrayReader reader = new ArrayReader();
        int[] arr = reader.readFileAsInt("/sort-data/int200_sorted.txt");
        int c = arr.length;

        StdMinMaxComputionSmpl processor = createProcessor();
        int[] result = processor.process(arr);

        for (int i = 0; i < c; i++) {
            Assert.assertTrue(arr[i] >= result[0]);
            Assert.assertTrue(arr[i] <= result[1]);
        }

        debug_print(processor, name, result, arr);
    }

    private void debug_print(StdMinMaxComputionSmpl processor, String name, int[] result, int[] arr) {
        System.out.println("***************************************");
        System.out.println("*********** END OF TEST ***************");
        System.out.println("***** "+ name +" ******");
        System.out.println("***************************************");

        System.out.println("found min of "+ result[0] + " and max of "+ result[1] +" in list of "+ arr.length +" elements.");
        System.out.println();
    }
}
