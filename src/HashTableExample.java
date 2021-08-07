import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(1,"hanson");
        ht.put(102,"kibet");
        ht.put(104,"Sang");
        for (Map.Entry m : ht.entrySet()){
            System.out.println(m.getKey()+"\t"+m.getValue());
        }
//        removing value at a key
        ht.remove(1);
        System.out.println("after removing");
        System.out.println(ht);
//        adding default value if its not found
        System.out.println(ht.getOrDefault(102,"Not found"));
        System.out.println(ht.getOrDefault(107,"Not found"));
        System.out.println(ht.getOrDefault(104,"not found"));
    }
}
