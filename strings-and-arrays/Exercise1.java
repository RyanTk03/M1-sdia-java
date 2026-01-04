import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		double[] grades = null;
        int n = 0;

        System.out.print("Number of students: ");
		n = sc.nextInt();
        grades = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Grade of student " + (i + 1) + " : ");
            grades[i] = sc.nextDouble();
        }

        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        double average = sum / n;
        System.out.println("Average: " + average);

        Arrays.sort(grades);
        System.out.println("\nSorted grades : " + Arrays.toString(grades));

        System.out.println("Minimum grade : " + grades[0]);
        System.out.println("Maximum grade : " + grades[n - 1]);

        System.out.print("\nEnter a grade to search : ");
        double search = sc.nextDouble();

        int count = 0;
        for (double g : grades) {
            if (g == search) {
                count++;
            }
        }
        System.out.println("Number of students with the grade " + search + " : " + count);
    }
}

