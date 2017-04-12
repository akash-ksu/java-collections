package common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Product door = new Product("door", 75);
        Product bed = new Product("bed frame", 55);
        Product window = new Product("window", 35);

        Collection<Product> products = new ArrayList<Product>();
        products.add(door);
        products.add(bed);
        products.add(window);
        System.out.println(products);

        // Using for each
        for (Product product : products) {
            System.out.println(product.getName());

            // Illegal to modify the array at the same time
            // products.add(door);
        }

        Iterator<Product> productIterator = products.iterator();
        while (productIterator.hasNext()) {
            Product product = productIterator.next();
            if (product.getWeight() > 50) {
                System.out.println("Product : " + product.getName() + " is heavier than 50");
            } else {
                productIterator.remove();
            }
        }

        System.out.println(products);
    }
}
