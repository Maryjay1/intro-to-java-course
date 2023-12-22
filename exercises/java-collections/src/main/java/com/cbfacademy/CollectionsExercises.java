package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(8);
        list1.add(2);
        list1.add(9);
        list1.add(2);

        // Index + number to be added
        list1.add(2, 4);

        //  // invoke built-in element() method on the list and print the result
        System.out.print(list1.get(2));
        // TODO: create an empty linked list
        //  - add 4 as the first element of the list
        //  - then add 5, 6, 8, 2, 9 to the list
        //  - add another 2 as the last element of the list
        //  - add 4 as the 3rd element of the list
        //  - invoke the method element() on the list and print the result on the screen
        //  - return the list
        return list1;
    }

    public Stack<Integer> useStack() {
        Stack<Integer> newStack = new Stack<>();
        newStack.add(5);
        newStack.add(6);
        newStack.add(8);
        newStack.add(9);
        // TODO: create an empty stack
        //  - add 5, 6, 8, 9 to the stack
        //  - print the first element of the stack on the screen
        System.out.print( newStack.firstElement());

        //  - print the last element of the stack on the screen
        System.out.print(newStack.lastElement());

        //  - invoke the method pop() on the stack and print the result on the screen
        int poppedElement = newStack.pop();
        System.out.print(poppedElement);

        //  - invoke the push(4) method on the stack
        newStack.push(4);

        //  - return the stack
        return newStack;

    }

    public ArrayDeque<Integer> useArrayDeque() {

        // TODO: create an empty arrayDeque
        ArrayDeque<Integer> myDeque = new ArrayDeque<>();

        //  - add 5, 6, 8, 9 to the queue
        myDeque.add(5);
        myDeque.add(6);
        myDeque.add(8);
        myDeque.add(9);
        //  - print the first element of the queue on the screen
        System.out.print(myDeque.peekFirst());

        //  - print the last element of the queue on the screen
        System.out.print(myDeque.peekLast());

        //  - invoke the method poll() on the queue and print the result on the screen
        int polledElement = myDeque.poll();
        System.out.print(polledElement);
        //  - invoke the element() method on the queue and print the result on the screen
        int firstElement = myDeque.element();
        System.out.print(firstElement);
        //  - return the queue
        return myDeque;

    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        HashMap<Integer,String> myHash = new HashMap<>();
        //  - add {1, TypeScript} entry to the map
        myHash.put(1, "TypeScript");
        //  - add {2, Kotlin} entry to the map
                myHash.put(2, "Kotlin");

        //  - add {3, Python} entry to the map
                myHash.put(3, "Python");

        //  - add {4, Java} entry to the map
                myHash.put(4, "Java");

        //  - add {5, JavaScript} entry to the map
                myHash.put(5, "JavaScript");

        //  - add {6, Rust} entry to the map
                myHash.put(6, "Rust");

        //  - determine the set of keys from the map and print it on the screen
        Set<Integer> keys = myHash.keySet();

        System.out.print(keys);

        //  - determine the set of values from the map and print it on the screen
        Collection<String> values = myHash.values();

        System.out.print(values);

        //  - determine whether the map contains "English" as a language and print the result on the screen
        boolean containsEnglish = myHash.containsValue("English");
        System.out.println(containsEnglish);


        //  - return the map
        return myHash;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
