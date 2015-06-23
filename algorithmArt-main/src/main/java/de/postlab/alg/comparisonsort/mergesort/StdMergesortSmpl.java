package de.postlab.alg.comparisonsort.mergesort;

import de.postlab.alg.util.SortDebugHelper;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

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
 * Initially created by michel on 22.06.15.
 */
@Slf4j
public class StdMergesortSmpl {

    @Getter
    private SortDebugHelper helper;

    public StdMergesortSmpl() {
        helper = new SortDebugHelper();
    }

    public void sort(int[] arr) {
        mergesort(arr, 0, arr.length);
    }

    public void mergesort(int[] arr, int lo, int hi) {
        helper.depthIncrease();
        if (log.isTraceEnabled()) log.trace("mergesort " + lo + " - " + hi + " - depth " + helper.depth);
        if (lo < (hi-1)) {
            int mid = (hi - lo) / 2 + lo;
            mergesort(arr, lo, mid);
            mergesort(arr, mid, hi);
            merge(arr, lo, mid, hi);
        }
        helper.depthDecrease();
    }

    public void merge(int[] arr, int lo, int mid, int hi) {
        int[] data = new int[hi - lo];
        int left = lo; // index of first unmerged of left list
        int right = mid; // index of first unmerged of right list
        int p = 0; // index of next position for merged
        while (left < mid || right < hi) {
            if (left == mid || (right < hi && arr[left] > arr[right])) {
                data[p] = arr[right];
                right++;
            } else {
                data[p] = arr[left];
                left++;
            }
            helper.comparisons++;
            p++;
        }
        for (int i=0; i<data.length; i++) {
            arr[lo+i] = data[i];
        }
    }

}
