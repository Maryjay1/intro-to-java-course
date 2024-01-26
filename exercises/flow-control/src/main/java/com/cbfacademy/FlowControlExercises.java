package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that

        //  it creates a list where for each element of the input list ${numbers}
        List<String> fizzBuzzList = new ArrayList<>();

        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
        for (int element : numbers){
            if (element % 3 == 0 && element % 5 == 0) {
                fizzBuzzList.add("FizzBuzz");
            }
        
            else if (element % 3 == 0) {
                fizzBuzzList.add("Fizz");
        }
                //  - if the ${element} is divisible by 5, it adds “Buzz” to the list

                //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
        else if (element % 5 == 0) {
            fizzBuzzList.add("Buzz");
        }
                //  - it adds the element to the list in any other case

        else {
            fizzBuzzList.add(Integer.toString(element));
        }
    }
            //  - it returns the constructed list

        return fizzBuzzList;

    }
        
        

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        //need to have months that = to numbers and any number outside of that will be invalid
        //create a variable for the month / create an array
        if (number >= 1 && number <= 12) {
            // Array to store month names
            String[] months = {
                    "January", "February", "March", "April",
                    "May", "June", "July", "August",
                    "September", "October", "November", "December"
            };
            return months[number - 1];
        } else {
            // Return "Invalid month number" for invalid input
            return "Invalid month number";
        }
    }
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"

    

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        List<Integer> numberList = new ArrayList<>();
        Map<String, Integer> result = new HashMap<>();

        for (int i = 1; i <= 100; i++) {
            numberList.add(i);
        }
        //  - determines the sum of all the even numbers in the list


        // Map<String, Integer> result = new HashMap<>();
        int evenSum = 0;
        int oddSum = 0;
    
        for (int number : numberList) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
    
        //  - determines the sum of all the odd numbers in the list
        result.put("SumOfEvens", evenSum);
        result.put("SumOfOdds", oddSum);

        return result;
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        
    }




        public static ArrayList<Integer> reverse(ArrayList<Integer> numbers) {
         
    
            ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 4, 7, 8, 11, 13, 17));
            ArrayList<Integer> list2 = new ArrayList<>(List.of(1, 2, 3, 5, 9, 15, 21, 30, 35));
            ArrayList<Integer> list3 = new ArrayList<>(List.of(123, -5, 0, 1890, 20, 30));
            ArrayList<Integer> list4 = new ArrayList<>(List.of(213, 54, 91, 187, 2001, 2023));
    
         
    
            Collections.reverse(list1);
            Collections.reverse(list2);
            Collections.reverse(list3);
            Collections.reverse(list4);


        // System.out.println("Reversed List 1: " + list1);
        // System.out.println("Reversed List 2: " + list2);
        // System.out.println("Reversed List 3: " + list3);
        // System.out.println("Reversed List 4: " + list4);
        Collections.reverse(numbers);
        return numbers;
    
        }
        
    
        public static void main(String[] args) {
            // Example usage
            ArrayList<Integer> result = reverse(null);  // Pass your input list here
            System.out.println(result);
        }
    
    

    

    public String getName() {
        return "Flow Control Exercises";
    }
}
