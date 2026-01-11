import java.util.*;

public class Main {

    static void display(HashMap<String, Double> map) {
        System.out.println("\nGrades:");
        map.forEach((name, grade) ->
            System.out.println(name + " => " + grade)
        );
    }

    public static void main(String[] args) {
        HashMap<String, Double> grades = new HashMap<>();

        // Insert grades
        grades.put("Ali", 15.0);
        grades.put("Sara", 18.0);
        grades.put("Omar", 12.0);

        display(grades);

        // Increase a student's grade
        grades.put("Ali", grades.get("Ali") + 2);
        display(grades);

        // Delete a student
        grades.remove("Omar");
        display(grades);

        // Size
        System.out.println("Size: " + grades.size());

        // Average, min, max
        double sum = 0, min = Double.MAX_VALUE, max = Double.MIN_VALUE;

        for (double g : grades.values()) {
            sum += g;
            min = Math.min(min, g);
            max = Math.max(max, g);
        }

        double avg = sum / grades.size();
        System.out.println("Average = " + avg);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

        // Check if 20 exists
        boolean has20 = grades.containsValue(20.0);
        System.out.println("Contains 20? " + has20);
    }
}
