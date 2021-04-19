package Test;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class LRUCache {
    Map<Integer, String> map;
    LinkedList<Integer> order;
    Integer capacity;

    LRUCache(Integer capacity) {
        this.map = new LinkedHashMap<>();
        this.order = new LinkedList<>();
        this.capacity = capacity;
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);
        cache.put(1, "1");
        cache.put(2, "2");
        cache.put(3, "3");
        cache.display();
        System.out.println(cache.get(1));
        cache.display();
        cache.put(4, "4");
        cache.display();
    }

    public void display() {
        System.out.println("elements:");
        for (Map.Entry<Integer, String> it : map.entrySet()) {
            System.out.println(it.getKey() + ":" + it.getValue());
        }
    }

    public void put(Integer key, String value) {
        if(capacity ==  map.size()){
            Integer last =order.removeFirst();
            map.remove(last);
        }
        order.add(key);
        map.put(key, value);
    }

    public String get(Integer key) {
        if(order.contains(key)){
            order.remove(key);
            String value = map.get(key);
            map.remove(key);
            map.put(key, value);
            order.add(key);
        }
        return map.get(key);
    }
}