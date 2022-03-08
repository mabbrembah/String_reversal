package com.datastructures;
import java.util.Scanner;
import java.util.Stack;

public class Stringreversal {
    // string reversal using the Stack data structure
    public static void main(String[] args) {

        Stack<Character> wordToBeReversed = new Stack<>();

        //take user input
        System.out.println("Enter a word to be reversed\n");
        Scanner scanner = new Scanner(System.in);
        String wordFromUser = scanner.next();

        for (int i = 0; i<=(wordFromUser.length()-1); i++) {
            wordToBeReversed.push(wordFromUser.charAt(i));
        }
        //reverse the word
        while ((wordToBeReversed.isEmpty()) == false){
            System.out.print(wordToBeReversed.pop());
        }
    }

}
