import org.w3c.dom.css.ElementCSSInlineStyle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list  = new ArrayList<>(); // creating arraylist
        list.add("Banana"); // adding objects to arraylist
        list.add("Apple");
        list.add("Mango");
        list.add("Grapes");
        System.out.println("list is\n"+list);
//        traversing through arraylist using iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println("Iterating the loop using iterator\n"+iterator.next());
        }
//        iterating usig for each loop
        System.out.println("Iterating using foreach loop\n");
        for (String k: list) {
            System.out.println(k);

        }
        System.out.println("Returning elements at index\n"+list.get(2));
        System.out.println("Changing the element at certain index");
        list.set(2,"Dates");
        System.out.println("Changed mango at index 2 to Dates");
        for (String Fruits:list){
            System.out.println(Fruits);
        }
//        sorting arraylist
        Collections.sort(list);
        System.out.println("Sorted list");
        for (String s: list){
            System.out.println(s);
        }
        System.out.println("Traversing through the list using listIterator");// here elements iterates in reverse order
        ListIterator<String> it = list.listIterator(list.size());
        while (it.hasPrevious()){
            String str = it.previous();
            System.out.println(str);
        }
    }
}
