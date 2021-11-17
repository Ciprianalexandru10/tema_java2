package com.company;

import java.util.Scanner;

public class NameInitials {
    public static void main(String[] args) {
        int space;        // The location of the space in the input.
        String firstName; // The first name, extracted from the input.
        String lastName;  // The last name, extracted from the input.

        System.out.println();
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream
        System.out.println("Please enter your first name and last name, separated by a space.");
        System.out.print("? ");
        String str = sc.nextLine();

        space = str.indexOf(' ');
        firstName = str.substring(0, space);
        lastName = str.substring(space + 1);

        System.out.println("Your initials are " + firstName.charAt(0) + lastName.charAt(0));
    }
}
