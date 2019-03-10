package com.Mobile;

public class Contact {
    private long phoneNumber;
    private String name;

    public Contact(long phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
}
