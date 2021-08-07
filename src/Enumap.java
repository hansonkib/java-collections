import java.util.EnumMap;
import java.util.Map;

public class Enumap {
    public enum Days{
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday
    }

    public static void main(String[] args) {
        EnumMap<Days,String> dateMap = new EnumMap<Days, String>(Days.class);
        dateMap.put(Days.Monday,"1");
        dateMap.put(Days.Tuesday,"2");
        dateMap.put(Days.Wednesday,"3");
        dateMap.put(Days.Thursday,"4");
        dateMap.put(Days.Friday,"5");
        dateMap.put(Days.Saturday,"6");
        dateMap.put(Days.Sunday,"7");
        for (Map.Entry m: dateMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
