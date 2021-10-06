package org.launchcode.java.ch03Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        int sum = 0;
        String sumString = "";

        // create a list with at least 10 integers
        ArrayList<Integer> lstNumbers = new ArrayList<>();
        for (int value = 0; value < 10; value++){
            lstNumbers.add(value);
        }

        // Call getEvenNumberSum method on the list
        sum = getEvenNumberSum(lstNumbers);

        // Build sumString
        for (int index = 0; index < lstNumbers.size(); index++){
            if(lstNumbers.get(index) % 2 == 0){
                sumString += lstNumbers.get(index);

                if((index < lstNumbers.size() - 1) && (lstNumbers.get(index + 1) % 2 != 0)){
                    sumString += " + ";
                }
            }
        }

        // Print out values and sum
        System.out.println(sumString + " = " + sum);

        String myString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them " +
                "in a house. I will not eat them with a mouse.";

        // Remove commas and periods from myString
        myString = myString.replace('.',Character.MIN_VALUE).replace(',', Character.MIN_VALUE);

        // Create a list of words
        ArrayList<String> lstWords = new ArrayList<>();
        lstWords.addAll(List.of(myString.split(" ")));

        printWords(lstWords);
    }

    public static void printWords(ArrayList<String> lstWords){
        // print out each word in a list that has exact number of letters provided by user

        int letterCount;
        Scanner input = new Scanner(System.in);
            System.out.println("Number of letters?");
            letterCount = input.nextInt();
        input.close();

        System.out.println(letterCount + " LETTER WORDS");
        for(String word : lstWords){
            if(word.length() == letterCount){
                System.out.println(word);
            }
        }

    }
    public static int getEvenNumberSum(ArrayList<Integer> lstNumbers) {
        /* This method will calculate and return the sum of all the even numbers in an ArrayList
            IN: ArrayList<Integer> lstNumbers
            OUT: int
        */

        int sum = 0;

        // iterate through list
        for(int number : lstNumbers){
            if (number % 2 == 0){
                // if number is even add value to sum
                sum += number;
            }
        }

        // return sum
        return sum;
    }
}
