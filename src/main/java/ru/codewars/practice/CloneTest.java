package ru.codewars.practice;

import java.util.ArrayList;
import java.util.List;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        SS1 ss11 = new SS1(1, new Igor());
        SS1 ss12 = (SS1) ss11.clone();
        ss11.s.i = 33;
        ss11.s.setZnach(1);
        ss11.s.setZnach(2);
        ss12.s.setZnach(44);

        System.out.println(ss11 + " " + ss12);
        System.out.println(ss11.s == ss12.s);

        SS2 ss21 = new SS2(1, new Igor());
        SS2 ss22 = ss21.clone();
        ss22.s.i = 44;
        ss21.s.setZnach(1);
        ss21.s.setZnach(2);
        ss21.s.setZnach(3);

        System.out.println(ss21 + " " + ss22);
        System.out.println(ss21.s == ss22.s);
    }
}


class SS1 implements Cloneable {
    int i;
    Igor s;

    public SS1(int i, Igor s) {
        this.i = i;
        this.s = s;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "SS1{" +
                "i=" + i +
                ", s=" + s +
                '}';
    }
}

class SS2 implements Cloneable {
    int i;
    Igor s;

    public SS2(int i, Igor s) {
        this.i = i;
        this.s = s;
    }

    @Override
    protected SS2 clone() {
        SS2 clone = new SS2(i, new Igor());
        return (SS2) clone;
    }

    @Override
    public String toString() {
        return "SS2{" +
                "i=" + i +
                ", s=" + s +
                '}';
    }
}

class Igor {
    int i = 22;
    private final  List<Integer> inter = new ArrayList<>();

    void setZnach(Integer i) {
        inter.add(i);
    }

    @Override
    public String toString() {
        return "Igor{" +
                "i=" + i +
                ", inter=" + inter +
                '}';
    }
}