package com.Mobile;

import java.util.Scanner;

public class Main {
    private static MobilePhone honor = new MobilePhone(1234567890);
    private static boolean quit = false;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (!quit) {
            printMenu();
            System.out.print("Enter your choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            performAction(choice);
        }
    }

    public static void printMenu() {
        System.out.println("1. Print all contacts.");
        System.out.println("2. Add new contact.");
        System.out.println("3. Remove contact.");
        System.out.println("4. Update contact.");
        System.out.println("5. Search contact.");
        System.out.println("6. Quit.");
    }

    public static void performAction(int choice) {
        switch (choice) {
            case 1:
                printAllContacts();
                break;
            case 2:
                storeContact();
                break;
            case 3:
                removeContact();
                break;
            case 4:
                updateContact();
                break;
            case 5:
                searchContact();
                break;
            case 6:
                quit = true;
                break;
            default:
                System.out.println("Sorry you enter wrong choice !!!");
        }
    }

    private static void searchContact() {
        System.out.print("Provide contact name : ");
        String name = scanner.nextLine();
        honor.queryContact(name);
    }

    private static void updateContact() {
        System.out.print("Enter contact name : ");
        String name = scanner.nextLine();

        String newName = name;
        long newNumber = 0;

        System.out.print("Want to modify name ? (y/n) : ");
        String answer = scanner.nextLine();
        if (answer.equals("y") || answer.equals("Y")) {
            System.out.print("Enter new name : ");
            newName = scanner.nextLine();
        }

        System.out.print("Want to modify number ? (y/n) : ");
        answer = scanner.nextLine();
        if (answer.equals("y") || answer.equals("Y")) {
            System.out.print("Enter new number : ");
            newNumber = scanner.nextLong();
        }

        honor.modifyContact(name, newName, newNumber);
    }

    private static void removeContact() {
        System.out.print("Provide Contact name to Remove : ");
        String name = scanner.nextLine();
        honor.removeContact(name);
    }

    private static void storeContact() {
        System.out.print("Provide contact number : ");
        long mobNumber = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Provide contact name : ");
        String name = scanner.nextLine();
        honor.storeContact(mobNumber, name);
        System.out.println("Contact of " + name + " is stored successfully.");
    }

    public static void printAllContacts() {
        honor.displayContacts();
    }
}
