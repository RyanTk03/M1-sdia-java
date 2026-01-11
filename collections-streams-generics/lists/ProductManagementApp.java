import java.util.*;

public class ProductManagementApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();

        // Add products
        products.add(new Product(1, "Laptop", 1200));
        products.add(new Product(2, "Phone", 800));
        products.add(new Product(3, "Tablet", 400));

        // Display products
        System.out.println("All products:");
        products.forEach(System.out::println);

        // Delete by index
        products.remove(1);

        System.out.println("\nAfter deletion:");
        products.forEach(System.out::println);

        // Modify a product
        Product p = products.get(0);
        p.setPrice(1100);

        System.out.println("\nAfter modification:");
        products.forEach(System.out::println);

        // Search by name
        System.out.print("\nEnter product name to search: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (Product prod : products) {
            if (prod.getName().equalsIgnoreCase(name)) {
                System.out.println("Found: " + prod);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Product not found");
        }
    }
}
