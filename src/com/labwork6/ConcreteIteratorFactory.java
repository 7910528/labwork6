package com.labwork6;

/**
 * Concrete implementation of the IteratorFactory interface for creating iterators based on traversal direction.
 */
class ConcreteIteratorFactory implements IteratorFactory
{
    private Aggregate<?> aggregate;
    private boolean forwardTraversal;
    /**
     * Constructs a ConcreteIteratorFactory with the specified aggregate and traversal direction.
     * @param aggregate The aggregate to create iterators for.
     * @param forwardTraversal True for forward traversal, false for backward traversal.
     */
    public ConcreteIteratorFactory(Aggregate<?> aggregate, boolean forwardTraversal)
    {
        this.aggregate = aggregate;
        this.forwardTraversal = forwardTraversal;
    }
    @Override
    public Iterator<?> createIterator()
    {
        if (forwardTraversal)
        {
            return aggregate.createForwardIterator();
        }
        else
        {
            return aggregate.createBackwardIterator();
        }
    }
}