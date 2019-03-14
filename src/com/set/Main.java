package com.set;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(5);
        set2.add(6);

        Set<Integer> setContainer = new Set<Integer>(set1);

        System.out.println(setContainer.union(set2));
        System.out.println(setContainer.intersection(set2));
        System.out.println(setContainer.difference(set2));
    }
}
