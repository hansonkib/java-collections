import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("C");
        list.add("Core java");
        list.add("Advanced java");
        System.out.println("Initial collection is"+list);
        Collections.addAll(list,"Servlet","JSP");
        System.out.println("after adding elements\n"+list);
        String[] array = {"C#",".Net"};
        Collections.addAll(list,array);
        System.out.println("After adding array\n"+list);
        System.out.println("finding maximum\n"+Collections.max(list));
    }
}
