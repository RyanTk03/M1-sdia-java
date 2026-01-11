import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashSet<String> groupA = new HashSet<>();
        HashSet<String> groupB = new HashSet<>();

        // Add students
        groupA.add("Ali");
        groupA.add("Sara");
        groupA.add("Omar");

        groupB.add("Sara");
        groupB.add("Rayane");
        groupB.add("Omar");

        // Intersection
        HashSet<String> intersection = new HashSet<>(groupA);
        intersection.retainAll(groupB);

        System.out.println("Intersection: " + intersection);

        // Union
        HashSet<String> union = new HashSet<>(groupA);
        union.addAll(groupB);

        System.out.println("Union: " + union);
    }
}
