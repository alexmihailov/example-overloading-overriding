package ru.digitalleague.forms;

public final class Drawing {

    private Drawing() {
        // nothing
    }

    public static void draw(Circle circle, char symbol) {
        for (int i = -circle.getRadius(); i <= circle.getRadius(); i++) {
            for (int j = -circle.getRadius(); j <= circle.getRadius(); j++) {
                if (i*i + j*j <= circle.getRadius()*circle.getRadius()) {
                    System.out.print(symbol + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public static void draw(Circle circle) {
        draw(circle, '*');
    }

    public static void draw(Rectangle rectangle, char symbol) {
        for (int i = 0; i < rectangle.getHeight(); i++) {
            for (int j = 0; j < rectangle.getWidth(); j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    public static void draw(Rectangle rectangle) {
        draw(rectangle, '*');
    }
}
