/*
 *  UCF COP3330 Fall 2021 Exercise 3 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the quote? ");
        String quote = scanner.nextLine();
        System.out.println("Who said it? ");
        String author = scanner.nextLine();
        System.out.println(author + " says, \"" + quote + "\"");
    }
}