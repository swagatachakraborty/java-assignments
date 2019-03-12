package com.mobile;

import java.util.ArrayList;

public class MobilePhone {
    private long phoneNumber;
    private Contacts myContacts;

    public MobilePhone(long phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.myContacts = new Contacts();
    }

    protected void storeContact(long number, String name) {
        this.myContacts.addContact(number, name);
    }

    public ArrayList<Contact> getMyContacts() {
        return this.myContacts.getContacts();
    }

    protected void removeContact(String name) {
        if (!this.hasContact(name)) {
            this.showContactNotFoundError();
            return;
        }

        myContacts.removeContact(name);
        System.out.println("Contact with name '" + name + "' has deleted.");
    }

    private boolean hasContact(String name) {
        return myContacts.getContactByName(name) != null;
    }

    private void showContactNotFoundError() {
        System.out.println("There is no contact with this name.");
    }

    protected void queryContact(String name) {
        if (this.hasContact(name)) {
            displayContact(myContacts.getContactByName(name));
            return;
        }
        this.showContactNotFoundError();
    }

    private void displayContact(Contact contact) {
        System.out.println("Name : " + contact.getName() + ", Phone number : " + contact.getPhoneNumber());
    }

    protected void displayContacts() {
        for (Contact contact : this.getMyContacts()) {
            this.displayContact(contact);
        }
    }

    protected void modifyContact(String name, String newName, long newNumber) {
        if (!this.hasContact(name)) {
            this.showContactNotFoundError();
        }

        myContacts.updateContact(name, newName, newNumber);
        System.out.println("Contact with the name " + name + " has been modified.");
        return;
    }
}
