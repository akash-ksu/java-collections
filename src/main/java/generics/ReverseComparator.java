package generics;

import java.util.Comparator;

public class ReverseComparator<T> implements Comparator<T> {

    private Comparator<T> innerComparator;

    public ReverseComparator(Comparator<T> innerComparator) {
        this.innerComparator = innerComparator;
    }

    @Override
    public int compare(T o1, T o2) {
        return -1 * innerComparator.compare(o1, o2);
    }
}
