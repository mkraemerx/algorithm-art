package de.postlab.alg.util;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

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
 * Initially created by michel on 21.06.15.
 */
@Slf4j
public class ArrayReader {

    private static final int INITIAL_CAPACITY_STD = 20;
    private final int initialCapacity;

    public ArrayReader() {
        initialCapacity = INITIAL_CAPACITY_STD;
    }

    public ArrayReader(int initialCapacity) {
        this.initialCapacity = initialCapacity;
    }

    /**
     * reads a whole file of space separated integers and stores them in an exactly sized array
     * @param filename
     * @return
     */
    public int[] readFileAsInt(String filename) {
        Scanner scanner = new Scanner(getClass().getResourceAsStream(filename));
        int c = 0;
        int[] data = new int[initialCapacity];

        while(scanner.hasNextInt()) {
            if (c >= data.length) {
                data = grow(data);
            }
            data[c] = scanner.nextInt();
            ++c;
        }
        data = shrink(data, c);
        return data;

    }

    /**
     * reads a whole file of space separated integers and stores them in an exactly sized array
     * @param filename
     * @return
     */
    public EnrichedInt[] readFileAsObjects(String filename) {
        Scanner scanner = new Scanner(getClass().getResourceAsStream(filename));
        int c = 0;
        EnrichedInt[] data = new EnrichedInt[initialCapacity];

        while(scanner.hasNextInt()) {
            if (c >= data.length) {
                data = grow(data);
            }
            EnrichedInt eInt = new EnrichedInt((long)c, scanner.nextInt());
            data[c] = eInt;
            ++c;
        }
        data = shrink(data, c);
        return data;

    }

    /**
     * grow the array by 1.5 + copy data
     * @param data
     * @return
     */
    private int[] grow(int[] data) {
        int newCapacity = data.length + (data.length >> 1);
        log.trace("re-sizing to "+ newCapacity);

        int[] newData = new int[newCapacity];
        for (int i=0; i<data.length; ++i) {
            newData[i] = data[i];
        }
        return newData;
    }

    /**
     * grow the array by 1.5 + copy data
     * @param data
     * @return
     */
    private EnrichedInt[] grow(EnrichedInt[] data) {
        int newCapacity = data.length + (data.length >> 1);
        log.trace("re-sizing to "+ newCapacity);

        EnrichedInt[] newData = new EnrichedInt[newCapacity];
        for (int i=0; i<data.length; ++i) {
            newData[i] = data[i];
        }
        return newData;
    }

    /**
     * shrink array to specified size
     * @param data
     * @param size
     * @return
     */
    private int[] shrink(int[] data, int size) {
        int[] newData = new int[size];
        for (int i=0; i<size; ++i) {
            newData[i] = data[i];
        }
        return newData;
    }

    /**
     * shrink array to specified size
     * @param data
     * @param size
     * @return
     */
    private EnrichedInt[] shrink(EnrichedInt[] data, int size) {
        EnrichedInt[] newData = new EnrichedInt[size];
        for (int i=0; i<size; ++i) {
            newData[i] = data[i];
        }
        return newData;
    }
}
