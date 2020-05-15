package com.company;

public class Main {

    public static void main(String[] args) {

        Person vika = new Person();
        vika.displayAge();
        vika.displayName();

        Person tolik = new Person();
        tolik.displayName();
        tolik.displayAge();

        Person vasya = new Person();
        vasya.displayName();
        vasya.displayAge();
    }
}
class Person {
    String name;
    int age;

    Person() {
    }
    Person(String n){

        name = n;
    }

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void displayName() {
        System.out.println(name);
    }

    void displayAge() {
        System.out.println(age);
    }

}
