package de.postlab.alg.comparisonsort.quicksort;

import de.postlab.alg.util.ComparableNumber;
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
 * along with AlgorithmArt. If not, see <http://www.gnu.org/licenses/>.
 * <p>
 * Initially created by michel on 17.05.15.
 */
@Slf4j
public class StdQuicksortCpbl {

    @Getter
    private SortDebugHelper helper;

    public StdQuicksortCpbl() {
        helper = new SortDebugHelper();
    }

    public void sort(ComparableNumber[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }

    public void quicksort(ComparableNumber[] arr, int lo, int hi) {
        helper.depthIncrease();
        if (log.isTraceEnabled()) log.trace("quicksort " + lo + " - " + hi + " - depth " + helper.depth);
        if (lo < hi) {
            int mid = partition(arr, lo, hi);
            quicksort(arr, lo, mid-1);
            quicksort(arr, mid + 1, hi);
        }
        helper.depthDecrease();
    }

    private int partition(ComparableNumber[] arr, int lo, int hi) {
        helper.p_count++;

        int j=lo;
        ComparableNumber swap = null;
        ComparableNumber x = arr[hi];
        for (int i=lo; i<hi; ++i) {
            if (helper.isDebug()) {
                helper.print_quicksort_trace_stuff(arr, lo, hi, i, j);
            }
            if (arr[i].compareTo(x) <= 0 ) {
                swap = arr[j];
                arr[j++] = arr[i];
                arr[i] = swap;
            }
        }
        arr[hi] = arr[j];
        arr[j] = x;
        if (helper.isDebug()) {
            helper.print_quicksort_trace_stuff(arr, lo, hi, hi, j);
        }
        return j;
    }

}
