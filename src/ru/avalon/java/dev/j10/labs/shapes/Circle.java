package ru.avalon.java.dev.j10.labs.shapes;

import java.util.Random;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */

public class Circle implements Point {

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    private float x;
    private float y;

    public Circle() {
        this.x = getX();
        this.y = getY();
    }

    public float getX() {
        Random random = new Random();
        float x = random.nextInt(5) + 1;
        return x;
    }

    public float getY() {
        Random random = new Random();
        float y = random.nextInt(5) + 1;
        return y;
    }

    public float getArea() {
        float radius = (float) Math.sqrt(x*x + y*y);
        return (float) (2*radius*Math.PI);
    }
}
