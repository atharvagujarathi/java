import java.util.*;

public class hashmap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Rohit", 45);
        map.put("Dhoni", 07);
        map.put("Virat", 18);

        System.out.println(map);

        if (map.containsKey("Rohit")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println("Key is " + e.getKey() + " and the value is " + e.getValue());
            System.out.println(e);

        }

        map.remove("Rohit");

        System.out.println(map);

    }
}

// put()
// getValue()
// getkey()
// containsKey()
// containsValue()
// remove()
// Map.Entry<Integer, Integer> e : map.entryset();
// Size() : returns number of key value pair
// clear() : removes all entry