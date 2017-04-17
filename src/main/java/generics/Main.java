package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person akash = new Person("akash", 28);
        Person megha = new Person("megha", 22);
        Person ramanth = new Person("ramnath", 56);
        Person ranjana = new Person("ranjana", 52);
        Person baby = new Person("some", 12);

        List<Person> family = new ArrayList<>();
        Collections.addAll(family, akash, megha, ramanth, ranjana, baby);

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

        System.out.println("------------------------------------------");

        Person youngestPerson = min(family, Comparator.comparing(Person::getAge));

        System.out.println("Youngest person is : " + youngestPerson);

    }

    private static <T> T min(List<T> family, Comparator<T> ageComparator) {
        if (family.isEmpty()) {
            throw new IllegalArgumentException("there has to be atleast one member in the family");
        }

        T smallest = family.get(0);

        for (int i = 1; i < family.size(); i++) {
            T current = family.get(i);
            if (ageComparator.compare(current, smallest) < 0) {
                smallest = current;
            }
        }

        return smallest;
    }
}
