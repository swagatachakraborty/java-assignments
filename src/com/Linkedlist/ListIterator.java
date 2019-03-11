package com.Linkedlist;

/*
    Create A class called ListIterator
    Takes a list as constructor parameter

    method hasNext() tells if there are any more elements in the list which are not yet visited
    method next()
         - gives the next element if available
         - throw new NoSuchElementException() when all elements are visited already
*/

import java.util.List;
import java.util.NoSuchElementException;

public class ListIterator {
    private int index;
    private List<Integer> list;

    public ListIterator(List<Integer> list) {
        this.list = list;
        this.index = -1;
    }

    public boolean hasNext() {
        return index < list.size() - 1;
    }

    public Integer next() {
        if (this.hasNext()) {
            return list.get( ++index );
        }

        throw new NoSuchElementException("ListLastElementExceedException");
    }
}
