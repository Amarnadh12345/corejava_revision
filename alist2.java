// Write a Java program to insert an element into the array list at the first position.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class alist2 {
    public static void main(String[] args) {
        // ArrayList<String> arr = new ArrayList<>();
        // arr.add("red");
        // arr.add("blue");
        // arr.add("green");
        // arr.add("white");
        // arr.add("yellow");

        // arr.add(0, "violet");
        // arr.add(6, "skyblue");
        // System.out.println(arr);

        // // Write a Java program to update an array element by the given element.

        // arr.set(6,"lightgreen");
        // System.out.println(arr);

        // // Write a Java program to remove the third element from an array list.
        // arr.remove(2);
        // System.out.println(arr);

        // // Write a Java program to search for an element in an array list.
        // if(arr.contains("red")){
        // System.out.println("Found");
        // }
        // else{
        // System.out.println("not found");
        // }

        // // Write a Java program to sort a given array list.

        // Collections.sort(arr);
        // System.out.println(arr);

        //Write a Java program to copy one array list into another.

        List<String> List1 = new ArrayList<String>();
        List1.add("1");
        List1.add("2");
        List1.add("3");
        List1.add("4");
        System.out.println("List1: " + List1);
        List<String> List2 = new ArrayList<String>();
        List2.add("A");
        List2.add("B");
        List2.add("C");
        List2.add("D");
        System.out.println("List1 before copying of List2 :"+List1);
        Collections.copy(List1,List2);
        System.out.println("List1 after copying of List2 :"+List1);

        // Write a Java program to shuffle elements in an array list.
        System.out.println("List1 before shuffling :"+List1);
        Collections.shuffle(List1);
        System.out.println("List1 after shuffling :"+List1);

        // Write a Java program to reverse elements in an array list.
        System.out.println("List2 before reversing :"+List2);
        Collections.reverse(List2);
        System.out.println("List1 after reversing :"+List2);


        // Write a Java program to extract a portion of an array list.
        List<String> st = List2.subList(0, 2);
        System.out.println(st);

        




    }

}