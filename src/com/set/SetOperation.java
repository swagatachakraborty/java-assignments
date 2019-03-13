package com.set;

import java.util.HashSet;

public class SetOperation<T> {
    private HashSet<T> set;

    public SetOperation(HashSet<T> set) {
        this.set = new HashSet<>(set);
    }

    public HashSet<T> union(HashSet<T> otherSet) {
        HashSet<T> unionSet = new HashSet<>(this.set);
        unionSet.addAll(otherSet);
        return unionSet;
    }

    public HashSet<T> intersection(HashSet<T> otherSet) {
        HashSet<T> intersectionSet = new HashSet<>(this.set);
        intersectionSet.retainAll(otherSet);
        return intersectionSet;
    }

    public HashSet<T> difference(HashSet<T> otherSet) {
        HashSet<T> differenceSet = new HashSet<>(this.set);
        differenceSet.removeAll(this.intersection(otherSet));
        return differenceSet;
    }
}
