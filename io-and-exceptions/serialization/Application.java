import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        MetierProduitImpl service = new MetierProduitImpl();
        Scanner sc = new Scanner(System.in);

        service.getAll(); // load from file

        int choice;

        do {
            System.out.println("\n1. Display products");
            System.out.println("2. Search product");
            System.out.println("3. Add product");
            System.out.println("4. Delete product");
            System.out.println("5. Save products");
            System.out.println("6. Exit");
            System.out.print("Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    service.getAll().forEach(System.out::println);
                    break;

                case 2:
                    System.out.print("ID: ");
                    long id = sc.nextLong();
                    System.out.println(service.findById(id));
                    break;

                case 3:
                    System.out.print("ID: ");
                    long pid = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Brand: ");
                    String brand = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Stock: ");
                    int stock = sc.nextInt();

                    service.add(new Product(pid, name, brand, price, "", stock));
                    break;

                case 4:
                    System.out.print("ID: ");
                    long did = sc.nextLong();
                    service.delete(did);
                    break;

                case 5:
                    service.saveAll();
                    break;
            }

        } while (choice != 6);
    }
}

