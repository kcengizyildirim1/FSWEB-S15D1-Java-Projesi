package com.workintech.model;

import java.util.Scanner;

public class GroceryMain {

    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Options:");
            System.out.println("0 - Quit");
            System.out.println("1 - Add items to the list");
            System.out.println("2 - Remove items from the list");
            System.out.println("3 - Check if an item is in the list");


            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 0:
                    System.out.println("Quitting the application.");
                    break;
                case 1:
                    System.out.print("Enter item(s) to add (separate multiple items with commas): ");
                    String itemsToAdd = scanner.nextLine();
                    groceryList.addItems(itemsToAdd);
                    break;
                case 2:
                    System.out.print("Enter item(s) to remove (separate multiple items with commas): ");
                    String itemsToRemove = scanner.nextLine();
                    groceryList.removeItems(itemsToRemove);
                    break;
                case 3:
                    System.out.print("Enter item to check: ");
                    String itemToCheck = scanner.nextLine();
                    groceryList.checkItemIsInList(itemToCheck);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

            groceryList.printSorted();
        } while (choice != 0);

        scanner.close();
    }


}
