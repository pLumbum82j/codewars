package ru.codewars.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Hello world!");
        List<Human> humans = asList(
                new Human("Sam", asList("Buddy", "Lucy")),
                new Human("Bob", asList("Frankie", "Rosie")),
                new Human("Marta", asList("Simba", "Tilly")));

        List<String> petNames = humans.stream()
                .map(Human::getPets).flatMap(Collection::stream).collect(Collectors.toList());

        //преобразовываем Stream<Human> в Stream<List<Pet>>
        //.flatMap(pets -> pets.stream())//"разворачиваем" Stream<List<Pet>> в Stream<Pet>
        // .collect(Collectors.toList());

        System.out.println(petNames); // output [Buddy, Lucy, Frankie, Rosie, Simba, Tilly]


        Human h1 = new Human("iVan", asList("Buddy", "Lucy"));
        Human h2 = (Human) h1.clone();
        System.out.println(h1==h2);
        System.out.println(h1);
        System.out.println(h2);
    }

}