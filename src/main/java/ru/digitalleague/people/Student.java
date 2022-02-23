package ru.digitalleague.people;

public class Student extends Person {

    public Student(String fullName) {
        super(fullName);
    }

    public Student(String firstName, String secondName, String middleName) {
        super(firstName, secondName, middleName);
    }

    public Student(String firstName, String secondName) {
        super(firstName, secondName);
    }

    @Override
    public String say() {
        return super.say() + " I am a student.";
    }

    @Override
    public String think() {
        return super.think() + " But the student is thinking about food.";
    }

    public static String reverseName(Person person) {
        String reverse = new StringBuilder(person.fullName).reverse().toString();
        return "[STUDENT]: " + reverse;
    }
}
