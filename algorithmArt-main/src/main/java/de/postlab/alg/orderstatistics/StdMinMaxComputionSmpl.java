package de.postlab.alg.orderstatistics;

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
public class StdMinMaxComputionSmpl {

    public int[] process(int[] data) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int i=0;
        if (data.length % 2 != 0) {
            min = data[0];
            max = data[0];
            i = 1;
        }
        for (; i<data.length; i+=2) {
            int left; // smaller of 2
            int right; // larger of 2
            if (data[i] < data[i+1]) {
                left = data[i];
                right = data[i+1];
            } else {
                right = data[i];
                left = data[i+1];
            }
            if (left < min) {
                min = left;
            }
            if (right > max) {
                max = right;
            }
        }
        int[] result = {min, max};
        return result;
    }
}
