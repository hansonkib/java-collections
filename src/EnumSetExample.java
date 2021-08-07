import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumSetExample {
    enum days{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        FRIDAY,
        SATURDAY
    }

    public static void main(String[] args) {
        Set<days> set = EnumSet.of(days.TUESDAY,days.WEDNESDAY);
        Iterator<days> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Set<days> set1 = EnumSet.allOf(days.class);
        System.out.println("List of all days in the week");
        System.out.println(set1);
        System.out.println("none of the days in the week");
        Set<days> set2 = EnumSet.noneOf(days.class);
        System.out.println(set2);
    }
}
