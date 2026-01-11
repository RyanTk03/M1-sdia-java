import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MetierProductImpl service = new MetierProductImpl();
        Scanner scanner = new Scanner(System.in);

        // Initial data
        service.add(new Product(1, "Laptop", "HP", 8000, "Office laptop", 10));
        service.add(new Product(2, "Phone", "Samsung", 5000, "Smartphone", 20));

        int choice;

        do {
            System.out.println("\n1. Display products");
            System.out.println("2. Search product by ID");
            System.out.println("3. Add product");
            System.out.println("4. Delete product");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    service.getAll().forEach(System.out::println);
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    long id = scanner.nextLong();
                    Product p = service.findById(id);
                    System.out.println(p != null ? p : "Not found");
                    break;

                case 3:
                    System.out.print("ID: ");
                    long pid = scanner.nextLong();
                    scanner.nextLine();
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Stock: ");
                    int stock = scanner.nextInt();

                    service.add(new Product(pid, name, brand, price, "", stock));
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    long did = scanner.nextLong();
                    service.delete(did);
                    break;
            }

        } while (choice != 5);
    }
}
