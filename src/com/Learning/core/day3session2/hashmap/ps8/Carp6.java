package com.Learning.core.day3session2.hashmap.ps8;

import java.util.Objects;

public class Carp6 implements Comparable<Carp6> {

    private String name;
    private double price;

    public Carp6(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carp6 car = (Carp6) o;
        return Double.compare(price, car.price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Carp6 otherCar) {
        // descending order by price
        return Double.compare(this.price, otherCar.price) * -1;
    }
}

