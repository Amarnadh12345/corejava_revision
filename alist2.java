// Write a Java program to insert an element into the array list at the first position.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class alist2 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("red");
        arr.add("blue");
        arr.add("green");
        arr.add("white");
        arr.add("yellow");

        arr.add(0, "violet");
        arr.add(6, "skyblue");
        System.out.println(arr);

        // Write a Java program to update an array element by the given element.

        arr.set(6,"lightgreen");
        System.out.println(arr);

        // Write a Java program to remove the third element from an array list.
        arr.remove(2);
        System.out.println(arr);

        // Write a Java program to search for an element in an array list.
        if(arr.contains("red")){
        System.out.println("Found");
        }
        else{
        System.out.println("not found");
        }

        // Write a Java program to sort a given array list.

        Collections.sort(arr);
        System.out.println(arr);

        // Write a Java program to copy one array list into another.

        List<String> List1 = new ArrayList<String>();
        List1.add("1");
        List1.add("2");
        List1.add("3");
        List1.add("4");
        // System.out.println("List1: " + List1);
        List<String> List2 = new ArrayList<String>();
        List2.add("A");
        List2.add("B");
        List2.add("C");
        List2.add("D");
        System.out.println("List1 before copying of List2 :" + List1);
        Collections.copy(List1, List2);
        System.out.println("List1 after copying of List2 :" + List1);

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

        // Write a Java program to compare two array lists.
        // Storing the comparison output in ArrayList<String>

        ArrayList<String> ar = new ArrayList<>();
        for(String s:List1){
        ar.add(List2.contains(s)?"yes":"NO");
        }
        System.out.println(ar);

        // write a java program to swap two elements in an arraylist
        Collections.swap(List1, 0, 3);
        System.out.println(List1);

        // Write a Java program to join two array lists.

        ArrayList<String> ar1 = new ArrayList<>();
        ar1.addAll(List1);
        ar1.addAll(List2);
        System.out.println(ar1);

        // // Write a Java program to clone an array list to another array list.
        ArrayList<Integer> ar1 = new ArrayList<>();
        ar1.add(1);
        ar1.add(2);
        ar1.add(3);
        ar1.add(4);

        ArrayList<Integer> newar1 =(ArrayList<Integer>)ar1.clone();
        System.out.println(newar1);

        // Write a Java program to empty an array list.
        ar1.removeAll(ar1);
        System.out.println(ar1);

        wite a java prgram to check wether the arraylist is empty or not

        System.out.println(ar1.isEmpty());

        // write a java program for trimming the capacity of an array list

        ar1.trimToSize();
        System.out.println(ar1);
        System.out.println(ar1.size());


        // Write a Java program to increase an array list size.
        ar1.ensureCapacity(6);

        // Write a Java program to replace the second element of an ArrayList with the specified element.
        ar1.set(1,200);
        System.out.println(ar1);

        // Write a Java program to print all the elements of an ArrayList using the elements' position.

        for(int i=0;i<ar1.size();i++){
            System.out.print(" "+ar1.get(i));
        }

    }

}