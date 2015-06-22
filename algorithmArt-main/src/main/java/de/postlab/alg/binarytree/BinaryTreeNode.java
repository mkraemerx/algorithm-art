package de.postlab.alg.binarytree;

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
 *
 * BinaryTreeNode used in @link{BinaryTree}
 * Initially created by michel on 25.05.15.
 */
public class BinaryTreeNode<T> {
    private BinaryTreeNode<T> top;
    private BinaryTreeNode<T> left;
    private BinaryTreeNode<T> right;
    private T payload;

    public BinaryTreeNode(T payload) {
        this.payload = payload;
    }

    public BinaryTreeNode<T> top() {
        return top;
    }
    public void setTop(BinaryTreeNode<T> newTop) {
        top = newTop;
    }

    public BinaryTreeNode<T> left() {
        return left;
    }
    public void setLeft(BinaryTreeNode<T> newLeft) {
        left = newLeft;
    }

    public BinaryTreeNode<T> right() {
        return right;
    }
    public void setRight(BinaryTreeNode<T> newRight) {
        right = newRight;
    }

    public T getPayload() {
        return payload;
    }

}
