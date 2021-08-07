import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(78);
        list.add(55);
        list.add(632);
        list.add(72);
        System.out.println("whole list\n"+ list);
        System.out.println("The max in the list is\n"+Collections.max(list));
        System.out.println("The Min in the list is \n"+Collections.min(list));
    }
}
