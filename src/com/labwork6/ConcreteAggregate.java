package com.labwork6;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of the Aggregate interface representing a collection of items.
 * @param <T> The type of elements in the collection.
 */
class ConcreteAggregate<T> implements Aggregate<T>
{
    private List<T> items = new ArrayList<>();
    /**
     * Adds an item to the collection.
     * @param item The item to add.
     */
    public void addItem(T item)
    {
        items.add(item);
    }
    /**
     * Gets the list of items in the collection.
     * @return The list of items.
     */
    public List<T> getItems()
    {
        return items;
    }
    @Override
    public Iterator<T> createForwardIterator()
    {
        return new ForwardIterator<>(this);
    }
    @Override
    public Iterator<T> createBackwardIterator()
    {
        return new BackwardIterator<>(this);
    }
}