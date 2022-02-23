package ru.digitalleague.people;

public class Person {

    protected final String fullName;

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public Person(String firstName, String secondName, String middleName) {
        this(firstName + " " + secondName + " " + middleName);
    }

    public Person(String firstName, String secondName) {
        this(firstName + " " + secondName);
    }

    public String say() {
        return "Hello, I'm human and my name is " + fullName + ".";
    }

    protected String think() {
        return fullName + " thinks about the future.";
    }

    private String walk() {
        return fullName + " goes to the gym.";
    }

    public static String reverseName(Person person) {
        String reverse = new StringBuilder(person.fullName).reverse().toString();
        return "[PERSON]: " + reverse;
    }
}
