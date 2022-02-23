package ru.digitalleague;

import ru.digitalleague.people.Person;
import ru.digitalleague.people.Student;

public class ExampleOverriding {

    public static void main(String[] args) {
        exampleInstanceMethods();
        exampleStaticMethods();
    }

    private static void exampleInstanceMethods() {
        Person viktor = new Person("Viktor Kravtsov");
        Student alex = new Student("Alex Mihailov");
        System.out.println(viktor.say());
        System.out.println(alex.say());
        System.out.println(alex.think());
    }

    private static void exampleStaticMethods() {
        Student alex = new Student("Alex Mihailov");
        Person person = alex;
        System.out.println(Person.reverseName(alex));
        System.out.println(Student.reverseName(alex));
        System.out.println(person.say());
    }
 }
