import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first group verb: ");
        String verbe = sc.nextLine().toLowerCase();

        if (!verbe.endsWith("er")) {
            System.out.println("This is not a first group verb.");
            return;
        }

        String radical = verbe.substring(0, verbe.length() - 2);

        System.out.println("➔ je " + radical + "e");
        System.out.println("➔ tu " + radical + "es");
        System.out.println("➔ il/elle " + radical + "e");
        System.out.println("➔ nous " + radical + "ons");
        System.out.println("➔ vous " + radical + "ez");
        System.out.println("➔ ils/elles " + radical + "ent");
    }
}

