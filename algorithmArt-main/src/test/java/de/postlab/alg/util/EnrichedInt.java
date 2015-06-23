package de.postlab.alg.util;

import lombok.Data;

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
 * Initially created by michel on 21.06.15.
 *
 * EnrichedInt: **BE AWARE** that equals matches value AND id, compareTo only matches value
 */
@Data
public class EnrichedInt implements ComparableNumber {
    private long id;
    private int value;

    public EnrichedInt(long id, int value) {
        this.id = id;
        this.value = value;
    }

    public int compareTo(ComparableNumber o) {
        if (o == null) throw new NullPointerException("can not compare to null");

        if (value < o.getValue()) return -1; // this one is smaller
        if (value > o.getValue()) return 1; // this one is larger
        return 0; // same value, but does not match with equals in this case
    }

    public boolean equals(Object o) {
        if (o instanceof EnrichedInt) {
            EnrichedInt oInt = (EnrichedInt) o;
            if (this.id == oInt.id && this.value == oInt.value) return true;
        }
        return false;
    }
}
