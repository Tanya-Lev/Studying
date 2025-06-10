package org.example.l7objects.entity;

public class Cat {
    private String name;
    private int age;
    private int weight;
    private int strength;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean fight(Cat cat) {
        if (this.weight > cat.weight && this.strength > cat.strength)
            return true;
        else if (this.strength == cat.strength && this.weight > cat.weight)
            return true;
        else if (this.age > cat.age)
            return true;
        else return false;
    }
}
