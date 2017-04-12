package common;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String name;
    private float weight;

    @Override
    public String toString() {
        return "Product - " + name + " : " + weight;
    }
}
