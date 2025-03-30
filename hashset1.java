import java.util.*;

public class hashset1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Rohit");
        set.add("Dhoni");
        set.add("Virat");
        set.add("Virat");

        System.out.println(set);

        if (set.contains("Rohit")) {
            System.out.println("okay");
        } else {
            System.out.println("no");
        }

        for (String player : set) {
            System.out.println(player);
        }

        System.out.println(set.size());

    }
}

// add()
// contains()
// isEmpty
// clear()
// Iterator()
// remove()