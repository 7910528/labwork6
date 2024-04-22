package com.labwork6;

/**
 * Iterator implementation for backward traversal of elements in a collection.
 * @param <T> The type of elements in the collection.
 */
class BackwardIterator<T> implements Iterator<T>
{
    private ConcreteAggregate<T> aggregate;
    private int currentIndex;
    /**
     * Constructs a BackwardIterator with the specified aggregate.
     * @param aggregate The aggregate to iterate over.
     */
    public BackwardIterator(ConcreteAggregate<T> aggregate)
    {
        this.aggregate = aggregate;
        this.currentIndex = aggregate.getItems().size() - 1;
    }
    @Override
    public boolean hasNext()
    {
        return currentIndex >= 0;
    }
    @Override
    public T next()
    {
        if (hasNext())
        {
            T item = aggregate.getItems().get(currentIndex--);
            return item;
        }
        return null;
    }
    @Override
    public boolean hasPrevious()
    {
        return currentIndex < aggregate.getItems().size() - 1;
    }
    @Override
    public T previous()
    {
        if (hasPrevious())
        {
            T item = aggregate.getItems().get(++currentIndex);
            return item;
        }
        return null;
    }
}