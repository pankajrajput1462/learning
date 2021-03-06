package collections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapComparatorByValue {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("A", 99.5);
        map.put("B", 7.4);
        map.put("C", 6.4);
        map.put("D", 67.3);

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
        //for reverse
        System.out.println("<->");
        map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(System.out::println);

    }
}
