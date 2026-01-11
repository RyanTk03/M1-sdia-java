public class Main {

    public static void main(String[] args) {

        // Integer storage
        GenericStorage<Integer> intStorage = new GenericStorage<>();
        intStorage.addElement(10);
        intStorage.addElement(20);
        intStorage.addElement(30);

        System.out.println("Integers:");
        intStorage.display();

        // String storage
        GenericStorage<String> stringStorage = new GenericStorage<>();
        stringStorage.addElement("Java");
        stringStorage.addElement("Python");

        System.out.println("\nStrings:");
        stringStorage.display();

        // Double storage
        GenericStorage<Double> doubleStorage = new GenericStorage<>();
        doubleStorage.addElement(12.5);
        doubleStorage.addElement(8.3);

        System.out.println("\nDoubles:");
        doubleStorage.display();

        // Test operations
        System.out.println("\nGet element index 1 (String): " + stringStorage.getElement(1));
        intStorage.removeElement(0);
        System.out.println("\nAfter removing index 0 from integers:");
        intStorage.display();
    }
}
