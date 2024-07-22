
// Write a Java program to create an array list, add some colors (strings) and print out the collection
import java.util.*;

class alist {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("red");
        arr.add("blue");
        arr.add("green");
        arr.add("white");
        arr.add("yellow");

        // using for loop
        System.out.println("using for loop");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        // using iterator
        Iterator it = arr.iterator();
        System.out.println("using iterator");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}