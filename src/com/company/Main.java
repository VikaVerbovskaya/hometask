package com.company;

public class Main {

    public static void main(String[] args) {

        Person vika = new Person();
        vika.displayAge();
        vika.displayName();

        Person tolik = new Person("Tolik");
        tolik.displayName();

        Person vasya = new Person("Vasya", 34);
        vasya.displayName();
        vasya.displayAge();
    }
}

class Person {
    String name;
    int age;

    Person() {
        name = "Petya";
        age = 27;
    }
    Person(String n){
        n = name;
    }

    Person(String n, int a) {
        n = name;
        a = age;
    }

    void displayName() {
        System.out.println(name);
    }

    void displayAge() {
        System.out.println(age);
    }

}
