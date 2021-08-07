import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>(); //creating hashset
//        adding elements to the hashset
        hs.add("hanson");
        hs.add("kibet");
        hs.add("sang");
//        traversing through the set
        Iterator<String> iterator = hs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()); // remeber it does'nt maintain order of any kind
        }
        System.out.println("Hashset ignores duplicates");
        hs.add("kibet"); //trying to add duplicate element
        Iterator<String> iterator1 = hs.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next()); // ignores the duplicate
        }
    }

}
