package com.Range;

import java.util.ArrayList;

public class NumberRange extends Range<Integer> {
    public NumberRange(Integer start, Integer end) {
        super(start, end);
    }

    @Override
    public ArrayList<Integer> getAll() {
        ArrayList<Integer> integers = new ArrayList<>();

        for(int i = start; i<=end; i++){
            integers.add(i);
        }

        return integers;
    }

    @Override
    public boolean contains(Integer element) {
        return element >= this.start && element <= this.end;
    }
}
