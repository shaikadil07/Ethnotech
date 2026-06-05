import java.util.*;
public class IdCollection{
    public static void main(String[] args) {
        Set<Integer> ids = new HashSet<>();
        ids.add(101);
        ids.add(102);
        ids.add(103);
        ids.add(104);
        System.out.println("Set: " + ids);
        System.out.println("Contains 102? " + ids.contains(102));
        ids.remove(103);
        System.out.println("After remove: " + ids);
        System.out.println("Size: " + ids.size());
        System.out.println("Is Empty? " + ids.isEmpty());
        ids.clear();
        System.out.println("After clear: " + ids);
    }
}