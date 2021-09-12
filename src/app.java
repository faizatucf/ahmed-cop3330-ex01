/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Faiz Ahmed
 */

import java.util.*;

class hello
{
    public static void main(String[] args)
    {
        String name, output;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?"); // asking user for input
        name = sc.nextLine(); // accepting user input 
        output = String.format("Hello, %s, nice to meet you!", name); // Formatting string 
        System.out.println(output); // displaying output. 
    }
}
