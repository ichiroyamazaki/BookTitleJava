package com.mycompany.booktitle;

import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class BookTitle {

    public static void main(String[] args){
        Stack<String> books = new Stack<String>();
        Queue<String> newOrder = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four book titles.");
        for (int i = 1; i <= 4; i++) {
            System.out.print("Book " + i + ": ");
            String book = sc.nextLine();
            books.push(book);
        }
        sc.close();
        System.out.println();
        System.out.println("New order of books:");
        while (!books.isEmpty()) {
            String book = books.pop();
            newOrder.add(book);
        }
        System.out.println(newOrder.toString());
    }
}