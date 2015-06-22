package de.postlab.alg.binarytree;

import java.util.Comparator;

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
 * Initially created by michel on 25.05.15.
 */
public class BinaryTree<T> {
    private BinaryTreeNode<T> root;
    private Comparator<T> comparator;
    private int size;

    public BinaryTree(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    private BinaryTreeNode<T> findClosest(T value) {
        BinaryTreeNode<T> cur = root;
        while (cur != null) {
            if (cur == null) {
                //return
            }
            int c = comparator.compare(value, cur.getPayload());
            if (c == 0) {
                return cur;
            } else if (c < 0) {
                cur = cur.left();
            } else {
                cur = cur.right();
            }
        }
        return null; // todo
    }

    public void add(BinaryTreeNode<T> newNode) {
        if (root == null) {
            root = newNode;
            newNode.setTop(null);
        } else {
            BinaryTreeNode<T> cur = null;
//            while ()
//            comparator.compare(root)
        }
        size++;
    }

    public int size() {
        return size;
    }
}
