package com.mobile;

import java.util.ArrayList;

public class Contacts {
    private ArrayList<Contact> contacts;

    public Contacts() {
        contacts = new ArrayList<>(10);
    }

    protected ArrayList<Contact> getContacts() {
        return contacts;
    }

    protected void addContact(long number, String name) {
        contacts.add(new Contact(number, name));
    }

    protected void removeContact(String name) {
        contacts.remove(getContactByName(name));
    }

    protected Contact getContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    protected void updateContact(String name, String newName, long newNumber) {
        Contact contact = this.getContactByName(name);
        if (newName != null) {
            contact.setName(newName);
        }

        if (newNumber != 0) {
            contact.setPhoneNumber(newNumber);
        }
    }
}
