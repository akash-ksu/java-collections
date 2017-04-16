package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {

        Product defaultProduct = new Product(-1, "Default Product", 100.0f);
        Map<Integer, Product> idToProduct = new HashMap<Integer, Product>();
        Product window = new Product(1, "Window", 50.0f);
        Product door = new Product(2, "Door", 35.0f);
        Product frame = new Product(3, "frame", 15.0f);

        idToProduct.put(window.getId(), window);
        idToProduct.put(door.getId(), door);
        idToProduct.put(frame.getId(), frame);

//        Set<Integer> ids = idToProduct.keySet();
//        ids.forEach(System.out::println);
//        ids.remove(window.getId());
//
//        ids.forEach(System.out::println);
//        System.out.println(idToProduct);
//
//        Collection<Product> values = idToProduct.values();
//        values.forEach(System.out::println);
//        values.remove(door);
//
//        System.out.println(ids);
//        System.out.println(values);
//        System.out.println(idToProduct);
//
//        Set<Map.Entry<Integer, Product>> entries = idToProduct.entrySet();
//        for(Map.Entry<Integer, Product> entry : entries) {
//            System.out.println("Key is : " + entry.getKey() + " value is : " + entry.getValue());
//            }


        BiFunction<Integer, Product, Product> biFunction = (k , v) -> new Product(k, v.getName(), v.getWeight() + 10);
        idToProduct.replaceAll(biFunction);
        System.out.println(idToProduct);
    }

}

