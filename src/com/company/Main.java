package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        NameComparator nameComparator = new NameComparator();
        AgeComparator ageComparator = new AgeComparator();

        Comparator<Person> comparator = nameComparator.thenComparing(ageComparator);

        TreeSet<Person> people = new TreeSet<>(comparator);

        people.add(new Person("Scarlet", 21));
        people.add(new Person("Mirlan", 33));
        people.add(new Person("Bill", 93));
        people.add(new Person("Jack", 21));
        people.add(new Person("Lucie", 54));
        people.add(new Person("Robbin", 21));
        people.add(new Person("Azamat", 21));
        people.add(new Person("Azamat", 23));
        people.add(new Person("Rob", 30));
        people.add(new Person("Rob", 21));
        System.out.println(people.size());

        printList(people);

        Person person = people.first();
        System.out.println("First on the list: " + person.getName() + " " + person.getAge());
        person = people.last();
        System.out.println("Last on the list: " + person.getName() + " " + person.getAge());

        person = new Person("Misha", 87);
        people.add(person);
        printList(people);

        System.out.println("TailSet:");
        printList(people.tailSet(person));

        System.out.println("HeadSet:");
        printList(people.headSet(person));

        System.out.println("SubSet:");
        printList(people.subSet(new Person("Azamat", 23), false, person, false));

    }

    public static void printList(Collection<Person> list) {
        System.out.println("_______________________");
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            System.out.println(p.getName() + " " + p.getAge());
        }
    }
}
