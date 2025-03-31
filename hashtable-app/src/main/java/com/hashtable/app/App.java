package com.hashtable.app;

import java.util.Scanner;

import com.hashtable.CustomHashTable;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomHashTable<String, String> hashTable = new CustomHashTable<>();
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Put (Insert key-value)");
            System.out.println("2. Get (Retrieve value by key)");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1":
                    System.out.print("Enter key: ");
                    String key = scanner.nextLine().trim();
                    System.out.print("Enter value: ");
                    String value = scanner.nextLine().trim();
                    hashTable.put(key, value);
                    System.out.println("Inserted (" + key + ", " + value + ")");
                    break;
                case "2":
                    System.out.print("Enter key to retrieve: ");
                    String getKey = scanner.nextLine().trim();
                    String result = hashTable.get(getKey);
                    if (result != null) {
                        System.out.println("Value: " + result);
                    } else {
                        System.out.println("Key not found!");
                    }
                    break;
                case "3":
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
