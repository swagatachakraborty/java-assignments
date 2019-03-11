package com.Linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(10);
        integers.add(15);
        integers.add(20);

        ListIterator listIterator = new ListIterator(integers);

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        ListIterator iterator1 = new ListIterator(list);
        System.out.println(iterator1.next());
        System.out.println(iterator1.next());
        System.out.println(iterator1.next());
        System.out.println(iterator1.next());
        System.out.println(iterator1.next());
        System.out.println(iterator1.next());
        System.out.println(iterator1.hasNext());

        listIterator.next();
    }
}
