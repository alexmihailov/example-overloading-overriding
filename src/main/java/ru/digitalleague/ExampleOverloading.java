package ru.digitalleague;

import ru.digitalleague.calculator.Calculator;
import ru.digitalleague.calculator.Operator;
import ru.digitalleague.forms.Circle;
import ru.digitalleague.forms.Drawing;
import ru.digitalleague.forms.Rectangle;
import ru.digitalleague.people.Person;

import java.util.Random;

public class ExampleOverloading {

    public static void main(String[] args) {
        exampleOverloading();
        exampleStaticOverloading();
        exampleConstructorOverloading();
    }

    private static void exampleOverloading() {
        Calculator calculator = new Calculator();
        Random random = new Random();
        calculator.calc(random.nextInt(), random.nextInt(), Operator.MINUS);
        calculator.calc(random.nextInt(), Operator.PLUS, random.nextInt());
        calculator.calc(Operator.PLUS, random.nextInt(), random.nextInt());
        calculator.calc(random.nextLong(), random.nextLong(), Operator.MINUS);
        calculator.calc(random.nextLong(), Operator.DIVIDE, random.nextLong());
        calculator.calc(random.nextFloat(), random.nextFloat(), Operator.MULTIPLY);
        calculator.calc(random.nextDouble(), Operator.DIVIDE, random.nextDouble());

        calculator.calc(Integer.valueOf(random.nextInt()), Operator.PLUS, Integer.valueOf(random.nextInt()));
        calculator.calc(random.nextInt(), Operator.PLUS);

        System.out.println(calculator.getHistoryForPrint());
    }

    private static void exampleStaticOverloading() {
        Circle circle = new Circle(5);
        Rectangle square = new Rectangle(10, 10);
        Rectangle rectangle = new Rectangle(10, 50);
        System.out.println("Draw circle:");
        Drawing.draw(circle);

        System.out.println("Draw square:");
        Drawing.draw(square);

        System.out.println("Draw rectangle:");
        Drawing.draw(rectangle);
    }

    private static void exampleConstructorOverloading() {
        Person alex = new Person("Alex Mihailov");
        Person viktor = new Person("Viktor", "Kravtsov");
        System.out.println(alex.say());
        System.out.println(viktor.say());
    }
}
