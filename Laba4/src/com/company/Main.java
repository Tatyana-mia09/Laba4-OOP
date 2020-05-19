package com.company;

import javax.crypto.spec.PSource;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        SortedSet<Person> set = new TreeSet<>();
        MySortedSet<Person> set1 = new MySortedSet<>();

        Person p = new Person(12);

        set1.add(p);
        System.out.println(set1);
        p = new Person(9);
        set1.add(p);
        System.out.println(set1);

        System.out.println(set1.last());





    }
}
