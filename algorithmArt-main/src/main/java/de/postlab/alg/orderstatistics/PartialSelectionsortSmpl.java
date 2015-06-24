package de.postlab.alg.orderstatistics;

import de.postlab.alg.util.SortDebugHelper;
import lombok.Getter;

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
 * Initially created by michel on 23.06.15.
 */
public class PartialSelectionsortSmpl {

    @Getter
    private SortDebugHelper helper;

    public PartialSelectionsortSmpl() {
        helper = new SortDebugHelper();
    }

    /**
     * computes value of k-th order element and sorts elements 1 to k
     * they can be found in the first k elements of data in sorted order
     * @param data
     * @param k
     * @return the value of k-th order element
     */
    public int process(int[] data, int k) {
        assert (k < data.length);
        for (int i=0; i<k; i++) {
            int index = i;
            for (int j=i+1; j<data.length; j++) {
                helper.comparisons++;
                if (data[j] < data[index]) {
                    index = j;
                }
            }
            int tmp = data[i];
            data[i] = data[index];
            data[index] = tmp;
        }
        return data[k-1];
    }

}
