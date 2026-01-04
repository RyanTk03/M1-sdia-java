import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "";
        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Enter a string");
            System.out.println("2. Display a string");
            System.out.println("3. Inverse a string");
            System.out.println("4. Count words");
            System.out.println("0. Quit");
            System.out.print("What is your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the string: ");
                    text = sc.nextLine();
                    break;

                case 2:
                    System.out.println("String: " + text);
                    break;

                case 3:
                    String reversed = new StringBuilder(text).reverse().toString();
                    System.out.println("Inversed string: " + reversed);
                    break;

                case 4:
                    String trimmed = text.trim();
                    if (trimmed.isEmpty()) {
                        System.out.println("Number of word : 0");
                    } else {
                        String[] words = trimmed.split("\\s+");
                        System.out.println("Number of words: " + words.length);
                    }
                    break;

                case 0:
                    System.out.println("Program ended.");
                    continue;

                default:
                    System.out.println("Your choice is not valid.");
            }

            System.out.println("Press any key to return to the menu.");
            sc.nextLine();

        } while (choice != 0);
    }
}

