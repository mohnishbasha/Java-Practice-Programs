/*

In some situations, you may not want to change a class and make it comparable. In such cases, Comparator can be used
if you want to compare objects based on certain attributes/fields. For example, 2 persons can be compared based on
`height` or `age` etc. (this can not be done using comparable.)

The method required to implement is compare(). Now let's use another way to compare those TV by size. One common use of
Comparator is sorting. Both Collections and Arrays classes provide a sort method which use a Comparator.

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class HDTVComparator {

    private int size;
    private String brand;

    public HDTV(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

class SizeComparator implements Comparator<HDTV> {
    @Override
    public int compare(HDTV tv1, HDTV tv2) {
        int tv1Size = tv1.getSize();
        int tv2Size = tv2.getSize();

        if (tv1Size > tv2Size) {
            return 1;
        } else if (tv1Size < tv2Size) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        HDTV tv1 = new HDTV(55, "Samsung");
        HDTV tv2 = new HDTV(60, "Sony");
        HDTV tv3 = new HDTV(42, "Panasonic");

        ArrayList<HDTV> al = new ArrayList<HDTV>();
        al.add(tv1);
        al.add(tv2);
        al.add(tv3);

        Collections.sort(al, new SizeComparator());
        for (HDTV a : al) {
            System.out.println(a.getBrand());
        }
    }
}


/*
3. When to use Which?

        In brief, a class that implements Comparable will be comparable, which means it instances can be compared with
        each other.

        A class that implements Comparator will be used in mainly two situations: 1) It can be passed to a sort method,
        such as Collections.sort() or Arrays.sort(), to allow precise control over the sort order and 2) It can also be
        used to control the order of certain data structures, such as sorted sets (e.g. TreeSet) or sorted maps (e.g.,
        TreeMap).

        For example, to create a TreeSet. We can either pass the constructor a comparator or make the object class
        comparable.



*/

// Approach 1 - TreeSet(Comparator comparator)
class Dog {
    int size;

    Dog(int s) {
        size = s;
    }
}

class SizeComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog d1, Dog d2) {
        return d1.size - d2.size;
    }
}

public class ImpComparable {
    public static void main(String[] args) {
        TreeSet<Dog> d = new TreeSet<Dog>(new SizeComparator()); // pass comparator
        d.add(new Dog(1));
        d.add(new Dog(2));
        d.add(new Dog(1));
    }
}

// Approach 2 - Implement Comparable

class Dog implements Comparable<Dog>{
    int size;

    Dog(int s) {
        size = s;
    }

    @Override
    public int compareTo(Dog o) {
        return o.size - this.size;
    }
}

public class ImpComparable {
    public static void main(String[] args) {
        TreeSet<Dog> d = new TreeSet<Dog>();
        d.add(new Dog(1));
        d.add(new Dog(2));
        d.add(new Dog(1));
    }
}