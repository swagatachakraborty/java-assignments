package com.duplicate_original;

public class IdentityCard implements Duplicable<DuplicateIdentityCard> {
    private int id;

    public IdentityCard(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public DuplicateIdentityCard duplicate() {
        return new DuplicateIdentityCard(this.id);
    }
}
