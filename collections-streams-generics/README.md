# Java Lab -- Collections and Streams

## Part 1 - Collections & Streams

### Exercise 1 - Lists (Product Management)

#### Problem

Create a Java application to manage a list of products:

-   Create a `Product` class with `id`, `name`, and `price`.
-   Store products in an `ArrayList`.
-   Allow adding, deleting, modifying, displaying, and searching
    products by name.

#### Solution

Products are stored in an `ArrayList<Product>`.

``` java
ArrayList<Product> products = new ArrayList<>();
products.add(new Product(1, "Laptop", 1200));
products.add(new Product(2, "Phone", 800));
```

Search by name is done using a loop and string comparison.

### Exercise 2 - Maps (Student Grades)

#### Problem

Use a `HashMap<String, Double>` to store student grades and perform
operations:

-   Insert, update, delete grades
-   Display size
-   Compute average, max, min
-   Check if a grade equals 20

#### Solution

Grades are stored in a `HashMap`.

``` java
HashMap<String, Double> grades = new HashMap<>();
grades.put("Ali", 15.0);
grades.put("Sara", 18.0);
```

Statistics are computed using loops over `values()`.

### Exercise 3 - Sets (Groups)

#### Problem

Use two `HashSet<String>` to store students in Group A and Group B.
Display the intersection and union.

#### Solution

``` java
HashSet<String> groupA = new HashSet<>();
HashSet<String> groupB = new HashSet<>();

groupA.add("Ali");
groupB.add("Ali");
```

Intersection is obtained with `retainAll`, and union with `addAll`.

## Part 2 - Generics

### Exercise 1 - Generic Storage

#### Problem

Create a generic class `GenericStorage<T>` that:

-   stores elements of any type in a `List`,
-   allows adding, removing, and retrieving elements,
-   allows checking the size of the list.

Then create an `Application` class to test the generic class with
different types: `Integer`, `String`, and `Double`.

#### Solution

-   A **generic class** `GenericStorage<T>` is created.
-   The elements are stored in a `List<T>`.

``` java
private List<T> elements = new ArrayList<>();
```

``` java
public void addElement(T o) {
    elements.add(o);
}
```

``` java
public void removeElement(int index) {
    if (index >= 0 && index < elements.size())
        elements.remove(index);
}
```

``` java
public T getElement(int index) {
    if (index >= 0 && index < elements.size())
        return elements.get(index);
    return null;
}
```

### Exercise 2 - Product Management

#### Problem

Create a product management system using generics with a menu.

#### Solution

A generic interface and implementation are used to manage Product
objects.

``` java
public interface IMetier<T> {
    void add(T o);
    List<T> getAll();
    T findById(long id);
    void delete(long id);
}
```

``` java
public class Product {
    private long id;
    private String name;
    private String brand;
    private double price;
    private String description;
    private int stock;
}
```
