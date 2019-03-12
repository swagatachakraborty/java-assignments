package com.range;

import java.util.ArrayList;

public abstract class Range<T> {
    protected T start;
    protected T end;

    public Range(T start, T end) {
        this.start = start;
        this.end = end;
    }

    public abstract ArrayList<T> getAll();
    public abstract boolean contains(T elemeent);
}

