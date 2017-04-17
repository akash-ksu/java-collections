package generics;

import lombok.Data;

@Data
public class SortPair<T extends Comparable<T>> {
    private T left;
    private T right;

    public SortPair(T first, T second) {
        int order = first.compareTo(second);
        if (order < 0) {
            left = first;
            right = second;
        } else {
            left = second;
            right = first;
        }
    }
}
