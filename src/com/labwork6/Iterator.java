package com.labwork6;

/**
 * Interface representing an iterator for traversing elements in a collection.
 * @param <T> The type of elements in the collection.
 */
interface Iterator<T>
{
    /**
     * Checks if there are more elements to traverse in the collection.
     * @return True if there are more elements, otherwise false.
     */
    boolean hasNext();
    /**
     * Gets the next element in the collection.
     * @return The next element.
     */
    T next();
    /**
     * Checks if there are previous elements to traverse in the collection.
     * @return True if there are previous elements, otherwise false.
     */
    boolean hasPrevious();
    /**
     * Gets the previous element in the collection.
     * @return The previous element.
     */
    T previous();
}