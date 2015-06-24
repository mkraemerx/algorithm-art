package de.postlab.alg.orderstatistics;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

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
public class PartialSelectionsortSmplTest {

    private PartialSelectionsortSmpl createProcessor() {
        return new PartialSelectionsortSmpl();
    }

    @Test()
    public void order100_really_random() {
        String name = "order100_really_random";
        int maxRandom = 10000;

        // read input data
        Random generator = new Random(1234L);
        int c = 100;
        int[] arr = new int[c];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generator.nextInt(maxRandom);
        }

        PartialSelectionsortSmpl processor = createProcessor();
        int k = 2;
        int result = processor.process(arr, k);

        Assert.assertTrue(result == arr[k-1]);
        for (int i = 0; i < k; i++) {
            Assert.assertTrue(arr[i] <= arr[i+1]);
            Assert.assertTrue(arr[i] <= result);
        }
        for (int i=k+1; i<arr.length; i++) {
            Assert.assertTrue(arr[i] >= result);
        }

        debug_print(processor, name, k, result, arr);
    }

    private void debug_print(PartialSelectionsortSmpl processor, String name, int k, int result, int[] arr) {
        System.out.println("***************************************");
        System.out.println("*********** END OF TEST ***************");
        System.out.println("***** "+ name +" ******");
        System.out.println("***************************************");

        System.out.println("found "+ k +"th order with value "+ result +" in list of "+ arr.length +" elements. Took "+ processor.getHelper().comparisons +" comparisons");
        System.out.println();
    }
}
