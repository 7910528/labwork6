package com.labwork6;

/**
 * Iterator implementation for forward traversal of elements in a collection.
 * @param <T> The type of elements in the collection.
 */
class ForwardIterator<T> implements Iterator<T>
{
    private ConcreteAggregate<T> aggregate;
    private int currentIndex = 0;
    /**
     * Constructs a ForwardIterator with the specified aggregate.
     * @param aggregate The aggregate to iterate over.
     */
    public ForwardIterator(ConcreteAggregate<T> aggregate)
    {
        this.aggregate = aggregate;
    }
    @Override
    public boolean hasNext()
    {
        return currentIndex < aggregate.getItems().size();
    }
    @Override
    public T next()
    {
        if (hasNext())
        {
            T item = aggregate.getItems().get(currentIndex++);
            return item;
        }
        return null;
    }
    @Override
    public boolean hasPrevious()
    {
        return currentIndex > 0;
    }
    @Override
    public T previous()
    {
        if (hasPrevious())
        {
            T item = aggregate.getItems().get(--currentIndex);
            return item;
        }
        return null;
    }
}