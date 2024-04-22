package com.labwork6;

/**
 * Interface representing an aggregate object that can be traversed by iterators.
 * @param <T> The type of elements in the aggregate.
 */
interface Aggregate<T>
{
    /**
     * Creates an iterator for forward traversal.
     * @return Iterator for forward traversal.
     */
    Iterator<T> createForwardIterator();
    /**
     * Creates an iterator for backward traversal.
     * @return Iterator for backward traversal.
     */
    Iterator<T> createBackwardIterator();
}