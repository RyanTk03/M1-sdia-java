import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String path = sc.nextLine();

        File dir = new File(path);

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Invalid directory.");
            return;
        }

        File[] files = dir.listFiles();

        if (files == null) {
            System.out.println("Empty directory.");
            return;
        }

        for (File f : files) {

            String type = f.isDirectory() ? "<DIR>" : "<FILE>";

            String r = f.canRead() ? "r" : "-";
            String w = f.canWrite() ? "w" : "-";
            String h = f.isHidden() ? "h" : "-";

            System.out.println(
                f.getAbsolutePath() + " " +
                type + " " +
                r + w + h
            );
        }
    }
}

