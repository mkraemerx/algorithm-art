package de.postlab.alg.quicksort;

import de.postlab.util.SortDebugHelper;
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
public class TailRecursiveQuicksortSmpl {

    @Getter
    private SortDebugHelper helper;

    public TailRecursiveQuicksortSmpl() {
        helper = new SortDebugHelper();
    }

    public void quicksort(int[] arr, int lo, int hi) {
        helper.depthIncrease();
        if (log.isTraceEnabled()) log.trace("quicksort "+ lo +" - "+ hi +" - depth "+ helper.depth);
        while( lo < hi) {
            int mid = partition(arr, lo, hi);
            if (mid - lo < (hi - lo)/2) {
                quicksort(arr, lo, mid-1);
                lo = mid+1;
            } else {
                quicksort(arr, mid+1, hi);
                hi = mid -1;
            }
        }
        helper.depthDecrease();
    }

    private int partition(int[] arr, int lo, int hi) {
        helper.p_count++;

        int j=lo;
        int swap = 0;
        int x = arr[hi];
        for (int i=lo; i<hi; ++i) {
            if (helper.isDebug()) {
                helper.print_quicksort_trace_stuff(arr, lo, hi, i, j);
            }
            if (arr[i] <= x) {
                swap = arr[j];
                arr[j++] = arr[i];
                arr[i] = swap;
            }
            helper.comparisons++;
        }
        arr[hi] = arr[j];
        arr[j] = x;
        if (helper.isDebug()) {
            helper.print_quicksort_trace_stuff(arr, lo, hi, hi, j);
        }
        return j;
    }

}
