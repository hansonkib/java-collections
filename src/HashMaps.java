import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
//        creating hashmap
        HashMap<Integer,String> hs = new HashMap<>();
//        adding elements into hashmap
        hs.put(1,"Apple");
        hs.put(2,"Mango");
        hs.put(3,"Banana");
        hs.put(4,"grapes");
//        traversing through the map
        for (Map.Entry hp : hs.entrySet()){
            System.out.println(hp.getKey()+"\t"+hp.getValue());
        }
        hs.put(1,"Dates");// trying to add duplicate key(it will replace the value of that key with new value added)
        System.out.println("iterating through the new hashMap after addind duplicate key");
        for (Map.Entry map : hs.entrySet()){
            System.out.println(map.getKey()+"\t"+map.getValue());
        }
    }
}
