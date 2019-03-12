package com.duplicate_original;

public class Main {
    public static void main(String[] args) {
        DuplicateUnoCard duplicateUno = new UnoCard(1, "blue").duplicate();
        System.out.println(duplicateUno.value + " " + duplicateUno.color);

        DuplicateIdentityCard duplicateId = new IdentityCard(1011).duplicate();
        System.out.println(duplicateId.id);
    }
}
