package de.postlab.alg.comparisonsort.selectionsort;

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
public class StdSelectionsortSmpl {

    @Getter
    private SortDebugHelper helper;

    public StdSelectionsortSmpl() {
        helper = new SortDebugHelper();
    }

    public void sort(int[] arr) {
        selectionSort(arr);
    }

    public void selectionSort(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            int index = i;
            for (int j=i+1; j<arr.length; j++) {
                helper.comparisons++;
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }
    }
}
