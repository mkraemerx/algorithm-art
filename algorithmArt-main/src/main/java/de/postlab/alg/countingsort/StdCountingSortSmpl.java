package de.postlab.alg.countingsort;

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
 * along with AlgorithmArt. If not, see <http://www.gnu.org/licenses/>.
 * <p>
 * Initially created by michel on 20.05.15.
 */
public class StdCountingsortSmpl {

    public void sort(int[] data, int maxKey) {
        int[] key = new int[maxKey+1];
        for (int i=0; i<=maxKey; i++) {
            key[i] = 0;
        }

        // count occurences in input data
        for (int i=0; i<data.length; ++i) {
            key[data[i]]++;
        }

        int t = 0;
        for (int i=0; i<=maxKey; i++) {
            for (int n=0; n<key[i]; n++) {
                data[t] = i; // set value i n times
                ++t;
            }
        }
    }

}
