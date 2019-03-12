package com.Range;

import java.util.ArrayList;

public class AlphabetRange extends Range<Character>  {
    public AlphabetRange(Character start, Character end) {
        super(start, end);
    }

    @Override
    public ArrayList<Character> getAll() {
        ArrayList<Character> characters = new ArrayList<>();

        for(char c = start; c<=end; c++){
            characters.add(c);
        }

        return characters;
    }

    @Override
    public boolean contains(Character element) {
        return element >= this.start && element <= this.end;
    }
}
