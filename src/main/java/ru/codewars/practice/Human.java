package ru.codewars.practice;

import java.util.List;

public class Human implements Cloneable{
    private  String name;
    private  List<String> pets;

    public Human(String name, List<String> pets) {
        this.name = name;
        this.pets = pets;
    }

    public List<String> getPets() {
        return pets;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", pets=" + pets +
                '}';
    }
}
