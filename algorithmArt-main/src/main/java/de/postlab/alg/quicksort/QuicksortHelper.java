package de.postlab.alg.quicksort;

import de.postlab.util.ArrayPrinter;
import lombok.Data;
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
 * Initially created by michel on 20.06.15.
 */
@Slf4j
@Data
public class QuicksortHelper {
    // those props are public since this software is for research
    public int p_count = 0;
    public int depth = 0;
    public int max_depth = 0;
    public long comparisons;

    /* **** METHODS **** */
    public void depthIncrease() {
        depth++;
        if (depth > max_depth) max_depth = depth;
    }

    public void depthDecrease() {
        depth--;
    }

    public boolean isDebug() {
        return log.isDebugEnabled();
    }

    public void print_debug_stuff(Comparable[] arr, int lo, int hi, int i_or_end, int j) {
        print_debug_stuff(arr, lo, hi, i_or_end, j, false);
    }

    public void print_trace_stuff(Comparable[] arr, int lo, int hi, int i_or_end, int j) {
        print_debug_stuff(arr, lo, hi, i_or_end, j, true);
    }

    private void print_debug_stuff(Comparable[] arr, int lo, int hi, int i_or_end, int j, boolean traceOnly) {
        if (!log.isDebugEnabled()) {
            return;
        }
        StringBuffer sb = new StringBuffer("");
        int k;
        for (k=0; k<j; ++k) {
            sb.append("     ");
        }
        if (i_or_end == j) {
            sb.append("i j  ");
        } else {
            sb.append("j    ");
        }
        ++k;
        for (; k<i_or_end; ++k) {
            sb.append("     ");
        }
        if (i_or_end == k) {
            sb.append("i");
        }
        ArrayPrinter p = new ArrayPrinter();
        sb.append('\n');
        sb.append(p.printArray(arr));
        if (traceOnly) {
            log.trace(sb.toString());
        } else {
            log.debug(sb.toString());
        }
    }

    public void print_debug_stuff(int[] arr, int lo, int hi, int i_or_end, int j) {
        print_debug_stuff(arr, lo, hi, i_or_end, j, false);
    }

    public void print_trace_stuff(int[] arr, int lo, int hi, int i_or_end, int j) {
        print_debug_stuff(arr, lo, hi, i_or_end, j, true);
    }

    private void print_debug_stuff(int[] arr, int lo, int hi, int i_or_end, int j, boolean traceOnly) {
        if (!log.isDebugEnabled()) {
            return;
        }
        StringBuffer sb = new StringBuffer("");
        int k;
        for (k=0; k<j; ++k) {
            sb.append("     ");
        }
        if (i_or_end == j) {
            sb.append("i j  ");
        } else {
            sb.append("j    ");
        }
        ++k;
        for (; k<i_or_end; ++k) {
            sb.append("     ");
        }
        if (i_or_end == k) {
            sb.append("i");
        }
            ArrayPrinter p = new ArrayPrinter();
        sb.append('\n');
        sb.append(p.printArray(arr));
        if (traceOnly) {
            log.trace(sb.toString());
        } else {
            log.debug(sb.toString());
        }
    }

}
