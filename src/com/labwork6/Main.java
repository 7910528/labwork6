package com.labwork6;

public class Main
{
    public static void main(String[] args)
    {
        ConcreteAggregate<Integer> aggregate = new ConcreteAggregate<>();
        aggregate.addItem(1);
        aggregate.addItem(2);
        aggregate.addItem(3);
        IteratorFactory forwardIteratorFactory = new ConcreteIteratorFactory(aggregate, true);
        Iterator<Integer> forwardIterator = (Iterator<Integer>) forwardIteratorFactory.createIterator();
        System.out.println("Forward traversal:");
        while (forwardIterator.hasNext())
        {
            Integer item = forwardIterator.next();
            System.out.println("Next item: " + item);
        }
        IteratorFactory backwardIteratorFactory = new ConcreteIteratorFactory(aggregate, false);
        Iterator<Integer> backwardIterator = (Iterator<Integer>) backwardIteratorFactory.createIterator();
        System.out.println("\nBackward traversal:");
        while (backwardIterator.hasNext())
        {
            Integer item = backwardIterator.next();
            System.out.println("Next item: " + item);
        }
    }
}