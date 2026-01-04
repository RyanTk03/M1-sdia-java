import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nb_occurrences = new int[26];

        System.out.print("Enter a line of text (max 100 characters): ");
        String ch = sc.nextLine().toLowerCase();

        for (int i = 0; i < ch.length(); i++) {
            char c = ch.charAt(i);
            if (c >= 'a' && c <= 'z') {
                nb_occurrences[c - 'a']++;
            }
        }

        System.out.println("The string \"" + ch + "\" contains :");
        for (int i = 0; i < 26; i++) {
            if (nb_occurrences[i] > 0) {
                char letter = (char) ('A' + i);
                System.out.println(nb_occurrences[i] +
                        " occurrence(s) of the letter '" + letter + "'");
            }
        }
    }
}

