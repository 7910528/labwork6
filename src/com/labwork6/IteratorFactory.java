package com.labwork6;

/**
 * Interface for creating iterators.
 */
interface IteratorFactory
{
    /**
     * Creates an iterator.
     * @return The created iterator.
     */
    Iterator<?> createIterator();
}