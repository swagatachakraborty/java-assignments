package com.Linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class ListIteratorTest {

    @Test
    @DisplayName("should return true when there is next element")
    void hasNext() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        ListIterator iterator = new ListIterator(list);
        assertTrue(iterator.hasNext());
    }

    @Test
    @DisplayName("should return false when there is next element")
    void hasNext1() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ListIterator iterator = new ListIterator(list);
        assertFalse(iterator.hasNext());
    }

    @Test
    @DisplayName("should return the integer when there is next element")
    void next() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Integer integer = 1;
        list.add(integer);
        ListIterator iterator = new ListIterator(list);
        assertEquals(integer,iterator.next());
    }

//    @Test
//    @DisplayName("should throw a NoSuchElementException")
//    void next1() {
//        ArrayList<Integer> list = new ArrayList<>();
//        ListIterator iterator = new ListIterator(list);
//        assertThrows(NoSuchElementException.class, new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                iterator.next();
//            }
//        });
//    }
}