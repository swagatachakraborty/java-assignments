package com.duplicate_original;

public class UnoCard implements Duplicable<DuplicateUnoCard>{
    private int value;
    private String color;

    public int getValue() {
        return value;
    }

    public String getColor() {
        return color;
    }

    public UnoCard(int value, String color) {
        this.value = value;
        this.color = color;
    }

    @Override
    public DuplicateUnoCard duplicate() {
        return new DuplicateUnoCard(this.value, this.color);
    }

}
