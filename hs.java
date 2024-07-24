import java.util.*;

public class hs {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Write a Java program to append the specified element to the end of a hash
        // set.
        HashSet<Integer> hset = new HashSet<Integer>();
        hset.add(1);
        hset.add(2);
        hset.add(3);
        hset.add(4);
        hset.add(5);

        // Write a Java program to iterate through all elements in a hash list.

        Iterator<Integer> it = hset.iterator();
        while(it.hasNext()){
        System.err.print(" "+it.next());
        }

        // Write a Java program to get the number of elements in a hash set.

        System.out.println(hset.size());

        // Write a Java program to empty an hash set.

        hset.removeAll(hset);
        System.out.println(hset);

        // Write a Java program to test if a hash set is empty or not

        System.out.println(hset.isEmpty());

        // Write a Java program to clone a hash set to another hash set.

        HashSet<Integer> hs1 = new HashSet<>();
        hs1 = (HashSet)hset.clone();

        // Write a Java program to convert a hash set to an array.

        Integer[] arr = new Integer[hset.size()];
        hset.toArray(arr);
        for(int i=0;i<arr.length;i++){
        System.err.print(" "+arr[i]);
        }

        // Write a Java program to convert a hash set to a tree set.

        TreeSet<Integer> ts = new TreeSet<Integer>(hset);
        System.out.println(ts);

        // Write a Java program to convert a hash set to a List/ArrayList.

        ArrayList<Integer> ar1 = new ArrayList<Integer>(hset);
        System.out.println(ar1);

        // Write a Java program to compare two sets and retain elements that are the same.

        HashSet<Integer> hset1 = new HashSet<Integer>();
        hset1.add(1);
        hset1.add(2);
        hset1.add(0);
        hset1.add(9);
        hset.retainAll(hset1);
        System.out.println(hset);
  

        // Write a Java program to remove all elements from a hash set.

        hset.clear();
        System.out.println(hset);

    }
}


// fourth push
