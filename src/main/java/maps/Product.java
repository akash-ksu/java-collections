package maps;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private float weight;

    @Override
    public String toString() {
        return "Product - "+ id + " : " + name + " : " + weight;
    }
}
