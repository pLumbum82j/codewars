package ru.codewars.practice;

import java.util.List;

public class Human {
    private final String name;
    private final List<String> pets;

    public Human(String name, List<String> pets) {
        this.name = name;
        this.pets = pets;
    }

    public List<String> getPets() {
        return pets;
    }
}
