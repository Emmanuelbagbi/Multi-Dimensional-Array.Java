package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people: ");
        int numberOfPeople = scanner.nextInt();
        scanner.nextLine();

        String[][] people = new String[numberOfPeople][2];

        for (int i = 0; i < numberOfPeople; i++) {
            System.out.print("Enter name for person " + (i + 1) + ": ");
            people[i][0] = scanner.nextLine();
            System.out.print("Enter score for " + people[i][0] + ": ");
            people[i][1] = scanner.nextLine();
        }

        System.out.println("\nNames and Scores:");
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("Name: " + people[i][0] + ", Score: " + people[i][1]);
        }
    }
}
