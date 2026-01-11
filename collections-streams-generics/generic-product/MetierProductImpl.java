import java.util.ArrayList;
import java.util.List;

public class MetierProductImpl implements IMetier<Product> {

    private List<Product> products = new ArrayList<>();

    @Override
    public void add(Product p) {
        products.add(p);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product findById(long id) {
        for (Product p : products) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }

    @Override
    public void delete(long id) {
        products.removeIf(p -> p.getId() == id);
    }
}
