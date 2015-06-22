package de.postlab.util;

import java.text.DecimalFormat;

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
 * Initially created by michel on 18.05.15.
 */
public class ArrayPrinter {
    private DecimalFormat fmt;

    public ArrayPrinter() {
        fmt = new DecimalFormat("000");
    }

    public ArrayPrinter(String format) {
        fmt = new DecimalFormat(format);
    }

    public String printArray(ComparableNumber[] arr) {
        StringBuffer sb = new StringBuffer("[");
        for (int i=0; i<arr.length; ++i) {
            sb.append(fmt.format(arr[i].getValue())).append(", ");
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append("]");
        return sb.toString();
    }

    // don't know a common supertype of int[] AND Object[] and don't like to use boxed types
    public String printArray(int[] arr) {
        StringBuffer sb = new StringBuffer("[");
        for (int i=0; i<arr.length; ++i) {
            sb.append(fmt.format(arr[i])).append(", ");
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append("]");
        return sb.toString();
    }
}
