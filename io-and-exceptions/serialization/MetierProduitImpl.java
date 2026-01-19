import java.io.*;
import java.util.*;

public class MetierProduitImpl implements IProduitMetier {

    private List<Product> products = new ArrayList<>();
    private String fileName = "products.dat";

    @Override
    public void add(Product p) {
        products.add(p);
    }

    @Override
    public List<Product> getAll() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            products = (List<Product>) ois.readObject();
        } catch (Exception e) {
            System.out.println("No file found, starting empty.");
        }
        return products;
    }

    @Override
    public Product findById(long id) {
        for (Product p : products)
            if (p.getId() == id) return p;
        return null;
    }

    @Override
    public void delete(long id) {
        products.removeIf(p -> p.getId() == id);
    }

    @Override
    public void saveAll() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(products);
            System.out.println("Products saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

