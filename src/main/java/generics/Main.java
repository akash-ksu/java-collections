package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person akash = new Person("akash", 28);
        Person megha = new Person("megha", 22);
        Person ramanth = new Person("ramnath", 56);
        Person ranjana = new Person("ranjana", 52);

        List<Person> family = new ArrayList<>();
        Collections.addAll(family,akash, megha, ramanth, ranjana);

        System.out.println(family);

        System.out.println("---------------------------------------");

        System.out.println("Sorting family in ascending order of age");
        Collections.sort(family, new AgeComparator());

        System.out.println(family);

        System.out.println("---------------------------------------");

        System.out.println("Sorting family in descending order of age");
        Collections.sort(family, new ReverseComparator<>(new AgeComparator()));

        System.out.println(family);

        System.out.println("-----------------------------------------");

        SortPair<Integer> pair1 = new SortPair<>(1, 2);
        System.out.println(pair1.getLeft());
        System.out.println(pair1.getRight());

        SortPair<Integer> pair2 = new SortPair<>(2, 1);
        System.out.println(pair2.getLeft());
        System.out.println(pair2.getRight());

    }
}
